package com.scalalearning.tutorial1

object allAboutScalaEx1 {
  def main(args: Array[String]): Unit = {
    val donutBoughtStr = "Vanilla Donut 10 2.25"
    val splitStr = donutBoughtStr.split(" ")
    val donutType = splitStr(0)
    val donutName = splitStr(1)
    val donutQty = splitStr(2).toInt
    val donutPrice = splitStr(3).toDouble
    val donutOutput =
      f"""
         |Donut Name: $donutType $donutName
         |Donut Price: $$$donutPrice
         |Donut Purchased: $donutQty
 """.stripMargin
    println(donutOutput)
  }
}
