/* Basic Class
Following is a simple syntax to define a basic class in Scala. This class defines
two variables x and y and a method: move, which does not return a value. Class
variables are called, fields of the class and methods are called class methods.
The class name works as a class constructor which can take a number of parameters.
The above code defines two constructor arguments, xc and yc; they are both visible
in the whole body of the class.

  class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc
    def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location:" + x);
      println ("Point y location:" + y);
    }
  }
 */

// you can create objects using a keyword new and then you can access class fields
// and methods as shown below in the example −

import java.io._

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) = {
    x = x + dx
    y = y + dy
    println("Point x location:" + x);
    println("Point y location:" + y);
  }
}

object Demo {
  def main(args: Array[String]) = {
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);
  }
}

/* Output:
Point x location:20
Point y location:30
 */
