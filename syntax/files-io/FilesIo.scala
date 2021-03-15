/* Files I/O
Scala is open to make use of any Java objects and java.io.File is one of the
objects which can be used in Scala programming to read and write files.
 */

import java.io._
import scala.io._

object Demo {
  def main(args: Array[String]) = {
    basicOperations()
    readingLineFromCommandLine()
    readingFileContent()
  }

  def basicOperations() = {
    val writer = new PrintWriter(new File("test.txt"))

    // Hello Scala
    writer.write("Hello Scala")
    writer.close()
  }

  def readingLineFromCommandLine() = {
    // Please enter your input: Hello World
    print("Please enter your input: ")

    val line = StdIn.readLine

    // Thanks, you just types: Hello World
    println("Thanks, you just types: " + line)
  }

  def readingFileContent() = {
    println("Following is the content read: ")

    Source.fromFile("Demo.txt").foreach {
      // Scala combines object-oriented and functional programming.
      print
    }

    print("\n")
    println("File reading end.")
  }
}
