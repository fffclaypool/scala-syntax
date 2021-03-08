/* Functions with Named Arguments
In a normal function call, the arguments in the call are matched one by one in
the order of the parameters of the called function. Named arguments allow you to
pass arguments to a function in a different order. The syntax is simply that each
argument is preceded by a parameter name and an equals sign.
 */

// Try the following program, it is a simple example to show the functions with named arguments.
object Demo {
  def main(args: Array[String]) = {
    printInt(b = 5, a = 7);
  }

  def printInt(a: Int, b: Int) = {
    println("Value of a:" + a);
    println("Value of b:" + b);
  }
}

/* Output
Value of a:7
Value of b:5
 */
