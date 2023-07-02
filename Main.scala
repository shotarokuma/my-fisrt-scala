object Main {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val x: Int = 1
    var y: Int = 9
    y = 10

    val add: (Int, Int) => Int = (x, y) => x + y
    println(add(x, y))

    println({
      val x: Int = 1 + 10
      x + 100
    })

    def minus(x: Int, y: Int): Int = x - y
    println(minus(1, 2)) 

    val g = Greeter("Hello, ", "!")
    g.greet("Scala developer") 


    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 2)(3))

    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)   

    if point == anotherPoint then
      println(s"$point and $anotherPoint are the same.")
    else
      println(s"$point and $anotherPoint are different.")

    if point == yetAnotherPoint then
      println(s"$point and $yetAnotherPoint are the same.")
    else
      println(s"$point and $yetAnotherPoint are different.")


    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2
  }
}

class Greeter(prefix: String, suffix: String):
  def greet(name: String): Unit = println(prefix + name + suffix)

case class Point(x : Int, y: Int)

object IdFactory:
  private var counter = 0
  def create(): Int =
    counter += 1
    counter

@main def hello() = println("Hello, Scala developer!!!!")