/* Currying Functions
Currying transforms a function that takes multiple parameters into a
chain of functions, each taking asingle parameter. Curried functions
are defined with multiple parameter lists, as follows −
 */

object Demo {
  def main(args: Array[String]) = {
    val str1: String = "Hello,"
    val str2: String = " Scala"
    val str3: String = " World!"

    println("strcat(str1)_: " + strcat(str1)_)
    println("strcat(str2)_: " + strcat(str2)_)
    println("strcat(str3)_: " + strcat(str3)_)

    println("strcat(str1)(str2)_: " + strcat(str1)(str2)_)

    val strcatStr1Str2 = strcat(str1)(str2)_
    println("strcatStr1Str2(str3): " + strcatStr1Str2(str3))

    println("strcat(str1)(str2)(str3): " + strcat(str1)(str2)(str3))
  }

  def strcat(s1: String)(s2: String)(s3: String) = {
    s1 + s2 + s3
  }
}

/* Output
strcat(str1)_: Demo$$$Lambda$99/0x0000000800c38840@50f8360d
strcat(str2)_: Demo$$$Lambda$100/0x0000000800c38c10@153f5a29
strcat(str3)_: Demo$$$Lambda$101/0x0000000800c39040@69d9c55
strcat(str1)(str2)_: Demo$$$Lambda$102/0x0000000800c39410@7ca48474
strcatStr1Str2(str3): Hello, Scala World!
strcat(str1)(str2)(str3): Hello, Scala World!
 */
