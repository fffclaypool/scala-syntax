/* Function Definitions
A Scala function definition has the following form −

  def functionName ([list of parameters]) : [return type] = {
     function body
     return [expr]
  }

Here, return type could be any valid Scala data type and list of parameters will be a list
of variables separated by comma and list of parameters and return type are optional.
Following is the function which will add two integers and return their sum −

  object add {
     def addInt( a:Int, b:Int ) : Int = {
        var sum:Int = 0
        sum = a + b
        return sum
     }
  }

A function, that does not return anything can return a Unit that is equivalent to void
in Java and indicates that function does not return anything. The functions which do not
return anything in Scala, they are called procedures.
Here is the syntax −

  object Hello{
     def printMe( ) : Unit = {
        println("Hello, Scala!")
     }
  }
 */

/* Calling Functions
Scala provides a number of syntactic variations for invoking methods. Following is the
standard way to call a method.

  functionName( list of parameters )

If a function is being called using an instance of the object, then we would use dot
notation similar to Java as follows −

  [instance.]functionName( list of parameters )
 */

// Try the following example program to define and then call the same function.
object Demo {
  def main(args: Array[String]) = {
    println("Returned Value:" + addInt(5, 7));
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }
}
