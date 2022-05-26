package lectures.part1basics

object DefaultArgs extends App {

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

}
