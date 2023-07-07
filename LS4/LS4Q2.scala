object LS4Q2 {

  def numPatternMatch( num:Int ):String = {
    val res = num match {
      case x if x<=0   => "Zero/Negative number is given"
      case x if x%2==0 => "Even number is given"
      case _           => "Odd number is given"
    }
    return res
  }

  def main( args:Array[String] ):Unit = {
    print("Number: ")
    val num = scala.io.StdIn.readInt()
    println(numPatternMatch(num))
  }
  
}
