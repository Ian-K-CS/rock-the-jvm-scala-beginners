package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42  // Explicitly stating that 42 is an Int, its not inferred by the compiler.
  println(x)
  // VALS ARE IMMUTABLE - works similar to constants but not regarded as constants to be re-used throughout the code.
  // More as an intermediate computations to later use in bigger computations.



  val y = 45 // Compiler can infer types. IE, it knows 45 is an Int.
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

  // An integer
  val anInt: Int = 10
  println(anInt)

}
