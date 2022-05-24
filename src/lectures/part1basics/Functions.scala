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




  // Q&A
  // 1. Greeting function for kids - 2 params name and an age. will say "Hi, my name is xxxx" and I am age xxx years old."
  def greeting(name: String, age: Int): String = s"Hi, my name is ${name} and I am ${age} years old."
  println(greeting(name = "James", age = 12))

  // 2. Factorial function - computes product of all numbers up to a given number. - recursive func
  def factorialFunction(n: Int): Int = {
    if ( n <= 0) 1
    else n * factorialFunction(n - 1)
  }
  println(factorialFunction(n = 5))

  // 3. Fibonacci function
    // f(1) = 1
    // f(2) = 1
    // f(n) = f(n - 1) + f(n - 2)

  def fibonacciSequence(n: Int): Int = {
    if (n >= 1 && n <= 2) 1
    else fibonacciSequence(n - 1) + fibonacciSequence(n - 2)
  }

  println(fibonacciSequence(n = 8))



  // 4. Tests if a number is prime

  def primeNumber(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n / 2)
  }

  println(primeNumber(n = 11))

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