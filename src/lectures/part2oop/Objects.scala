package lectures.part2oop

object Objects extends App {

  // class level functionality - function not depending on an instance of a class
  // SCALA DOESNT KNOW CLASS LEVEL FUNCTIONALITY


  // Objects have 'static like' functionality
  // This is how Scala does class level functionality
  // This type of object does NOT have parameters
  object Person { // the only instance of its type - type being Person in this example
    // "class / static" level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(name: String): Person = new Person(name)
    //factory method - provides interface to create objects. In this example - a new Person
    def from(mother: Person, father: Person): Person = new Person("Bobby")

  }

  class Person(val name: String) {
    // instance level functionality
    val canFly2: Boolean = false
  }
  // COMPANIONS - the pattern of writing classes and objects with the same name & have same scope


  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object is a SINGLETON INSTANCE
  // Both mary & john point to the same instance of Person
  // Singleton object - single instance that can be referred to multiple times different ways... But its still the same instance.
  val mary = Person
  val john = Person
  println(mary == john)


  val beth = new Person("Beth")
  val james = new Person("James")
  println(beth == james)


  val bobbie = Person.from(beth, james)
  println(bobbie)
  println(bobbie.name)

}

/*
Raihan Q's

1. class level functionality == class instance variables & methods?
  A. yeah pretty much!
2. Whats the concept of "static"? - in Scala object has 'static like' properties?
  A. Just the Java way of class methods / instance variables
3. What is the difference between an object instantiated from a class vs. object xxxxxx {}?
  A. Ones an object instantiated from a class, the other is just a singleton object
4. whats N_EYES?
  A. Nothing in particular. However, all caps because that's how you define vals in singleton objects
5. why use a factory method to create an new object instance - why not just do 'new Person()'?
  A. convention... shorter and easier to instantiate a new object from a class

 */
