package lectures.part2oop

object OOBasics extends App {

  val person = new Person(name = "Dave", age = 26) // instantiating a new object of the Person class. 'age' and 'name are class parameter, but aren't class member, so you can't access it

  println(person.name)
  println(person.age)

}

class Person(val name: String, val age: Int) // Class constructor. Basically says every instance of Person must be constructed by passing in (in this case) a 'name' and 'age'.
                                             // This also initialises the object with setting the instance variable / field values.. 'val name: String' & 'val age: Int'.







// OOP quick refresher notes

// Constructor - used to initialize an objects state.
// Scala has 2 types of constructor - Primary & Auxiliary
// Primary Constructor - when the Scala program contains only one constructor. Can only have 1 primary constructor.
// Auxiliary Constructor - other constructors other than primary constructor. Can has many auxiliary constructors.

// Initialisation - assignment of initial value(s) for instance variables / fields.