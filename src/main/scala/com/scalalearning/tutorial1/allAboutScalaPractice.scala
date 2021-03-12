package com.scalalearning.tutorial1

object allAboutScalaPractice {

  val myinfo =
    """{
      |"name" = "Shubham"
      |"height" = 5.10
      |"hobby" = "Playing chess"
      |}""".stripMargin
  println(myinfo)

  case class mobile( model : String , ram : Int)
  val mob = mobile("OnePlus",8)
  println(s"my fav mobile is ${mob.model} having ram of ${mob.ram} gb")


  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"
  println(leastFavoriteDonut)

  def main(args: Array[String]): Unit = {}
  val favdonut = "vanila one"
  println(s"my fav donus is $favdonut")
}
