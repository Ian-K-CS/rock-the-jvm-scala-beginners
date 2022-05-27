package lectures.part2oop

object OOBasics extends App {


  // instantiating a new object of the Person class. 'age' and 'name are class parameter, but aren't class member, so you can't access it
  // at instantiation of a new Person object, the code within the Class code block will run!
  val person = new Person(name = "Dave", age = 26)

  println(person.age)
  person.greet(name = "Reginald")
  person.greet()

}



// Class constructor. Basically says every instance of Person must be constructed by passing in (in this case) a 'name' and 'age'.
// This also initialises the object with setting the instance variable / field values.. 'val age: Int'. You don't HAVE to set each parameter as a field - I haven't with 'name: String'
class Person(name: String, val age: Int) {
  // class body - everything between '{}' defines the implementation of the class.


  // Any var's / val's defined in a class are also fields / instance variables of said Class.
  val x: Int = 2


  // at instantiation of a new Person object, the entire code within the Class code block will run. Which is why this prints before lines 7 & 8.
  println(1 + 3)


  // methods defined in a class are called methods. Ie, it can be called on an object. Functions aren't associated with a class and aren't called on objects.
  // 'this' relates to the current objects instance variable/field/class parameter. It gives you access to the objects instance variables / fields / class parameters.. state
  def greet(name: String): Unit = println(s"Welcome ${this.name} - $name says hello!")


  // overloading - defining methods with the same name but different method signatures
  def greet(): Unit = println(s"$name")


  // Auxiliary Constructors 'this(name: String)' that calls the Primary constructor 'this(name, 0)' - I don't this concept is used to much!
  def this(name: String) = this(name, 0)


}





// OOP quick refresher notes

// Constructor - used to initialize an objects state.
// Scala has 2 types of constructor - Primary & Auxiliary
// Primary Constructor - when the Scala program contains only one constructor. Can only have 1 primary constructor.
// Auxiliary Constructor - other constructors other than primary constructor. Can has many auxiliary constructors.

// Initialisation - assignment of initial value(s) for instance variables / fields.

