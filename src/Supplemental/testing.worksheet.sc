val result = if (true) println("I will always print")
println(result)
println("string")

"i am string"

val p = ()
val x: Unit = ()
val r = println()
val z = true
val l = List()


if (true) println("I will always print")


val result = if (true) "I will always print"
println(result)
println("string")







def aFunction(a: String, b: Int): String = {
  a + " " + b
}

println(aFunction("hello", 3))

val testst = println(aFunction("hello", 3))

println(testst)



// Factorial test
def recursiveTest(n: Int): Int = {
  if (n == 1) {
    n
  }
  else {
    println("im here " + n)
    n * recursiveTest(n - 1)
  }
}
  println(recursiveTest(5))


// Recursive hello function
def helloRecursion(aString: String, n: Int): String = {
  if (n == 1) aString
  else aString + " " + helloRecursion(aString, n - 1)
}

println(helloRecursion(aString = "Hello", n = 5))