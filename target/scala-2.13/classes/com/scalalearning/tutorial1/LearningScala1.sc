//Values are immutable constants.
 val hello : String = "Hola!"

// Variable are mutable.
var hellothere : String = hello

hellothere = hello + " There"

println(hellothere)

// Datatype

val number1 : Int = 1

val truth : Boolean = true

val letterA : Char = 'a'

val pie : Double = 3.1412

val pieSinglePrecision : Float = 3.14159265f

val bigNumber : Long = 1234567889

val smallNumber: Byte = 127

println("here is a mess " + truth + pie + letterA + smallNumber)

println(f"Pie is about $pieSinglePrecision%.3f")

println(f"0 padding on the left: $number1%05d")

println(s"I can use the s prefix to use variables like $number1 $truth $letterA")

println(s"s is not limited to only variables, expression can also be used 1+1= ${1+2}")

val answer : String  = " To life, the universe and everything is 42"

//regular expressions
val pattern = """.* ([\d]+).*""".r

val pattern(answerstring) = answer

val finalanswer = answerstring.toInt
println(finalanswer)

//Boolean

val isGreater = 1>2

val isLesser = 1<2

val andex = isGreater && isLesser

val orex = isGreater || isLesser

val picard : String  = "Picard"

val bestCaptain : String = "Picard"

val isbest : Boolean = picard == bestCaptain








 
