# SparkExample
Various Spark Examples

**To send DataFrame as a report in Mail**

We can send a DataFrame as a report in Mail. To sending Mail using Spark, you will required [**Scala-Spark-Mail**](https://github.com/NikhilSuthar/Scala-Spark-Mail) library.

Steps:
* 1. Download Spark-Scala-Mail Jar from [here](https://github.com/NikhilSuthar/Scala-Spark-Mail/tree/master/Jar).
* 2. Add external Jar dependecies in Module. For more details check [Readme](https://github.com/NikhilSuthar/Scala-Spark-Mail)
* 3. Below is sample code exmaple for sending DataFrame in the mail,just for reference.

      https://github.com/NikhilSuthar/SparkExample/blob/master/src/main/scala/com/spark/util/SparkMail.scala
      
  <h1>Example of Spark DataFrame Mail</h1> 
  
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
 


**Transpose of DataFrame**

