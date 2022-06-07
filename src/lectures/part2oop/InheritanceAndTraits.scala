package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal {

    def eat: Unit = println("nomnomnom")

  }

  // INHERITANCE
  // Cat class 'extends' the Animal class - thus you can call the method 'eat' on any object instantiated from the Cat class
  // this inherits all NON private methods & instance variables / fields!
  class Cat extends Animal

  val cat = new Cat
  cat.eat

}
