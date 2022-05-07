// an extractor object is an object with an unapply method
import scala.util.Random

object CustomerID {
  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}

// using pattern matching/unapply in a val declaration:
val customer2ID = CustomerID("Nico")
val CustomerID(name) = customer2ID
println(name)

val CustomerID(name2) = "--asdfasdfasdf"

