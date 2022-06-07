package lectures.part2oop

object Objects extends App {

  // class level functionality - function not depending on an instance of a class
  // SCALA DOESNT KNOW CLASS LEVEL FUNCTIONALITY


  // Objects have 'static like' functionality
  // This is how Scala does class level functionality
  // This type of object does NOT have parameters
  object Person {
    // "class / static" level functionality
    val N_EYES = 2
    def canFly: Boolean = false

  }

  class Person {
    // instance level functionality
  }

  // Companions - the pattern of writing classes and objects with the same name & have same scope


  println(Person.N_EYES)
  println(Person.canFly)


  // Scala object is a SINGLETON INSTANCE
  val mary = Person
  val John = Person
  println(mary == John)
}

/*
Raihan Q's

1. class level functionality == class instance variables & methods?
2. Whats the concept of "static"? - in Scala object has 'static like' properties?
3. What is the difference between an object instantiated from a class vs. object xxxxxx {}
4. whats N_EYES ?


 */
