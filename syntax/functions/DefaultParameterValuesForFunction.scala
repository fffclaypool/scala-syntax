/* Default Parameter Values for a Function
Scala lets you specify default values for function parameters. The argument
for such a parameter canoptionally be omitted from a function call, in which
case the corresponding argument will be filled in with the default. If you
specify one of the parameters, then first argument will be passed using that
parameter and second will be taken from default value.
 */

// Try the following example, it is an example of specifying default parameters for a function −

object Demo {
  def main(args: Array[String]) = {
    println("Returned Value: " + addInt());
    println("Returned Value: " + addInt(3));
    println("Returned Value: " + addInt(1, 2));
  }

  def addInt(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }
}

/* Output
Returned Value: 12
Returned Value: 10
Returned Value: 3
 */
