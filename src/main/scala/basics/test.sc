//def name: String = System.getProperty("user.name")
//println("Hello, " + name + "!")

// case classes are compared by value, classes are compared by reference
case class Point(x: Int, y: Int)

val point = Point(1, 2)
val anotherPoint = Point(1, 2)
val yetAnotherPoint = Point(2, 2)

if (point == anotherPoint) {
  println(s"$point and $anotherPoint are the same.")
} else {
  println(s"$point and $anotherPoint are different.")
}

if (point == yetAnotherPoint) {
  println(s"$point and $yetAnotherPoint are the same.")
} else {
  println(s"$point and $yetAnotherPoint are different.")
}

object IdFactory {
  private var idCount = 0
  def create(): Int = {
    idCount += 1
    idCount
  }
}

IdFactory.create()
IdFactory.create()

trait Greeter {
  def greet(name: String) = println(s"Hello, $name!")
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String) = {
    println(prefix + name + postfix)
  }
}

val greeter = new DefaultGreeter()
greeter.greet("Scala developer")

val customGreeter = new CustomizableGreeter("How are you, ", "?")
customGreeter.greet("Scala developer")