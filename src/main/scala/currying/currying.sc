trait Iterable[A] {
  def foldLeft[B](z: B)(op: (B, A) => B): B
}

val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val res = numbers.foldLeft(0)((m, n) => m + n)
println(res)

def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) = ???

def notPossible = foldLeft1(numbers, 0, _ + _)

def firstWay = foldLeft1[Int, Int](numbers, 0, _ + _)
def secondWay = foldLeft1(numbers, 0, (a: Int, b: Int) => a + b)

def foldLeft2[A, B](as: List[A], b0: B)(op: (B, A) => B) = ???
def possible = foldLeft2(numbers, 0)(_ + _)

def execute(arg: Int)(implicit ec: scala.concurrent.ExecutionContext) = ???

val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val numberFunc = numbers.foldLeft(List[Int]()) _

val squares = numberFunc((xs, x) => xs :+ x*x)
println(squares)

val cubes = numberFunc((xs, x) => xs :+ x*x*x)
println(cubes)