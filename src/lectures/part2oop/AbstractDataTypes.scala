package lectures.part2oop

object AbstractDataTypes extends App {

  // when you need to leave methods and/or fields blank. These are called abstract members.
  // classes which contain abstract members are called abstract classes.
  // defined by keyword 'abstract'


  // abstract classes CAN'T be instantiated. They are meant to be EXTENDED.
  // You generally want subclasses to specify the implementation & values of methods & fields.
  abstract class Animal {

    // val 'creatureType' and #eat' are undefined - they are both abstract members of Animal
    val creatureType: String
    def eat: Unit

  }

  class Dog extends Animal {
    override val creatureType: String = "K9"
    val eat: Unit = println("crunch crunch") // override isn't 100% necessary when extending abstract classes as the compiler knows this.
  }

  // traits - ultimate abstract data types is Scala
  // declared using keyword 'trait'
  // exactly like abstract classes, BUT they can be inherited along classes
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  // class Crocodile inherits members from both Animal and Carnivore
  // You can mix in as many traits as you want!! - I've added an additional trait - ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc" // Again, we dont need to specify the override keyword for this to work. Scala compiler knows!
    def eat: Unit = println("nom nom nom") // #eat from Animal class
    def eat(animal: Animal): Unit = println(s"I'm a ${creatureType} and I'm eating a ${animal.creatureType}") // #eat from Carnivore trait
  }

  val dog = new Dog
  val croccy = new Crocodile
  croccy.eat(dog)




  // TRAITS VS ABSTRACT CLASSES
  // abstract classes and traits can both have abstract and non abstract members
  // 1 - traits DON'T have constructor parameters.
  // 2 - In Scala you can only extend a class with one other class, but you can mix in multiple traits. I.E: multiple traits can be inherited by the same class.
  // 3 - Pick a trait rather than abstract class if it describes a type of 'behaviour' of an object (it can have val's, its not that type of behaviour).
  //     Abstract classes are a type of 'thing'





}
