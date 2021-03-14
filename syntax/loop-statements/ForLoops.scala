object Demo {
  def main(args: Array[String]) = {
    forLoopWithRanges()
    forLoopWithCollections()
    forLoopWithFilters()
    forLoopWithYield()
  }

  def forLoopWithRanges() = {
    /* for Loops
    A for loop is a repetition control structure that allows you to efficiently
    write a loop that needs to execute a specific number of times. There are
    various forms of for loop in Scala which are described below.
    The simplest syntax of for loop with ranges in Scala is −

      for( var x <- Range ){
        statement(s);
      }

    Here, the Range could be a range of numbers and that is represented as i to j
    or sometime like i until j. The left-arrow ← operator is called a generator,
    so named because it's generating individual values from a range
     */

    for (a <- 1 to 10) {
      println("Value of a:" + a);
    }
    println("")

    /* Output
    Value of a:1
    Value of a:2
    Value of a:3
    Value of a:4
    Value of a:5
    Value of a:6
    Value of a:7
    Value of a:8
    Value of a:9
    Value of a:10
     */

    for (a <- 1 until 10) {
      println("Value of a:" + a);
    }
    println("")

    /* Output
    Value of a:1
    Value of a:2
    Value of a:3
    Value of a:4
    Value of a:5
    Value of a:6
    Value of a:7
    Value of a:8
    Value of a:9
     */

    /*
    You can use multiple ranges separated by semicolon (;) within for loop and
    in that case loop will iterate through all the possible computations of the
    given ranges. Following is an example of using just two ranges, you can use
    more than two ranges as well.
     */

    for (x <- 1 to 3; y <- 1 to 3) {
      println("Value of x:" + x + " " + "y:" + y);
    }
    println("")

    /* Output
    Value of x:1 y:1
    Value of x:1 y:2
    Value of x:1 y:3
    Value of x:2 y:1
    Value of x:2 y:2
    Value of x:2 y:3
    Value of x:3 y:1
    Value of x:3 y:2
    Value of x:3 y:3
     */
  }

  def forLoopWithCollections() = {
    /*
    The following syntax for loop with collections.

      for( var x <- List ){
        statement(s);
      }

    Here, the List variable is a collection type having a list of elements and
    for loop iterate through all the elements returning one element in x variable
    at a time.
     */

    val numList = List(1, 2, 3, 4, 5, 6);

    for (a <- numList) {
      println("Value of a:" + a);
    }
    println("")

    /* Output
    Value of z:1
    Value of z:2
    Value of z:3
    Value of z:4
    Value of z:5
    Value of z:6
     */
  }

  def forLoopWithFilters() = {
    /*
    Scala's for loop allows to filter out some elements using one or more if
    statement(s). Following is the syntax of for loop along with filters. To
    add more than one filter to a 'for' expression, separate the filters with
    semicolons(;).

      for( var x <- List
            if condition1; if condition2...
         ){
         statement(s);
      }

    Try the following example program to understand loop with a filter.
     */

    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    for (
      a <- numList
      if a != 3; if a < 8
    ) {
      println("Value of a:" + a);
    }
    println("")
  }
  def forLoopWithYield() = {
    /*
    You can store return values from a "for" loop in a variable or can return
    through a function. To do so, you prefix the body of the 'for' expression
    by the keyword yield. The following is the syntax.

      var retVal = for{ var x <- List
         if condition1; if condition2...
      }
      yield x

    The curly braces have been used to keep the variables and conditions and
    retVal is a variable where all the values of x will be stored in the form
    of collection. Try the following example program to understand loop with
    yield.
     */

    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    var retVal = for { a <- numList if a != 3; if a < 8 } yield a
    println(retVal)

    for (a <- retVal) {
      println("Value of a:" + a);
    }
    println("")

    /* Output
    List(1, 2, 4, 5, 6, 7)
    Value of a:1
    Value of a:2
    Value of a:4
    Value of a:5
    Value of a:6
    Value of a:7
     */
  }
}
