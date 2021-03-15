import java.awt

object Demo {
  def main(args: Array[String]) = {
    basicOperationsOnTrait()
    valueClassesUniversalTraits()
  }

  def basicOperationsOnTrait() = {
    /* Traits
    A trait encapsulates method and field definitions, which can then be reused by
    mixing them into classes. Unlike class inheritance, in which each class must
    inherit from just one superclass, a class can mix in any number of traits.

    Traits are used to define object types by specifying the signature of the
    supported methods. Scala also allows traits to be partially implemented but
    traits may not have constructor parameters.
     */

    val p1 = new Point(2, 3)
    val p2 = new Point(2, 4)
    val p3 = new Point(3, 3)

    // true
    println(p1.isNotEqual(p2))
    // false
    println(p1.isNotEqual(p3))
    // true
    println(p1.isNotEqual(2))
  }

  trait Equal {
    def isEqual(x: Any): Boolean
    def isNotEqual(x: Any): Boolean = !isEqual(x)
  }

  class Point(xc: Int, yc: Int) extends Equal {
    val x: Int = xc
    val y: Int = yc

    def isEqual(obj: Any) = {
      // obj.isInstanceOf [Point]: To check Type of obj and Point are same are not.
      obj.isInstanceOf[Point] &&
      // obj.asInstanceOf [Point] means exact casting by taking the object obj
      // type and returns the same obj as Point type.
      obj.asInstanceOf[Point].x == y
    }
  }

  def valueClassesUniversalTraits() = {
    /*
    Value classes are new mechanism in Scala to avoid allocating runtime objects.
    It contains a primary constructor with exactly one val parameter. It contains
    only methods (def) not allowed var, val, nested classes, traits, or objects.
    Value class cannot be extended by another class. This can be possible by
    extending your value class with AnyVal. The typesafety of custom datatypes
    without the runtime overhead.

    Let us take an examples of value classes Weight, Height, Email, Age, etc. For
    all these examples it is not required to allocate memory in the application.

    A value class not allowed to extend traits. To permit value classes to extend
    traits, universal traits are introduced which extends for Any.
     */

    val w = new Wrapper(3)

    // Demo$@78e03bb5
    println(this)
    // Demo$Wrapper@3
    w.print() // actually requires instantiating a Wrapper instance
  }

  trait Printable extends Any {
    def print(): Unit = println(this)
  }

  class Wrapper(val underlying: Int) extends AnyVal with Printable
}
