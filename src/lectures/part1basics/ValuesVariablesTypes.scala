package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42  // Explicitly stating that 42 is an Int, its not inferred by the compiler.
  println(x)
  // VALS ARE IMMUTABLE - works similar to constants but not regarded as constants to be re-used throughout the code.
  // More as an intermediate computations to later use in bigger computations.


  val y = 45 // Compiler can infer types. IE, it knows 45 is an Int - so you don't explicity have to say what type the value is.
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


  // An integer - integers have a range of -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,648) (4 bytes)
  val anInt: Int = 10
  println(anInt)


  // A short - shorts have a range of -32,768 to 32,767 (2 bytes)
  val aShort: Short = 32767
  println(aShort)


  // A Long - longs have a range of -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,808) (8 bytes)
  val aLong: Long =


}
