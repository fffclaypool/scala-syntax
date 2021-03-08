// The definition of EnrichMyLibrary.scala can be rewritten as follows in Scala 2.10 or later.

import scala.language.implicitConversions

object Demo {
  implicit class RichString(val src: String) {
    def smile: String = src + ":-)"
  }
  def main(args: Array[String]) = {
    println("Hi, ".smile)
  }
}

/* Output
Hi, :-)
 */
