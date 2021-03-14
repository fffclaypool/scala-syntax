object Demo {
  def main(args: Array[String]) = {
    creatingString()
    stringLength()
    concatenatingStrings()
    creatingFormatStrings()
    stringInterpolator()
  }

  def creatingString() = {
    val greeting: String = "Hello, world!"

    // Hello, world!
    println(greeting)
  }

  def stringLength() = {
    val palindrome = "Dot saw I was Tod";
    val len = palindrome.length();

    // String Lentgh is:17
    println("String Lentgh is:" + len);
  }

  def concatenatingStrings() = {
    val str1 = "Dot saw I was ";
    val str2 = "Tod";

    // Dot saw I was Tod
    println(str1.concat(str2))

    // Dot Dot saw I was Tod
    println("Dot " + str1 + str2)
  }

  def creatingFormatStrings() = {
    val floatVar = 12.456
    val intVar = 2000
    val stringVar = "Hello, Scala!"

    val fs = printf(
      "The value of the float variabe is %f, "
        + "while the value of the integer variable is %d, "
        + "and the string is %s",
      floatVar,
      intVar,
      stringVar
    );

    // The value of the float variabe is 12.456000,
    // while the value of the integer variable is 2000,
    // and the string is Hello, Scala!()
    println(fs)
  }

  def stringInterpolator() = {
    val name = "James"
    val height = 1.9d

    // Hello, James
    println(s"Hello, $name")

    // 1 + 1 = 2
    println(s"1 + 1 = ${1 + 1}")

    // 1.9
    println(height)

    // James is 1.90 meters tall
    println(f"$name%s is $height%2.2f meters tall")

    /*
    Result =
     a
     b
     */
    println(s"Result = \n a \n b")

    // Result = \n a \n b
    println(raw"Result = \n a \n b")
  }
}
