package lectures.part1basics

object CBNvsCBV extends App {

  // call by value - the exact value of the expression being passed in as an argument on line 19... the 'System.nanoTime()'...
  // is computed before the function (starting line 7) evaluates. Thus the same value is used throughout the function
  def calledByValue(x: Long): Unit = {
    println("by value:" + s"${x}")
    println("by value:" + s"${x}")
  }


  // the '=>' tells the compiler that this is 'called by name'
  // call by name functions recompute the passed in argument expression each time its accessed within the function
  def calledByName(x: => Long): Unit = {
    println("by name:" + s"${x}")
    println("by name:" + s"${x}")
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

//  printFirst(x = infinite(), y = 34) // because 'x' is called by value - you get stuck in an infinite recursion loop - thus stack overflow error
  printFirst(34, infinite()) // because 'y' is called by name - you don't get stuck in an infinite recursion loop
}
