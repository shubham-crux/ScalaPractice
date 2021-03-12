package com.scalalearning.tutorial1


object anonymous_function {
  def main(args: Array[String]): Unit = {

    var myfct1 = (str1 : String, str2 : String) => str1 + str2
    var myfct2 = (_:String) + (_:String)

    println(myfct1("Hi"," Shubham" ))
    println(myfct1("Hi"," Nakul" ))
    println(myfct2("Hi"," Neha" ))
    println(myfct2("Hi"," Panku" ))
  }

}
