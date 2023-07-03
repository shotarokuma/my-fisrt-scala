// class Point(var x: Int = 0, var y: Int = 0) {
//   def move(dx: Int, dy: Int): Unit = {
//     x = x + dx
//     y = y + dy
//   }

//   override def toString: String = {
//     s"($x, $y)"
//   }
// }

class Point:
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x: Int = _x
  def x_=(newValue: Int): Unit =
    if newValue < bound then
      _x = newValue
    else
      printWarning()

  def y: Int = _y
  def y_=(newValue: Int): Unit =
    if newValue < bound then
      _y = newValue
    else
      printWarning()

  private def printWarning(): Unit =
    println("WARNING: Out of bounds")
end Point


object PointDriver {
  def main(args: Array[String]): Unit = {
     // val origin = Point()  
    // val point1 = Point(1) 
    // val point2 = Point(y = 2)
    // println(point1) 
    // println(point2)
    
    val point1 = Point()
    point1.x = 99
    point1.y = 101 // prints the warning
  }
} 