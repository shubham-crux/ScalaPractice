//functions

// format <function name>(parameter name: type) : return type = {expression}
// last expression gets returned implicitly

def  squareIt(x : Int) : Int = {
  x*x
}

def cubeIt( x : Int) : Int = { x*x*x }

println(squareIt(2))
println(cubeIt(5))

// functions takes functions

def transformIt( x: Int, f : Int => Int) : Double = {
  f(x)
}

val result = transformIt(2, cubeIt)
println(result)

// anonymous / lambda functions

val res = transformIt(4 , x => x*x*x/2)

transformIt(2, x => { val y = x*5 ;  y*y })

def UpperIt ( x : String ) : String = {
  x.toUpperCase
}

UpperIt("helloShubham")

def makeUpper( x :String , f : String => String ) : String ={
  f(x)
}

makeUpper("helloNakul", x => x.toUpperCase)


