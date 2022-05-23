package lectures.part1basics

object Functions extends App {

  // basic method
  def aFunction(a: String, b: Int): String = { // each parameter has a name and a type. The method will return a String type, which is the ': String' after the closed parentheses)
    a + " " + b
  }
  println(aFunction("hello", 3)) // calling a function is also an expression in Scala


  // Recursive function because it calls itself
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction(aString = "hello", n = 3))

  // In other programming languages you would normally use loops - in Scala / functional language you use recursive functions
  // WHEN YOU NEED LOOPS, USE RECURSION



  // You can define functions to return a Unit type, indicating it has side functions
  def aFunctionWithSideEffects(aString: String): Unit = {
    println(aString)
  }


  // Can define (and call) a function withing a function
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b // defining a function within a function

    aSmallerFunction(n, n-1) // aBigFunction calls aSmallerFunction
  }

  println(aBigFunction(5)) // return value of 9

}


// Questions
// 1. Why define a function within another function, why not just have two separate functions? - seems less complicated?
// EG:
//  def aSmallerFunction2(a: Int, b: Int): Int = a + b
//
//  def aBigFunction2(n: Int): Int = {
//    aSmallerFunction2(n, n-1) // aBigFunction calls aSmallerFunction
//  }
//
//  println(aBigFunction2(5)) // return value of 9