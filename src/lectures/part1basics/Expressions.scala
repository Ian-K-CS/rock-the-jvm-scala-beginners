package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // 1 + 2 is an expression. Expressions evaluate to a value, statements do not.
  println(x)

  println(2 + 4 * 5 + (3 - 4)) // A math expression. Scala preserves math operator precedence (BIDMAS)

  // ARITHMETIC OPERATORS
  val a: Int = 10
  val b: Int = 3
  println("--Arithmetic Operators--")
  println(a + b) // Addition
  println(a - b) // Subtraction
  println(a * b) // Multiplication
  println(a / b) // Division
  println(a % b) // Modulo

  // RELATIONAL OPERATORS
  println("--Relational Operators--")
  println(1 == "x") // Equal
  println(1 != "x") // Not equal
  println(5 > 1) // Greater than
  println(5 < 1) // Less than
  println(5 >= 5) // Greater or equal to
  println(3 <= 5) // Less than or equal to

  // LOGICAL OPERATORS
  println("--Logical Operators--")
  println(!true) // Not - reverses logic state
  println(false && false) // AND - returns true if both operands are Boolean true
  println(true || false) // OR returns true of one operand is Boolean true

}


// Questions
// What in scala is considered truthy / falsy?