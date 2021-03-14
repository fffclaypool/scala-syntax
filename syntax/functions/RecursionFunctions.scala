/* Recursion Functions
Recursion plays a big role in pure functional programming and Scala supports
recursion functions very well. Recursion means a function can call itself
repeatedly. Try the following program, it is a good example of recursion where
factorials of the passed number are calculated.
 */

object Demo {
  def main(args: Array[String]) = {
    for (i <- 1 to 10)
      println("Factorial of " + i + ":=" + factorial(i))
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }
}

/* Output
Factorial of 1:=1
Factorial of 2:=2
Factorial of 3:=6
Factorial of 4:=24
Factorial of 5:=120
Factorial of 6:=720
Factorial of 7:=5040
Factorial of 8:=40320
Factorial of 9:=362880
Factorial of 10:=3628800
 */
