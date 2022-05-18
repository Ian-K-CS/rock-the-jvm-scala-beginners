package Supplemental

object Strings extends App {

  //println("blah blah blah") will always end in a new line '\n'
  //print("blah blah") will always print does not add a new line

  val firstName: String = "John"
  val middleName: String = "S."
  val lastName: String = "Smith"

  val fullName = s"$firstName $middleName $lastName" // Can string interpolate this way.
  println(fullName)
  println(s"${firstName} ${middleName} ${lastName}") // Or like this with curly brackets - can also be used to evaluate expressions - like Ruby
  println(firstName + " " + middleName + " " + lastName) // Or append the Strings together - like Ruby

  print("line 1")
  print("line 2")
  print("line 3" + "\n") // This will print but won't include a new line - has to be added manually

  // Multiline string example - requires """ blah blah blah """"
  val speach: String =
    """Four score and
      |seven years ago
      |our fathers""".stripMargin
  print(speach + "\n")
  println(speach)

}
