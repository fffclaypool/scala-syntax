/*Public Members
Unlike private and protected members, it is not required to specify Public keyword for Public members. There is no explicit
modifier for public members. Such members can be accessed from anywhere.
Following is the example code snippet to explain public member −
 */

object Demo {
  class Outer {
    class Inner {
      def f() = { println("f") }

      class InnerMost {
        f() // OK
      }
    }
    (new Inner).f() // OK because now f() is public
  }

  def main(args: Array[String]): Unit = {
    new Outer() // OK because now f() is public
  }
}
