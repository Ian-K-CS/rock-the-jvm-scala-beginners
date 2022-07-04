package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal { // Animal is a superclass of Cat
    val creatureType: String = "Wild"

    def eat(): Unit = println("nomnomnom")

  }

  // INHERITANCE
  // Cat class 'extends' the Animal class - thus you can call the method 'eat' on any object instantiated from the Cat class
  // this inherits all NON private methods & instance variables / fields!
  // making #eat (in class Animal) 'private' means it wont work!
  // making #eat (in class Animal) 'protected' works with both classes but can ONLY be call inside the class... not outside
  class Cat extends Animal { // Cat is a subclass of Animal
    def crunch(): Unit = {
      eat()
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.eat() // Inherits #eat from the Animal class
  cat.crunch() // Calls #crunch, which calls #eat (inherits the value "nomnomnom" from Animcal class, and then prints "crunch crunch"

  // val dog = new Animal
  // dog.eat() // wont work - can't call protected methods outside of either class


  // constructors - act in a particular way when dealing with inheritance
  class Person(val name: String, val age: Int)

  class Adult(name: String, age: Int, val idCard: String) extends Person(name, age) // correct way of extending from a subclass with parameters

  val adult = new Adult(name = "Steve", age = 2000, idCard = "employee 1")
  println(adult)
  println(adult.name)
  println(adult.age)
  println(adult.idCard)


  // 'override' keyword - supply a different implementation for a specified method, or a particular field
  // 'super' keyword - when you want to reference a method or field from a parent class
  class Dog(override val creatureType: String) extends Animal { // We can also define an override in the parameter and then pass in any value
    //    override val creatureType: String = "Domestic"
    override def eat(): Unit = {
      super.eat() // super.eat refers to #eat in the super class - Animal.
      println("crunch, crunch")
    }

  }

  val dog = new Dog(creatureType = "Domestic")
  dog.eat()
  println(dog.creatureType)





  // type substitution (polymorphism)
  val unknownAnimal: Animal = new Dog(creatureType = "K9") // Declared the val 'unknownAnimal' to be of type Animal. But assigned it a Dog type instead. This is polymorphism
  unknownAnimal.eat() // REMEMBER - method calls will always go to the most 'overridden' version possible'. This returns "crunch, crunch". It also returns "nomnomnom" from super.eat


  // RECAP
  // overRIDING - supplying a different implementation in a derived classes for  methods / fields.
  // overLOADING - when one class has more than one method with the same name, but different signatures (ie, different number of parameters).





  // Preventing overrides
  // 1 - 'final' keyword on methods / fields. Prevents derived classes changing implementation of the specified method / field.
  // 2 - 'final' keyword on class. Prevents extending the class (prevents inheritance)
  // 3 - 'sealed' keyword on class. Softer restriction. Can extend in THIS FILE only, prevents extension in OTHER FILES.

}




/*
Q - Raihan

1. Class code is run when an object is instantiated from it - why does it only run val & not methods (neither are called explicitly)
  A. The methods aren't called and vals are 'eager' ie - they will be evaluated when read by the compiler. (opposite of lazy evaluation)
2. Why does dog.creatureType work? shouldn't we need a getter method in the class signature / constructor?
  A. Vals are public and can be called just like public methods (don't need a getter method). Can make them 'private' so scope is only within the object.
3. Is 'val aString: "xxxxx"' just a quick way to access parameter vals/vars, instead of writing getter methods?
  A. Quick way of setting up a getter method for any arguments you want to pass in to the Class constructor. This way you can call <object>.aString
 */