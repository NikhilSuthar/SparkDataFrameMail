import sbt._
import Keys._
import sbtassembly.MergeStrategy

name := "SparkDataFrameMail"
version := "0.1"
scalaVersion := "2.11.12"
val sparkVersion = "2.4.3"

libraryDependencies ++= Seq(

  "com.typesafe" % "config" % "1.3.3",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

unmanagedBase := baseDirectory.value/"libs"

val defaultMergeStrategy: String => MergeStrategy = {
  case m if m.toLowerCase.endsWith("manifest.mf") => MergeStrategy.discard
  case m if m.startsWith("META-INF") => MergeStrategy.discard
  case PathList("javax", "servlet", xs@_*) => MergeStrategy.last
  case PathList("org", "apache", xs@_*) => MergeStrategy.last
  case PathList("org", "jboss", xs@_*) => MergeStrategy.last
  case "log4j.properties" => MergeStrategy.discard
  case "about.html" => MergeStrategy.rename
  case "reference.conf" => MergeStrategy.concat
  case _ => MergeStrategy.last
}

scalacOptions += "-deprecation"
mainClass in assembly := Some("com.spark.mail.Email")
test in assembly := {}
assemblyMergeStrategy in assembly := defaultMergeStrategy
assemblyJarName in assembly :="Spark_DataFrame_Mail.jar"