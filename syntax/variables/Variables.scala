object Variables {
  def variableDeclaration(): Unit = {
    // Here, myVar is declared using the keyword var.
    // It is a variable that can change value and this is called mutable variable.
    var myVar: String = "Foo"

    // Here, myVal is declared using the keyword val.
    // This means that it is a variable that cannot be changed and this is called immutable variable.
    val myVal: String = "Foo"
  }

  def variableDataTypes(): Unit = {
    // The type of a variable is specified after the variable name and before equals sign.
    // You can define any type of Scala variable by mentioning its data type as follows −
    // val or val VariableName : DataType = [Initial Value]
  }

  def variableTypeInference(): Unit = {
    // When you assign an initial value to a variable, the Scala compiler can figure out
    // the type of the variable based on the value assigned to it.
    // This is called variable type inference.
    // Here, by default, myVar will be Int type and myVal will become String type variable.
    var myVar = 10;
    val myVal = "Hello, Scala!";
  }

  def multipleAssignments(): Unit = {
    // Scala supports multiple assignments. If a code block or method returns a Tuple,
    // the Tuple can be assigned to a val variable.
    val (myVar1: Int, myVar2: String) = (40, "Foo")
    val (myVar11, myVar22) = (40, "Foo")
  }
}

// The following is an example program that explains the process of variable declaration in Scala.
// This program declares four variables — two variables are defined with type declaration and
// remaining two are without type declaration.
object Demo {
  def main(args: Array[String]) = {
    var myVar: Int = 10;
    val myVal: String = "Hello Scala with datatype declaration.";
    var myVar1 = 20;
    val myVal1 = "Hello Scala new without datatype declaration.";

    println(myVar);
    println(myVal);
    println(myVar1);
    println(myVal1);
  }
}
