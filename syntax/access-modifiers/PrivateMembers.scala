/*Private Members
A private member is visible only inside the class or object that contains the member definition.
Following is the example code snippet to explain Private member −
 */

object Demo {
  class Outer {
    class Inner {
      private def f() = { println("f") }

      class InnerMost {
        f() // OK
      }
    }
    (new Inner).f() // Error: f is not accessible
  }

  def main(args: Array[String]): Unit = {
    new Outer()
  }
}

/*
In Scala, the access (new Inner). f() is illegal because f is declared private in Inner
and the access is not from within class Inner. By contrast, the first access to f in class
Innermost is OK, because that access is contained in the body of class Inner.
 */
