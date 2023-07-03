object Type {
  def main(args: Array[String]): Unit = {

    val list: List[Any] = List(
      "a string",
      732,  // an integer
      'c',  // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )

    list.foreach(el => println(el))

    val face : Char = '☺'
    val number: Int = face

    println(number)
  }
}
