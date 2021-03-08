/* Enrich my library
Another way to use it is called the enrich my library pattern, where you add methods
to an existing class to make it look like you are extending it. There are many examples
of this pattern in the Scala standard library, and this is the way it should be used.
For example, in the program we have seen so far, there is an expression (1 to 5),
but the Int type does not have a to method. The to method is the best example of using
the enrich my library pattern. When the compiler finds a method call for a type, it looks
for the type that defines the method in the return type of the implicit conversion, and
if the type matches, it inserts the implicit conversion call. In this usage, implicit
conversion can be used safely as long as the return type of the implicit conversion
is not used elsewhere.
 */

// Let's define an implicit conversion that returns a String with the string ":-)" appended to the end.

import scala.language.implicitConversions

class RichString(val src: String) {
  def smile: String = src + ":-)"
}

object Demo {
  def main(args: Array[String]) = {
    implicit def enrichString(arg: String): RichString = new RichString(arg)

    println("Hi, ".smile)
  }
}

/* Output
Hi, :-)
 */
