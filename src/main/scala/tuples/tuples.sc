val ingredient = ("Sugar", 25)

// access by number with ._x
println(ingredient._1)
println(ingredient._2)

// you can use pattern matching
val (name, quantity) = ingredient
println(name)
println(quantity)

val planets =
  List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
    ("Mars", 227.9), ("Jupiter", 778.3))
planets.foreach {
  case ("Earth", distance) =>
    println(s"Our planet is $distance million kilometers from the sun")
  case _ => ()
}

val numPairs = List((2, 5), (3, -7), (20, 56))
for ((a, b) <- numPairs) {
  println(a * b)
}