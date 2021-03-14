/* Implicit Conversion
Implicit conversion is a feature that allows the user to define implicit type conversion functions.
Implicit conversion is defined as follows:

  implicit def method name (arg name: arg type): return type = body

There are several ways to use implicit conversion, such as when you want to fit a newly defined
user-defined type to an existing type. For example:
 */

import scala.language.implicitConversions

object Demo {
  def main(args: Array[String]) = {
    implicit def intToBoolean(arg: Int): Boolean = arg != 0

    if (1) {
      println("1 is true.")
    }
  }
}

/* Output
1 is true.
 */

/*
It is possible to pass Int to an if expression, which would normally only allow Boolean. However,
this is not a good usage. As you can see in the example above, by defining implicit conversion,
it is possible to bypass the compiler's check that only Boolean expressions can be passed in the
conditional expression of an if expression. Some libraries define such implicit conversions in order to
convert between their own data types and the standard Scala data types, but you should consider
whether such conversions are really necessary.
 */
