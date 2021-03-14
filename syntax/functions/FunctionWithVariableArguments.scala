/* Function with Variable Arguments
Scala allows you to indicate that the last parameter to a function may be repeated.
This allows clients to pass variable length argument lists to the function. Here,
the type of args inside the print Strings function, which is declared as type "String*"
is actually Array[String].
 */

// Try the following program, it is a simple example to show the function with arguments.

object Demo {
  def main(args: Array[String]) = {
    printStrings("Hello", "Scala", "Python");
    printStrings("Hello", "Go", "C", "Perl", "Java");
  }

  def printStrings(args: String*) = {
    var i: Int = 0;

    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1
    }
    println("")
  }
}

/* Output
Arg value[0] = Hello
Arg value[1] = Scala
Arg value[2] = Python

Arg value[0] = Hello
Arg value[1] = Go
Arg value[2] = C
Arg value[3] = Perl
Arg value[4] = Java
 */
