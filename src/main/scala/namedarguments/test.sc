def printName(first: String, last: String): Unit = {
  println(first + " " + last)
}

printName("John", "Smith") // print "John Smith"
printName(first = "John", last = "Smith") // prints "John Smith"
printName(last = "Smith", first = "John") // prints "John Smith"

// if some args are named and others are not, the unnamed args must come first and in the
// order of their parameters in the method signature
//printName(last = "Smith", "john") <-- error: positional after named argument