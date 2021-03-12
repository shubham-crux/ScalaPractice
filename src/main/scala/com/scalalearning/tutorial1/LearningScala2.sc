//flow control

//ifelse

if(1>3) println("impossible") else println("1 is less than 3")

// cases

val number = 34

number match {
    case 1 => println("One")
    case 2 => println("two")
    case 3 => println("Three")
    case _ => println("Something else")
}

// for loop

var squared = 0

for (i <- 1 to 4){
  squared = i * i
  println(squared)
}

var x = 10

while(x >= 0){
  println(x)
  x -= 1
}

x = 0
do { println(x) ; x=x+1 } while (x<=10)


// Expressions
// automatically returns the last thing in the expressions,
// even though it is not returned
{ val x = 10 ; x +20}

// exercise, print fibonacci series
// 0 1 1 2 3 5 8 13 21 34

var x = 0
var y = 1

println( x ,y)
for( z <- 1 to 8){
  var temp = x
  x = y
  y = temp + x
  print(" ",y)

}




