class Point(var x: Int = 0, var y: Int = 0)

// these are default class parameters. since the compiler reads
// arguments from left to right, you would have to specify
// y = if you just wanted to pass y as an argument

// sets x = 1, y = 0
val p0 = new Point(1)
p0.x
p0.y

// x = 0, y = 1
val p1 = new Point(y = 1)
p1.x
p1.y

// x = 0, y = 0
val p2 = new Point()
p2.x
p2.y


// notice the special syntax of the setters: x_= and y_=
class Point {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x: Int = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning()
  }

  def y: Int = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning()
  }

  private def printWarning() = println("WARNING: Out of bounds")
}

val point1 = new Point
point1.x = 99
point1.y = 101 // prints the warning

// you can't reassign the vals in this class, though
class Point(val x: Int, val y: Int)
val point = new Point(1, 2)
//point.x = 3 <-- does not compile

// constructor params are private vals by default
class Point(x: Int, y: Int)
val point = new Point(1, 2)
// point.x <-- does not compile