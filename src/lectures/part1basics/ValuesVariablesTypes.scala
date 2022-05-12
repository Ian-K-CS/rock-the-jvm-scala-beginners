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

}
