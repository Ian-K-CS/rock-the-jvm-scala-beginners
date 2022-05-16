package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42  // Explicitly stating that 42 is an Int, its not inferred by the compiler.
  println(x)
  // VALS ARE IMMUTABLE - works similar to constants but not regarded as constants to be re-used throughout the code.
  // More as an intermediate computations to later use in bigger computations.


  val y = 45 // Compiler can infer types. IE, it knows 45 is an Int - so you don't explicitly have to say what type the value is.
  println(y)


  // String type
  val aString: String = "hello this is a string"; // Scala doesnt require semi colons.
  val anotherString: String = "goodbye"
  println(aString)
  println(anotherString)


  // Boolean type
  val aBoolean: Boolean = true
  val anotherBoolean: Boolean = false
  println(aBoolean)
  println(anotherBoolean)


  // A single char
  val aChar: Char = 'a'
  println(aChar)


  // An integer - integers have a range of -2^31 to 2^31-1 (-2,147,483,647 to 2,147,483,647) (4 bytes)
  val anInt: Int = 2147483647
  println(anInt)


  // A short - shorts have a range of -32,768 to 32,767 (2 bytes)
  val aShort: Short = 32767
  println(aShort)


  // A Long (requires an 'L' at the end of the value) - longs have a range of -2^63 to 2^63-1 (-9,223,372,036,854,775,807 to 9,223,372,036,854,775,807) (8 bytes)
  val aLong: Long = 9223372036854775807L
  println(aLong)


  // A float (requires an 'f' at the end of the decmial value, otherwise recognised as a double)
  val aFloat: Float = 5.0f
  println(aFloat)


  // A double
  val aDouble: Double = 3.14
  println(aDouble)



  //VARIABLES

  var aVariable: Int = 4
  println(aVariable)

  aVariable = 20
  println(aVariable)
  // VARIABLES ARE MUTEABLE



}
 // Questions
 // diff between float and double? - the size of it. Float uses 7 bits and a double uses more. normal to use doubles.
 // why do we explicitly define values and not infer? - to make things clearer and more human readable.
 // are values just constant variables? - Yes - hardly ever use 'var' in our codebase, we don't normally infer values

 // SIDE EFFECTS - Side-effect is any external effect a function has besides its return value.
 // A function as we know has its own scope, it’s safe if we mutate variables within its scope.
 // We call them side-effects when it uses or changes stuff outside its scope like a variable passed by reference, global variable,
 // reading user input from the console, logging to console, doing database operations, etc.
 // calling a method calling another method is fine.
