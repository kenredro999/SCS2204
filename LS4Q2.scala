object secondQuest {

  def numPatternMatch( num:Int ):Unit = {
    val res = num match {
      case x if x<=0   => "Zero/Negative number is given"
      case x if x%2==0 => "Even number is given"
      case _	       => "Odd number is given"
    }
  }
  
}
