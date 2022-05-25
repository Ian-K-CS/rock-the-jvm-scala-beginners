package lectures.part1basics

import java.time.LocalTime

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " - I first need factorial of " + (n - 1) + "at: " + LocalTime.now())
//      println(n)
      val result = n * factorial(n - 1) //scala needs a recursive call stack frame for each recursive step. That's why it can't do 5000 steps as the example below can!
      println("computed factorial of " + n + "at: " + LocalTime.now())
      result
    }
  }

  println(factorial(5))


// TAIL RECURSION = use recursive call as the LAST expression on each code path that it occurs
  def factHelper(x: Int, accumulator: BigInt): BigInt = {
    if (x <= 1) accumulator
    else factHelper(x - 1, x * accumulator) // writing factHelper here as the last expression of the code path. This allows Scala to preserve the same stack flame and not use additional stack frame for recursive calls
  }

  println(factHelper(x = 5000, accumulator = 1))


  // Q&A
  // 1. Concatenate a string n times
  def concatString(word: String, n: Int): String = {
    if (n == 1) word
    else word + " " + concatString(word, n - 1)
  }

  println(concatString(word = "Hi!", n = 5))
  // 2. isPrime function that is tail recursive
  // 3. Fibonacci function, tail recursive





}
