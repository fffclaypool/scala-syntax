/* Extending a Class
You can extend  a base Scala class and you can design an inheriteid class in
the same way you do it in Java, but there are two restrictions: method overriding
requires the override keyword, and only the primary constructor can pass parameters
to the base constructor. Let us extend our above class and add one more class
method.
Example
Let us take an example of two classes Point class and Location class is inherited
class using extends keyword. Such an 'extends' clause has two effects: it makes Location
class inherit all non-private members from Point class, and it makes the type Location
a subtype of the type Point class. So here the Point class is called superclass and the
class Location is called subclass. Extending a class and inheriting all the features of
a parent class is called inheritance but Scala allows the inheritance from just one class
only.
 */

// Try the following example program to implement inheritance

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

class Location(override val xc: Int, override val yc: Int, val zc: Int)
    extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location:" + x);
    println("Point y location:" + y);
    println("Point z location:" + z);
  }
}

object Demo {
  def main(args: Array[String]) = {
    val loc = new Location(10, 20, 15);

    // Move to a new location
    loc.move(10, 10, 5);
  }
}

/* Output:
Point x location:20
Point y location:30
Point z location:20
 */
