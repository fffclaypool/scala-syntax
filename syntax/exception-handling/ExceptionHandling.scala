/* ExceptionHandling
When you want to handle exceptions, you use a try{...}catch{...} block like you would
in Java except that the catch block uses matching to identify and handle the exceptions.
 */

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Demo {
  def main(args: Array[String]) = {
    // Missing file exception
    catchingExceptions()
    // Missing file exception
    // Exiting finally...
    finallyClause()
  }

  def catchingExceptions() = {
    /*
    Scala allows you to try/catch any exception in a single block and then perform
    pattern matching against it using case blocks.
     */

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }

  def finallyClause() = {
    /*
    You can wrap an expression with a finally clause if you want to cause some code
    to execute no matter how the expression terminates.
     */

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    } finally {
      println("Exiting finally...")
    }
  }
}
