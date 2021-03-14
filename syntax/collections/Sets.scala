/* sets
Scala Set is a collection of pairwise different elements of the same type. In
other words, a Set is a collection that contains no duplicate elements. There
are two kinds of Sets, the immutable and the mutable. The difference between
mutable and immutable objects is that when an object is immutable, the object
itself can't be changed.
 */

object Demo {
  def main(args: Array[String]) = {
    basicOperationsOnSet()
    concatenatingSet()
    findMaxMinElementsInSet()
    findCommonValuesInsets()
  }

  def basicOperationsOnSet() = {
    val fruit = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    // Head of fruit: apples
    println("Head of fruit: " + fruit.head)
    // Tail of fruit: Set(oranges, pears)
    println("Tail of fruit: " + fruit.tail)
    // Check if fruit is empty: false
    println("Check if fruit is empty: " + fruit.isEmpty)
    // Check if nums is empty: true
    println("Check if nums is empty: " + nums.isEmpty)
  }

  def concatenatingSet() = {
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    // use two or more sets with ++ as operator
    var fruit = fruit1 ++ fruit2
    // fruit1 ++ fruit2 : Set(banana, apples, mangoes, pears, oranges)
    println("fruit1 ++ fruit2: " + fruit)

    // use two sets with ++ as mesod
    fruit = fruit.++(fruit2)
    // fruit1.++(fruit2) : Set(banana, apples, mangoes, pears, oranges)
    println("fruit.++(fruit2): " + fruit)

  }

  def findMaxMinElementsInSet() = {
    val num = Set(5, 6, 9, 20, 30, 45)

    // find min and max of the elements
    // Min element in Set(5,6,9,20,30,45) : 5
    println("Min element in Set(5,6,9,20,30,45) : " + num.min)
    // Max element in Set(5,6,9,20,30,45) : 45
    println("Max element in Set(5,6,9,20,30,45) : " + num.max)
  }

  def findCommonValuesInsets() = {
    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)

    // find common elements between two sets
    // num1.&(num2) : Set(20, 9)
    println("num1.&(num2) : " + num1.&(num2))
    // num1.intersect(num2) : Set(20, 9)
    println("num1.intersect(num2) : " + num1.intersect(num2))
  }
}
