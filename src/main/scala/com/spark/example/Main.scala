package com.spark.example

import com.spark.util.SparkMail._
import org.apache.spark.internal.Logging

object Main extends Logging {

  def main(args: Array[String]): Unit = {
    var Path:String=""
    var ConfPath:String =""
    if (args.length == 0) {
      log.info("***************Parameters Missing********************")
      log.info("***************Pass below parameter********************")
      log.info("Path of CSV File delimited by Comma")
      log.info("Path of application Conf file")
    } else if (args.length == 1){
      log.error("***************Please pass conf file path********************")
    } else {
      Path = args(0)
      ConfPath = args(1)
    }
    Mail(Path,ConfPath)
        }
  }
