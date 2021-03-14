/* Implicit Parameter
The implicit parameter is mainly used for two purposes: first, to avoid explicitly passing objects
that are commonly passed from one method to another(e.g., sockets, database connections, etc.).
This will be very easy to understand with an example. First, suppose we have a Connection type that
represents a connection to a database. All methods that connect to the database must pass this
Connection type.
  def useDatabase1(...., conn: Connection)
  def useDatabase2(...., conn: Connection)
  def useDatabase3(...., conn: Connection)
These three methods all take the Connection type as an argument, but you have to explicitly pass
in the Connection object each time you call them, which is a pain in the ass. This is where the
implicit parameter comes into play. Rewrite the above method definition as follows:
  def useDatabase1(....)(implicit conn: Connection)
  def useDatabase2(....)(implicit conn: Connection)
  def useDatabase3(....)(implicit conn: Connection)
There is a restriction that the implicit modifier must be attached to the first element of the argument,
and a carylized method definition is required to use the implicit parameter.
When a method defined in this way is called, the Scala compiler will implicitly pass the most recent
value marked as implicit to the method, tracing back from the current scope. Marking a value as implicit
can be done, for example, as follows:
  implicit val connection: Connection = connectDatabase(....)
By doing so, it will implicitly pass the Connection object to the last argument list. This kind of implicit
parameter usage is frequently seen in the Play 2 Framework and various O/R mappers in Scala.
 */

// By using implicit parameter, it is possible to infer without explicitly passing
// IntAdditive and StringAdditive.

object Demo {
  trait Additive[A] {
    def plus(a: A, b: A): A
    def zero: A
  }

  implicit object StringAdditive extends Additive[String] {
    def plus(a: String, b: String): String = a + b
    def zero: String = ""
  }

  implicit object IntAdditive extends Additive[Int] {
    def plus(a: Int, b: Int): Int = a + b
    def zero: Int = 0
  }

  def sum[A](lst: List[A])(implicit m: Additive[A]) =
    lst.foldLeft(m.zero) { (x, y) => m.plus(x, y) }

  def main(args: Array[String]) = {
    println(sum(List(1, 2, 3)))
    println(sum(List("A", "B", "C")))
  }
}
