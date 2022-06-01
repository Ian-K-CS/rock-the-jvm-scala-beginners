package lectures.part2oop

object OOBasics extends App {


  // instantiating a new object of the Person class. 'age' and 'name are class parameter, but aren't class member, so you can't access it
  // at instantiation of a new Person object, the code within the Class code block will run!
  val person = new Person(name = "Dave", age = 26)

  println(person.age)
  person.greet(name = "Reginald")
  person.greet()


  val writer = new Writer(firstName = "Daffy", surname = "Duck", yearOfBirth = 1800)
  val imposter = new Writer(firstName = "Daffy", surname = "Duck", yearOfBirth = 1800) // why does duplicating the exact same as 'write' return false. Would expect them to be equal? Print on ln 24.
  println(writer)
  println(writer.fullName())


  val novel = new Novel(name = "Looney Toons", yearOfRelease = 1839, author = writer)
  println(novel)
  println(novel.authorAgeAtRelease())
  println(novel.isWrittenBy(author = writer))
  println(novel.isWrittenBy(author = imposter))
  println(novel.copy(revisionDate = 1805))


  // playing with counter class &  objects
  val incrementCounter = new Counter(count = 20)
  val newCounter = incrementCounter.increment(5)
  val evenNewerCounter = newCounter.reduce(8)

  // overloaded method being called to increment just by 1
  incrementCounter.increment().increment().increment()





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






  /*
    Q&A
    1. Implement Novel and a Writer Classes

    Writer should have: first name, surname, year of birth
      - method: fullname (concatenation of first name and surname)

    novel should have: name, year of release, author (instance of type writer)
      - method: authorAge @ year of novel release
      - isWrittenBy (author)
      - copy (method receives new year of release(a revision of the book)) - returns new instance of Novel.
  */


  class Writer(firstName: String, surname: String, val yearOfBirth: Int) {

    def fullName(): String = {
      s"$firstName $surname"
    }

  }

  class Novel(name: String, yearOfRelease: Int, val author: Writer) {

    def authorAgeAtRelease(): Int = {
      yearOfRelease - author.yearOfBirth
    }

    def isWrittenBy(author: Writer): Boolean = {
      author == this.author
    }

    def copy(revisionDate: Int): Novel = {
      new Novel(name, revisionDate, author)
    }

  }




  /*
   Q&A
   2. Counter class
    - receives an int
    - method returns current count
    - methods to increment / decrement counter by 1. Returns a new Counter
    - overload inc/dec methods to receive a parameter, an amount by which you inc/dec by.
  */

  class Counter(val count: Int = 0) {

    // Immutability - objects are immutable in Functional Programming. If you need to change state, create a new object!!!!
    def increment(): Counter = {
      incrementText()
      new Counter(count + 1)
    }

    def reduce(): Counter = {
      reduceText()
      new Counter(count - 1)
    }

    // overloaded methods - as asked for in the question (methods with same names, but different signatures).
    def increment(n: Int): Counter = {
      if (n <= 0) {
        incrementText()
        counterTotalText()
        this
      }
      else {
        increment().increment(n - 1)
      }
    }
    def reduce(n: Int): Counter = {
      if (n <= 0) {
        reduceText()
        counterTotalText()
        this
      }
      else {
        reduce().reduce(n - 1)
      }
    }

    private def print(): Int = count
    private def incrementText(): Unit = println(s"incrementing.. ${print()}")
    private def reduceText(): Unit = println(s"reducing.. ${print()}")
    private def counterTotalText(): Unit = println(s"Your new counter is at: ${count}")

  }

}




// OOP quick refresher notes

// Constructor - used to initialize an objects state.
// Scala has 2 types of constructor - Primary & Auxiliary
// Primary Constructor - when the Scala program contains only one constructor. Can only have 1 primary constructor.
// Auxiliary Constructor - other constructors other than primary constructor. Can has many auxiliary constructors.

// Initialisation - assignment of initial value(s) for instance variables / fields.

