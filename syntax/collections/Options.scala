/* Options
Scala Option[ T ] is a container for zero or one element of a given type. An
Option[T] can be either Some[T] or None object, which represents a missing
value. For instance, the get method of Scala's Map produces Some(value) if a
value corresponding to a given key has been found, or None if the given key
is not defined in the Map.
 */

object Demo {
  def main(args: Array[String]) = {
    basicOperationsOnOptionX()
    basicOperationsOnOptionY()
    usinggetOrElseMethod()
    usingisEmptyMethod()
  }

  def basicOperationsOnOptionX() = {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    // capitals.get( "France" ) : Some(Paris)
    println("capitals.get( \"France\" ) : " + capitals.get("France"))
    // capitals.get( "India" ) : None
    println("capitals.get( \"India\" ) : " + capitals.get("India"))
  }

  def basicOperationsOnOptionY() = {
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

    // show(capitals.get( "Japan")) : Tokyo
    println("show(capitals.get( \"Japan\")) : " + show(capitals.get("Japan")))
    // show(capitals.get( "India")) : ?
    println("show(capitals.get( \"India\")) : " + show(capitals.get("India")))

    def show(x: Option[String]) = x match {
      case Some(s) => s
      case None    => "?"
    }
  }

  def usinggetOrElseMethod() = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    // a.getOrElse(0): 5
    println("a.getOrElse(0): " + a.getOrElse(0))
    // .getOrElse(10): 10
    println("b.getOrElse(10): " + b.getOrElse(10))
  }

  def usingisEmptyMethod() = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    // a.isEmpty: false
    println("a.isEmpty: " + a.isEmpty)
    // b.isEmpty: true
    println("b.isEmpty: " + b.isEmpty)
  }
}
