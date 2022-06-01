package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {

    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!" // colon needs a space, otherwise compiler thinks its part of the method
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }



  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  // This is infix notation = operator notation - only works with methods with ONE parameter
  // (syntactics sugar - nicer way of writing code vs a more cumbersome way)
  println(mary likes "Inception") // Equivalent to the line above. You don't need dot notation to call methods


  // "operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(tom + mary) // in this case '+' acts like an operator between the operands 'tom' and 'mary'


  //ALL OPERATOR ARE METHODS
  //E.g
  println (1 + 2) // same as ...
  println (1.+(2))


  // prefix notation - this is about unary operators
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with a few operators... -, +, ~, !

  println(!mary) // this is calling the unary_! method defined in the Person class
  println(mary.unary_!) // calling the same method


  // postfix notation - methods WITHOUT parameters can only be used in postfix notation
  println(mary.isAlive)
  println(mary isAlive) // these lines are equivalent


  // apply - when the compiler sees an object being called like a function - it looks the 'apply' method!
  println(mary.apply())
  print(mary()) // equivalent lines

}


/*
  Q&A -

    1. Overload the + operator - receives Strings, returns nick name
    eg: mary + "the rock star" - => new person "Mary (the rockstar)"

    2. Add an age to the Person class, default 0.
    Add unary + operator - increments age by 1 => new Person with the age + 1
    +mary => mary with the age incremented

    3. Add a 'learns' method in Person class. receives String => "Mary learns Scala"
    Add a learnsScala method - no parameters - calls 'learns' method with "Scala" as a parameter
    Use it in postfix notation.

    4. Overload the 'apply' method to receive a number, returns String
    mary.apply(2) => prints out "Mary watched Inception" 2 times

 */

