package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // 1 + 2 is an expression. Expressions evaluate to a value, statements do not.
  println(x)

  println(2 + 4 * 5 + (3 - 4)) // A math expression. Scala preserves math operator precedence (BIDMAS)

  // Arithmetic Operators

  val a: Int = 10
  val b: Int = 3
  println("--Arithmetic Operators--")
  println(a + b) // Addition
  println(a - b) // Subtraction
  println(a * b) // Multiplication
  println(a / b) // Division
  println(a % b) // Modulo

}
