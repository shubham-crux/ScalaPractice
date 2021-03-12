// Data Structures

//Tuples
// immutable lists

val captainStuff = ("Shaktiman", "Batman", "Spiderman")

println(captainStuff)

// refer to indexes and it starts with 1 and not 0

println(captainStuff._1)
println(captainStuff._3)

// key value pair mapping of key to value
val keyvalue = "Shubham" -> "Awesome"
println(keyvalue._1)

// different datatypes
val bunchStuff = ("Shubham", 1999, true)
println(bunchStuff)

//List , no mix data type, single linked list,

val heroList = List("Superman","Ironman","Hulk")

println(heroList)
//extract elements of it , it is 0 based


println(heroList.head) //first element
println(heroList.tail) // rest of the elements, little weird

for( hero <- heroList){ println(hero)}

// map to map all the elements of the list one by one
val backwardHero = heroList.map( (hero :String) => hero.reverse)

for(hero <- backwardHero){
  println(hero)
}

// reduce / to reduce all the elements and perform some actions over
val numberList = List(1,2,3,4,5)

// take 1 and 2 then add as 3 , then 3 n 3 add as 6 and so on
val add = numberList.reduce( (x : Int, y : Int) => x +y)
println(add)

//filter to filter some data in the list
val fiter5 = numberList.filter( (x : Int )=> x!=5)
println(fiter5)
//another easy way of doing it
val filter3 = numberList.filter(_ !=3)

//Concatenation of lists
val morenumber = List(6,7,8,9)

val lotsofnumbers = numberList ++ morenumber

val reversed = numberList.reverse

val sorted = reversed.sorted

val lotsofduplicates = numberList ++ numberList
val distinctvalues = lotsofduplicates.distinct

val mxvalue = lotsofnumbers.max
val has3 = filter3.contains(3)

// Maps (dictionarys)
val animaldict  = Map("Dog" -> "Bark", "Lions" -> "Roar", "Birds" -> "Chirp")
println(animaldict("Dog"))
println(animaldict.contains("Tiger"))
val getkeyfromvalue =animaldict.find(_._2 == "Chirp").map(_._1)
println(getkeyfromvalue)

val challengeList = List(1,2,3,4,5,6,7,8,9)
for( item <- challengeList){
  if(item% 3 ==0){println(item)}
}

val isdivisibleby3 = {
  challengeList.filter(_ %3 ==0)
}







