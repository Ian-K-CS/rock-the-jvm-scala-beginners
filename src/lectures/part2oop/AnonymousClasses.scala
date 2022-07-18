package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat(): Unit
  }

  // Anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat(): Unit = println("words go here")
  }
  println(funnyAnimal.getClass)
  println(funnyAnimal.isInstanceOf[Animal])

  /*
  The above code is equivalent to:

  class AnonymousClasses$$anon$1 extends Animal {
    override def eat(): Unit = println("words go here")
  }

  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  */





  class Person(name: String) {
    def sayHi(): Unit = println(s"Hi, my ${name} is, how can I help?")
  }

  val jim = new Person("Jim") {
    override def sayHi(): Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }
  println(jim)
  println(jim.sayHi())

}
