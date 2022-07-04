import java.time.LocalDateTime

class A
class B extends A

def makeB(): B = new B{}

val a: A = makeB()
val b: B = makeB()


val aString: String = "foo"
val stillAString: AnyRef = aString


//def exampleMethod(): String = {
//  34
//}


//1 / 0

val division = 6 / 3
division





val num1 = 10
val num2 = 5

def example(a: Int, b: Int, c: Int): Int = {println("inside method"); 2 * a + (c + b)}

example({println("a"); num1}, {println("b"); num2}, {println("c"); 10})

// 2 * a + 15
// 20 + 15
// 35



// HoF examples
val addFunction: (Int, Int, Int) => Int = (x, y, z) => (x + y + z)
val functionOne = (a: Int) => a * 10
val functionTwo = (a: Int) => a - 2

def combineInts(x: Int, y: Int, z: Int, f: (Int, Int, Int) => Int): Int = {
  f(x, y, z)
}

combineInts(5, 10, 15, (d, y, z) => (d + y + z))
combineInts(5, 10, 15, (x, y, z) => (x + z - y))
combineInts(5, 10, 15, (x, y, z) => ((x - z) + (z - y)))
combineInts(5, 10, 15, addFunction)


val combined = functionOne.andThen(functionTwo)
combined(10)


val funcLit = (x: Int) => x * x

