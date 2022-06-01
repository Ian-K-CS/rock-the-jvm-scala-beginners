package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }





  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  // This is infix notation = operator notation - only works with methods with ONE parameter
  println(mary likes "Inception") // Equivalent to the line above. You don't need dot notation to call methods

  // "operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(tom hangOutWith mary) // in this case 'hangOutWith' acts like an operator between the operands 'tom' and 'mary'

  //ALL OPERATOR ARE METHODS
  //E.g
  println (1 + 2) // same as ...
  println (1.+(2))

}


