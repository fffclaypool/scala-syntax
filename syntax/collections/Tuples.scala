/* Tuples
Scala tuple combines a fixed number of items together so that they can be
passed around as a whole. Unlike an array or list, a tuple can hold objects
with different types but they are also immutable.

The following is an example of a tuple holding an integer, a string, and
the console.

  val t = (1, "hello", Console)

Which is syntactic sugar (short cut) for the following −

  val t = new Tuple3(1, "hello", Console)

The actual type of a tuple depends upon the number and of elements it contains
and the types of those elements. Thus, the type of (99, "Luftballons") is
Tuple2[Int, String]. The type of ('u', 'r', "the", 1, 4, "me") is
Tuple6[Char, Char, String, Int, Int, String]

Tuples are of type Tuple1, Tuple2, Tuple3 and so on. There currently is an upper
limit of 22 in the Scala if you need more, then you can use a collection, not a
tuple. For each TupleN type, where 1 <= N <= 22, Scala defines a number of
element-access methods. Given the following definition −

  val t = (4, 3, 2, 1)

To access elements of a tuple t, you can use method t._1 to access the first
element, t._2 to access the second, and so on. For example, the following
expression computes the sum of all elements of t.

  val sum = t._1 + t._2 + t._3 + t._4

You can use Tuple to write a method that takes a List[Double] and returns the
count, the sum, and the sum of squares returned in a three-element Tuple, a
Tuple3[Int, Double, Double]. They are also useful to pass a list of data values
as messages between actors in concurrent programming.
 */

object Demo {
  def main(args: Array[String]) = {
    basicOperationsOnTuple()
    iterateOverTheTuple()
    convertingToString()
    swapTheElements()
  }

  def basicOperationsOnTuple() = {
    val t = (4, 3, 2, 1)
    val sum = t._1 + t._2 + t._3 + t._4

    // Sum of elements: 10
    println("Sum of elements: " + sum)
  }

  def iterateOverTheTuple() = {
    val t = (4, 3, 2, 1)

    // Value = 4
    // Value = 3
    // Value = 2
    // Value = 1
    t.productIterator.foreach { i => println("Value = " + i) }
  }

  def convertingToString() = {
    // You can use Tuple.toString() method to concatenate all the elements of
    // the tuple into a string.
    val t = new Tuple3(1, "hello", Console)

    // Concatenated String: (1,hello,scala.Console$@153f5a29)
    println("Concatenated String: " + t.toString())
  }

  def swapTheElements() = {
    // You can use Tuple.swap method to swap the elements of a Tuple2.
    val t = new Tuple2("Scala", "hello")

    // Swapped Tuple: (hello,Scala)
    println("Swapped Tuple: " + t.swap)
  }
}
