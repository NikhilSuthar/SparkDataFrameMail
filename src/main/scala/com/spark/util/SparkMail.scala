package com.spark.util

import com.spark.mail.Email
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkMail {

  def Mail(Path:String,ConfPath:String): Unit = {

    val spark: SparkSession = SparkSession.builder().appName("Spark Mail Job").master("local[*]").getOrCreate()

    val df = spark.read.format("csv").option("header", "true").load(Path)

    df.show(false)
    val msg = createHtmlEmailBody(df)
    val obj = new Email(ConfPath)
    obj.sendMail(msg, spark.sparkContext.applicationId, "", "R")
    spark.stop()
  }

  def createHtmlEmailBody(df: DataFrame): String = {

    val columnNames = df.columns.map(x => "<th>" + x.trim + "</th>").mkString
    val data = df.collect.mkString
    val data1 = data.split(",").map(x => "<td>".concat(x).concat("</td>"))
    val data2 = data1.mkString.replaceAll("<td>\\[", "<tr><td>")
    val data3 = data2.mkString.replaceAll("]\\[", "</td></tr><td>").replaceAll("]", "")

    val msg =
      s"""<!DOCTYPE html>
         |<html>
         |   <head>
         |      <style>
         |         table {
         |            border: 1px solid black;
         |         }
         |         th {
         |          border: 1px solid black;
         |          background-color: #FFA;
         |          }
         |         td {
         |          border: 1px solid black;
         |          background-color: #FFF;
         |          }
         |      </style>
         |   </head>
         |
         |   <body>
         |      <h1>Report</h1>
         |      <table>
         |         <tr> $columnNames </tr> $data3
         |      </table>
         |   </body>
         |</html>""".stripMargin

    msg
  }
}
