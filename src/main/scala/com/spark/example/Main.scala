package com.spark.example

import com.spark.util.SparkMail._
import org.apache.spark.internal.Logging

object Main extends Logging {

  def main(args: Array[String]): Unit = {
    var Path:String=""
    var ConfPath:String =""
    if (args.length == 0) {
      log.error("""******************Pass Help ("help") to know about Parameters****************""")
      Path = "src/main/Test/input/"
      ConfPath = "src/main/resources/application.conf"

    } else if (args(0).toLowerCase.trim == "help") {
      log.info("***************You can pass Two Parameters********************")
      log.info("Path of CSV File delimited by Comma")
      log.info("Path of application Conf file")
    } else if (args.length == 1){
      Path = args(0)
      ConfPath = "src/main/resources/application.conf"
    } else {
      Path = args(0)
      ConfPath = args(1)
    }
    Mail(Path,ConfPath)
        }
  }
