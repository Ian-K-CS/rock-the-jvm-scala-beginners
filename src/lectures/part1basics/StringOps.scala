package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"


  // As Scala sits onto of the JVM. It has access to Java methods. These are all Java methods - you can tell by hovering the mouse over the meothd...
  // @ the bottom it says java.lang.String
  println(str.charAt(2)) // returns character at the index. String index starts at 0.
  println(str.substring(7, 11)) // returns a string from between the index delimiters
  println(str.split(" ").toList) // splits a string up based on argument. the .toList makes int print nicely as a list
  println(str.startsWith("Hel")) // checks a string starts with whatever characters you define as an argument. returns true / false
  println(str.replace(" ", "--")) // replaces characters in a string, with other character(s)
  println(str.toLowerCase()) // turns every letter in upper case to lower case
  println(str.toUpperCase()) // turns every letter in lower case to upper case
  println(str.length) // Int value of how many characters are in your string


  // Scala also has its own methods it can call...
  val aNumberString: String = "2"

  println(aNumberString.toInt) // converts a string to an integer
  println('a' +: aNumberString :+ 'b') // +: pre-appends to a string and :+ appends to a string. The string HAS to be done with single quotation marks
  println(str.reverse) // reverses the string
  println(str.take(2)) // Takes x number of characters out of a string. x being the argument passed in.


  // Scala-specific: String interpolators.

  // S-interpolators
  val name = "David"
  val age = 12

  //this is an S interpolated string. $ tells the compiler that the val name will be injected into the string
  val greeting = s"Hello, my name is $name and I am $age years old."
  println(greeting)
  // S interpolated strings can also evaluate expressions - need to put it in curly brackets
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old."
  println(anotherGreeting)


  // F-interpolators
  //They act as like S interpolators. PLUS they can also print print-f like formats.
  // In this case it prints the float to 15 characters total minimum (huge gap when you print the string) and to 2 decimal places precision
  val speed = 1.2f
  val statement = f"$name can eat $speed%15.1f burgers per minute"

  println(statement)


  // raw-interpolators
  // works like S interpolator. PLUS it performs no escaping of literals within the string.

  println(raw"This is a \n newline") // raw prints \n like normal characters. Doesn't create a new line
  val escaped = "This is a \n newline"
  println(raw"$escaped") // this will create a new line

}
