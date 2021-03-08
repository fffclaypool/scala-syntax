/*Protected Members
A protected member is only accessible from subclasses of the class in which the member is defined.
Following is the example code snippet to explain protected member −
 */

object Demo {
  class Super {
    protected def f() = { println("f") }
    f() // OK
  }

  class Sub extends Super {
    f() // OK
  }

  class Other {
    (new Super).f() // Error: f is not accessible
  }

  def main(args: Array[String]): Unit = {
    new Other()
  }
}

/*
The access to f in class Sub is OK because f is declared protected in ‘Super’ class and ‘Sub’ class
is a subclass of Super. By contrast the access to f in ‘Other’ class is not permitted, because
class ‘Other’ does not inherit from class ‘Super’.
 */
