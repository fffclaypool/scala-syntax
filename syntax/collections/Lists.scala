/* Lists
Scala Lists are quite similar to arrays which means, all the elements of a list
have the same type but there are two important differences. First, lists are
immutable, which means elements of a list cannot be changed by assignment.
Second, lists represent a linked list whereas arrays are flat.
 */

//The type of a list that has elements of type T is written as List[T].

object Demo {
  def main(args: Array[String]) = {
    defineVariousLists()
    basicOperationsOnLists()
    concatenatingLists()
    creatingUniformLists()
    tabulatingFunction()
    reverseListOrder()
  }

  def defineVariousLists() = {
    // List of Strings
    val fruitX: List[String] = List("apples", "oranges", "pears")
    val fruitY = "apples" :: ("oranges" :: ("pears" :: Nil))

    // True
    println(fruitX sameElements fruitY)

    // List of Intergers
    val numsX: List[Int] = List(1, 2, 3, 4)
    val numsY = 1 :: (2 :: (3 :: (4 :: Nil)))

    // True
    println(numsX sameElements numsY)

    // Empty List
    val emptyX: List[Nothing] = List()
    val emptyY = Nil

    // True
    println(emptyX sameElements emptyY)

    // Two dimensional lit
    val dimX: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    val dimY = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    // True
    println(dimX sameElements dimY)
  }

  def basicOperationsOnLists() = {
    /*
    All operations on lists can be expressed in terms of the following three methods.
      head
        This method returns the first element of a list.
      tail
        This method returns a list consisting of all elements except the first.
      isEmpty
        This method returns true if the list is empty otherwise false.
     */

    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil

    // Head of fruit: apples
    println("Head of fruit: " + fruit.head)

    // Tail of fruit: List(oranges, pears)
    println("Tail of fruit: " + fruit.tail)

    // Check if fruit is empty: false
    println("Check if fruit is empty: " + fruit.isEmpty)

    // Check if nums is empty: true
    println("Check if nums is empty: " + nums.isEmpty)
  }

  def concatenatingLists() = {
    // You can use either ::: operator or List.:::() method or List.concat() method
    // to add two or more lists. Please find the following example given below −
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    // use two or more lists with ::: operator
    var fruit = fruit1 ::: fruit2
    // fruit1 ::: fruit2: List(apples, oranges, pears, mangoes, banana)
    println("fruit1 ::: fruit2: " + fruit)

    // use two lists with Set.:::() method
    fruit = fruit1.:::(fruit2)
    // fuit1.:::(fruit2): List(mangoes, banana, apples, oranges, pears)
    println("fruit1.:::(fruit2): " + fruit)

    // pass two or more lists as arguments
    fruit = List.concat(fruit1, fruit2)
    // List.concat(fruit1, fruit2): List(apples, oranges, pears, mangoes, banana)
    println("List.concat(fruit1, fruit2): " + fruit)
  }

  def creatingUniformLists() = {
    // You can use List.fill() method creates a list consisting of zero or more
    // copies of the same element.
    val fruit = List.fill(3)("apple") // Repeats apples three times.
    // fruit: List(apple, apple, apple)
    println("fruit: " + fruit)

    val num = List.fill(10)(2) // Repeats 2, 10 times
    // num: List(2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
    println("num: " + num)
  }

  def tabulatingFunction() = {
    // Creates 5 elements using the given function
    val squares = List.tabulate(6)(n => n * n)
    // squares: List(0, 1, 4, 9, 16, 25)
    println("squares: " + squares)

    val mulX = List.tabulate(4, 5)(_ * _)
    // mulX: List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4), List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12))
    println("mulX: " + mulX)

    val mulY = List.tabulate(3,7)(_*_)
    // mulY: List(List(0, 0, 0, 0, 0, 0, 0), List(0, 1, 2, 3, 4, 5, 6), List(0, 2, 4, 6, 8, 10, 12))
    println("mulY: " + mulY)

    val mulZ = List.tabulate(7,5)(_*_)
    // mulZ: List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4), List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12),
    // List(0, 4, 8, 12, 16), List(0, 5, 10, 15, 20), List(0, 6, 12, 18, 24))
    println("mulZ: " + mulZ)
  }

  def reverseListOrder() = {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    
    // Before reverse fruit: List(apples, oranges, pears)
    println("Before reverse fruit: " + fruit)
    // After reverse fruit: List(pears, oranges, apples)
    println("After reverse fruit: " + fruit.reverse)
  }
}
