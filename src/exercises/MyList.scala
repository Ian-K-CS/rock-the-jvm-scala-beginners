package exercises

abstract class MyList {

  def head(): Int
  def tail(): MyList
  def isEmpty: Boolean
  def add(new_number: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"

}


object Empty extends MyList {

  def head(): Int = throw new NoSuchElementException()
  def tail(): MyList = throw new NoSuchElementException()
  def isEmpty: Boolean = true
  def add(newNumber: Int): MyList = new Cons(newNumber, Empty)
  def printElements: String = ""

}


class Cons(h: Int, t: MyList) extends MyList {

  def head(): Int = h
  def tail(): MyList = t
  def isEmpty: Boolean = false
  def add(newNumber: Int): MyList = new Cons(newNumber, this)
  def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  }

}


object ListTest extends App {

  val list = new Cons(1, new Cons(2, Empty))
  println(list)
  println(list.head())
  println(list.tail())
  println(list.isEmpty)
  println(list.add(4).head)

  print(list.toString)

}



/*
  The list will be a singularly linked list which holds Ints.
    - It will have the following methods:
    - define each method in the abstract class and then implement in a sub class.
        #head = first element of the list
        #tail = remainder of the list
        #isEmpty = Returns a Boolean - is the list empty?
        #add - received an Int and returns a new list with the new element added
        #toString - returns a string representation of the list
 */