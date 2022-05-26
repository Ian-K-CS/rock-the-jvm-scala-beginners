package lectures.part1basics

object DefaultArgs extends App {

  // when you call a method a lot, and the parameter doesn't change a lot .... maybe add in a default value instead!

  def trFact(n: Int, acc: Int = 50): Int = { // can assign a default value for an argument... in this example, 'acc' is an Int with a default value of 50
    if (n <= 1) acc
    else {
      println(s"I am n: ${n}")
      println(s"I am acc: ${acc}")
      trFact(n - 1, n * acc)
    }
  }

  val fact10: Int = trFact(n = 5, acc = 1) // Just because a default value is assigned, doesnt mean you can't pass in a value for 'acc'

  println(fact10)



  def savePicture(format: String = "jpg", width: Int, height: Int): Unit = println("saving picture")

  savePicture(width = 800, height = 500)
}
