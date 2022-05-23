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


}
