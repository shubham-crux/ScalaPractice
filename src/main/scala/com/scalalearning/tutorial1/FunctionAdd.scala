package com.scalalearning.tutorial1

object FunctionAdd {

  def main(args: Array[String]): Unit = {

    println("Ths sum of a and b is"+functionToADD(5,3))

    def functionToADD(a : Int, b: Int): Int = {

      var s = a + b
      return s

    }
  }

}
