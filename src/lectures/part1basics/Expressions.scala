package lectures.part1basics

object Expressions extends App {

  // Statements (do something) vs Expressions (evaluate to something)
  // EVERYTHING IN SCALA IS AN EXPRESSION!!!!

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
  // Both && and || are short-circuit operators and will not need to evaluate both operands if the left-hand side can determine the result alone.


  // ASSIGNMENT OPERATORS
  println("--Assignment Operators--")
  var c: Int = 5
  println(c += 5) // This does add 5 to value c, but doesn't print it to 'run' - just empty brackets??????
  c += 5 // Adds 5 to the value c - changing a variable is a side effect
  println(c)

  // if in scala is an expression!




  // String interpolation examples
  val firstName = "John"
  val middleName = "S."
  val lastName =  "Smith"

  val fullName = s"$firstName $middleName $lastName"
  println(fullName)
  println(s"$firstName $middleName $lastName")




}


// Questions
// check line 42 - why doesn't this work ?
//what is 'run' in intellij - is it a terminal? Ruby just printed lines to the terminal directly
// What in scala is considered truthy / falsy? - does scala even have this?
