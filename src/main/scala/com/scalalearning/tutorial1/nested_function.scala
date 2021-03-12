package com.scalalearning.tutorial1

object nested_function {

  def main(args: Array[String]): Unit = {
    println("Min and Max from 5 & 7 is")
    minandmax(5,7)
  }
  def minandmax(a : Int, b:Int)= {
    def minValue()={
      if(a<b){
        println("Min is: "+a)

      }
      else{
        println("Min is: "+b)
      }
    }
    def maxValue()={
      if(a>b){
        println("Max is: "+a)

      }
      else{
        println("Max is: "+b)
      }
    }
    minValue()
    maxValue()

  }
}
