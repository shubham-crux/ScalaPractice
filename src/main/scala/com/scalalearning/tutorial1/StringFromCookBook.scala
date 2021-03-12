package com.scalalearning.tutorial1

object StringFromCookBook {

  def main(args: Array[String]): Unit = {

    // val means value it is immutable where as var mean variable and it is mutable.
    var s = "Hello, world!"
     s = s + "Hi"
    println(s)
    println(s.length)

    //printing each sequential character
    "shubham".foreach(println)

    //using the for loop for it
    for(c <- "NAKUL"){
      println(c)
    }

    //using filters on string
    val result = "Hello World".filter(_ != 'l' )
    println(result)

    //drop and take methods on string
    var res = "python".drop(3).take(3).capitalize
    println(res)

    //equality of the strings
    val s1 = "Hello"
    val s2 = "H" + "ello"

    val s3 = (s1 == s2)
    println(s3)

    val s4 = "Hello"
    val s5 = "h" + "ello"
    val s6 = (s4 == s5)
    println(s6)

    val s7 = (s4.toUpperCase  == s5.toUpperCase)
    println(s7)

    //multiline strings
    val multi =
      """This is a
        | multiline '' string
        | and this is very awesome
        |""".stripMargin
    println(multi)
    //splitting strings
    "hello world".split(" ").foreach(println)

    val str1 = "eggs, milk, butter, Coco Puffs"
    var str2 = str1.split(",").map(_.trim)
    println(str2)

  }


}
