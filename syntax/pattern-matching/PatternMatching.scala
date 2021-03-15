/* Pattern Matching
A pattern match includes a sequence of alternatives, each starting with the
keyword case. Each alternative includes a pattern and one or more expressions,
which will be evaluated if the pattern matches. An arrow symbol => separates
the pattern from the expressions.
 */

object Demo {
  def main(args: Array[String]) = {
    basicOperationsX()
    basicOperationsY()
    matchingUsingCaseClasses()
  }

  def basicOperationsX() = {
    // many
    println(matchTest(3))

    def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
  }

  def basicOperationsY() = {
    /*
    The block with the case statements defines a function, which maps integers
    to strings. The match keyword provides a convenient way of applying a function
    (like the pattern matching function above) to an object.
     */

    // 2
    println(matchTest("two"))
    // many
    println(matchTest("test"))
    // one
    println(matchTest(1))
    // scala.Int
    println(matchTest(100))

    def matchTest(x: Any): Any = x match {
      case 1      => "one"
      case "two"  => 2
      case y: Int => "scala.Int"
      case _      => "many"
    }
  }

  def matchingUsingCaseClasses() = {
    /*
    The case classes are special classes that are used in pattern matching with
    case expressions. Syntactically, these are standard classes with a special
    modifier: case.

    Adding the case keyword causes the compiler to add a number of useful features
    automatically. The keyword suggests an association with case expressions in
    pattern matching.

    First, the compiler automatically converts the constructor arguments into
    immutable fields (vals). The val keyword is optional. If you want mutable
    fields, use the var keyword. So, our constructor argument lists are now
    shorter.

    Second, the compiler automatically implements equals, hashCode, and toString
    methods to the class, which use the fields specified as constructor arguments.
    So, we no longer need our own toString() methods.

    Finally, also, the body of Person class becomes empty because there are no
    methods that weneed to define!
     */

    // Hi Alice!
    val alice = new Person("Alice", 25)
    // Hi Bob!
    val bob = new Person("Bob", 32)
    // Age: 32 year, name: Charlie ?
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32)   => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + " ?")
      }
    }
  }

  case class Person(name: String, age: Int)
}
