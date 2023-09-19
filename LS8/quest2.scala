object quest2 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer input.")
    } else {
      try {
        val inputValue = args(0).toInt
        val message = inputValue match {
          case x if x <= 0 => "Negative/Zero is input"
          case x if x % 2 == 0 => "Even number is given"
          case _ => "Odd number is given"
        }
        println(message)
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Please provide a valid integer.")
      }
    }
  }
}
