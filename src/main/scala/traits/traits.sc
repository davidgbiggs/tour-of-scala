trait HairColor

// extending the trait Iterator requires an implementation of hasNext and next
trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

// use override and extends to work with traits with abstract methods
class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

// subtypes can be passed in place of supertypes
import scala.collection.mutable.ArrayBuffer
trait Pet {
  val name: String
}

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

val dog = new Dog("Harry")
val cat = new Cat("Sally")

val animals = ArrayBuffer.empty[Pet]
animals.append(dog)
animals.append(cat)
animals.foreach(pet => println(pet.name))