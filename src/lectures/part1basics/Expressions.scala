package lectures.part1basics

object Expressions extends App {

  // Statements (do something) vs Expressions (evaluate to something)
  // Majority of things in scala are expressions, very few statements, like variable assignment and imports
  // side effects in scala normally return the type Unit

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
  println("\n--Relational Operators--")
  println(1 == "x") // Equal
  println(1 != "x") // Not equal
  println(5 > 1) // Greater than
  println(5 < 1) // Less than
  println(5 >= 5) // Greater or equal to
  println(3 <= 5) // Less than or equal to


  // LOGICAL OPERATORS
  println("\n--Logical Operators--")
  println(!true) // Not - reverses logic state
  println(false && false) // AND - returns true if both operands are Boolean true
  println(true || false) // OR returns true of one operand is Boolean true
  // Both && and || are short-circuit operators and will not need to evaluate both operands if the left-hand side can determine the result alone.


  // ASSIGNMENT OPERATORS
  println("\n--Assignment Operators--")
  var c: Int = 5
  println(c += 5)
  c += 5 // Adds 5 to the value c - changing a variable is a side effect
  println(c)



  // IF CONSTRUCTS
  // all types of if constructs in scala are an expression - NOT a statement!
  println("\n--if constructs--")
  // simple if expression
  val result1 = if (true) println("I will only print if true, 1")
  println(result1) // this will print, but it returns () because of println above which is also printed

  // it can also be written in a longer (ruby like) form
    if (true) {
      println("I will only print if true, 2")
    }

  // if/else expression
  val num: Float = 3.14f

  val ifResult: String = if (num.isInstanceOf[Float]) {
    "It's equal!"
  }
  else {
    "Not equal!"
  }
  println(ifResult)

  // if/else-if/else
  val num1 = 3
  val num2 = 1

  val result2 = if (num1 == num2) {
    s"num1: (${num1}) is equal to num2: (${num2})"
  } else if (num1 >= num2) {
   s"num1: (${num1}) is greater or equal to num2: (${num2})"
  } else {
    s"num1: (${num1}) is less than num2: (${num2})"
  }
  println(result2)


  // Scala doesn't require a ternary operator because you can save if expressions to variables
  val num3 = 1
  val num4 = 2
  val ternary = if (num3 == num4) s"num3: (${num3}) is equal to num4: (${num4})" else s"num3: (${num3}) doesn't equal num4: (${num4})"
  println(ternary)

  //LOOP CONSTRUCTS
  println("\n--Loop Constructs--")
  // NEVER USE LOOPS - THEY ARE SIDE EFFECTS!

  // while, do while and for
  // while will repeat until false

  // while loop example - they are side effects, it has a return value of Unit!
  var i = 0
  val whileLoop = while (i < 10) {
    println(s"loop ${i}")
    i += 1
  }
  println(whileLoop) // prints () which is Unit



  // CODE BLOCK
  println("\n--Code Block--")
  // a code block is between 2 curly brackets
  // code blocks are expressions
  // THE VALUE OF THE BLOCK IS THE LAST EXPRESSION IN THE BLOCK
  // CODEBLOCKS HAVE SCOPE, ANYTHING DEFINED WILL BE VISIBLE BY THE CODE BLOCK
  val aCodeBlock = {
    val y = 2
    val z =  y + 1
    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock) // returns the last expression in the block as mentioned above... in this case the String "hello"



  // Exercises
  // 1. Diff between "hello world" and println("hello world")
    // a. "hello world" is a String type, println("hello world") is a side effect (printing "hello world" to the console) and will have a return value () of Unit type
  // 2. Whats the value of..

  val someValue = {
    2 < 3
  }
  // a. Boolean type, return value true

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  // a. Int type, return value 42

}







// Questions
// check line 45 - why doesn't this work ?
// what is 'run' in intellij - is it a terminal? Ruby just printed lines to the terminal directly
// What in scala is considered truthy / falsy? - does scala even have this?
// when it comes to code blocks and variable scope - is it bad practice to name a variable used in a code block outside of said code block?
// code blocks have return type