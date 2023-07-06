object LS4Q1 {

  def intRate( dep:Float ):Float = {
    	 if	( dep >=2000000 ) return 0.065
    else if	( dep >= 200000 ) return 0.035
    else if	( dep >=  20000 ) return 0.04
    else if	( dep >       0 ) return 0.02
    else			  return 0
  }
  
  def interest( dep:Float ):Double = {
    return BigDecimal(dep*intRate(dep)).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args:Array[String]):Unit = {
    print("Deposite: ")
    val deposite = scala.io.StdIn.readFloat()
    println("interest: " + interest(deposite))
  }

}
