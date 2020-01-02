# SparkDataFrameMail
Example of How to send Spark DataFrame as a Report in Mail

**To send DataFrame as a report in Mail**

We can send a DataFrame as a report in Mail. To sending Mail using Spark, you will required [**Scala-Spark-Mail**](https://github.com/NikhilSuthar/Scala-Spark-Mail) library.

Steps:
*  Download Spark-Scala-Mail Jar from [here](https://github.com/NikhilSuthar/Scala-Spark-Mail/tree/master/Jar).
*  Add external Jar dependecies in Module. For more details check [Readme](https://github.com/NikhilSuthar/Scala-Spark-Mail)
*  Below is sample code exmaple for sending DataFrame in the mail,just for reference.

     https://github.com/NikhilSuthar/SparkDataFrameMail/blob/master/src/main/scala/com/spark/util/SparkMail.scala
      
  <h3>Example of Spark DataFrame Mail</h3> 
  
   **Input Dataframe**
           
                                    +---+---------------+---+------+-------------------+
                                    |Id |Name           |Age|Salary|City               |
                                    +---+---------------+---+------+-------------------+
                                    |100|Stewart Pickett|70 |0129  |Mönchengladbach    |
                                    |101|Patrick Nunez  |45 |0878  |Santo Domingo      |
                                    |102|Acton Huffman  |23 |0572  |Kielce             |
                                    |103|Barclay Preston|53 |0224  |Turriaco           |
                                    |104|Ferris Walton  |49 |0279  |Trento             |
                                    |105|Travis Hinton  |68 |0053  |Autelbas           |
                                    |106|Carlos Hanson  |25 |0177  |Nodebais           |
                                    |107|Orson Lester   |58 |0490  |Parramatta         |
                                    |108|Phelan Cruz    |21 |0290  |Blankenfelde-Mahlow|
                                    |109|Calvin Mitchell|44 |0908  |Pirna              |
                                    |110|Duncan Rivers  |34 |0480  |Bafra              |
                                    +---+---------------+---+------+-------------------+
                           
   **Output in Mail**
     
   ![Dataframe Report](https://github.com/NikhilSuthar/SparkExample/blob/master/src/main/Test/output/mail.jpeg)
 


<h2>How to Use Code:</h2>

* Clone or Download repository.
* Open it in IDE and compile using command `sbt clean assembly`
* Run below command with parameter and Jar Path

`spark-submit  --class com.spark.example.Main /.../Spark_DataFrame_Mail.jar "/../input.csv" "/../application.conf"`

<h4>Sample Data</h4>

 [Input File](https://github.com/NikhilSuthar/SparkDataFrameMail/blob/master/src/main/Test/input/input.csv)
 
 [application.conf](https://github.com/NikhilSuthar/SparkDataFrameMail/blob/master/src/main/resources/application.conf)
