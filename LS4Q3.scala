object thirdQuestion {

  def toUpper(text:String):String = { return text.toUpperCase }
  
  def toLower(text:String):String = { return text.toLowerCase }
  
  def formatNames(name:String)(strFunc:String => String):String = { return strFunc(name) }

  // This function is for Test2
  def testFunc2( text:String ):String = {
    return (text.head.toString + text.tail.head.toString).toUpperCase + text.tail.tail.toLowerCase
  }
  
  // This function is for Test4
  def testFunc4( text:String ):String = {
      return text.head.toString.toUpperCase + text.substring(1, text.length-1).toLowerCase + text.last.toString.toUpperCase
  }


  def main(args:Array[String]):Unit = {  
    
    // Test1:  Benny -> BENNY
    println( formatNames("Benny")(toUpper) )
  
  
    // Test2:  Niroshan -> NIroshan
    println( formatNames("Niroshan")(testFunc2) )
  
  
    // Test3:  Saman -> saman
    println( formatNames("Saman")(toLower) )
  
  
    // Test4:  Kumara -> KumarA
    println( formatNames("Kumara")(testFunc4) )

  }
}
