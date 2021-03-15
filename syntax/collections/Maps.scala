/* Maps
Scala map is a collection of key/value pairs. Any value can be retrieved based on
its key. Keys are unique in the Map, but values need not be unique. Maps are also
called Hash tables. There are two kinds of Maps, the immutable and the mutable.
The difference between mutable and immutable objects is that when an object is
immutable, the object itself can't be changed.
 */

object Demo {
  def main(args: Array[String]) = {
    basicOperationsOnMaps()
    concatenatingMaps()
    printKeysValuesFromMap()
    checkForKeyInMap()
  }

  def basicOperationsOnMaps() = {
    val colors =
      Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    // Keys in colors : Set(red, azure, peru)
    println("Keys in colors : " + colors.keys)
    // Values in colors : Iterable(#FF0000, #F0FFFF, #CD853F)
    println("Values in colors : " + colors.values)
    // Check if colors is empty : false
    println("Check if colors is empty : " + colors.isEmpty)
    // Check if nums is empty : true
    println("Check if nums is empty : " + nums.isEmpty)
  }

  def concatenatingMaps() = {
    val colors1 =
      Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 =
      Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")

    // use two or more Maps with ++ as operator
    var colors = colors1 ++ colors2
    // colors1 ++ colors2 : HashMap(blue -> #0033FF, azure -> #F0FFFF, peru ->
    //   #CD853F, yellow -> #FFFF00, red -> #FF0000)
    println("colors1 ++ colors2 : " + colors)

    // use two maps with ++ as method
    colors = colors1.++(colors2)
    // colors1.++(colors2)) : HashMap(blue -> #0033FF, azure -> #F0FFFF, peru ->
    //   #CD853F, yellow -> #FFFF00, red -> #FF0000)
    println("colors1.++(colors2)) : " + colors)
  }

  def printKeysValuesFromMap() = {
    val colors =
      Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    // Key = red Value = #FF0000
    // Key = azure Value = #F0FFFF
    // Key = peru Value = #CD853F
    colors.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + colors(i))
    }
  }

  def checkForKeyInMap() = {
    val colors =
      Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    // Red key exists with value :#FF0000
    if (colors.contains("red")) {
      println("Red key exists with value :" + colors("red"))
    } else {
      println("Red key does not exist")
    }

    // Maroon key does not exist
    if (colors.contains("maroon")) {
      println("Maroon key exists with value :" + colors("maroon"))
    } else {
      println("Maroon key does not exist")
    }
  }
}
