/* Array
Scala provides a data structure, the array, which stores a fixed-size sequential
collection of elements of the same type. An array is used to store a collection
of data, but it is often more useful to think of an array as a collection of
variables of the same type.
 */

import Array._
import java.util

object Demo {
  def main(args: Array[String]) = {
    declaringArrayVariables()
    processingArrays()
    multiDimensionalArrays()
    concatenateArrays()
    createArrayWithRange()
  }

  def declaringArrayVariables() = {
    var x: Array[String] = new Array[String](3)
    var y = new Array[String](3)
    var z = Array("Zara", "Nuha", "Ayan")

    x(0) = "Zara"; x(1) = "Nuha"; x(2) = "Ayan"
    y(0) = "Zara"; y(1) = "Nuha"; y(2) = "Ayan"

    // true
    println(x sameElements y)

    // true
    println(y sameElements z)

    // true
    println(z sameElements x)
  }

  def processingArrays() = {
    var myList = Array(1.9, 3.9, 3.4, 3.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;

    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    // Total is 12.7
    println("Total is " + total)

    // Finding the largest element
    var max = myList(0)

    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i)
    }
    // Max is 3.9
    println("Max is " + max)
  }

  def multiDimensionalArrays() = {
    // Define a two-dimensional array.
    // This is an array that has three elements each being an array of
    // integers that has three elements.
    var myMatrix = ofDim[Int](3, 3)

    // build a matrix
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }

    /*
    Print two dimensional array
     0 1 2
     0 1 2
     0 1 2
     */
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }
  }

  def concatenateArrays() = {
    val myList1 = Array(1.9, 2.9, 3.4, 3.5)
    val myList2 = Array(8.9, 7.9, 0.4, 1.5)
    val myList3 = Array(5.9, 6.9, 2.4, 2.5)

    val myList4 = concat(myList1, myList2, myList3)

    // [D@61e717c2
    println(myList4)

    // Array(1.9, 2.9, 3.4, 3.5, 8.9, 7.9, 0.4, 1.5, 5.9, 6.9, 2.4, 2.5)
    println("Array(" + myList4.mkString(", ") + ")")
  }

  def createArrayWithRange() = {
    // This means creating an array with elements between 10 and 20 and
    // range difference 2.
    val myList1 = range(10, 20, 2)

    // Here range difference is not given so by default it assumes 1
    // element.
    val myList2 = range(10, 20)

    // Array(10, 12, 14, 16, 18)
    println("Array(" + myList1.mkString(", ") + ")")

    // Array(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    println("Array(" + myList2.mkString(", ") + ")")
  }
}
