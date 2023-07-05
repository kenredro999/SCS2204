object thirdQuestion {

  def toUpper(text:String):String = { return text.toUpperCase }
  
  def toLower(text:String):String = { return text.toLowerCase }
  
  def formatNames(name:String)(strFunc:String => String):String { return strFunc(name) }
  
  
  // Test1:  Benny -> BENNY
  println( formatNames("Benny")(toUpper) )
  
  
  // Test2:  Niroshan -> NIroshan
  def testFunc2( text:String ):String = {
    return (text.head.toString + text.tail.head.toString).toUpperCase + text.tail.tail.toLowerCase
  }
  println( formatNames("Niroshan")(testFunc2) )
  
  
  // Test3:  Saman -> saman
  println( formatNames("Saman")(toLower) )
  
  
  // Test4:  Kumara -> KumarA
  def testFunc4( text:String ):String = {
    return text.head.toString.toUpperCase + text.substring(1, text.length-1).toLower + text.last.toString.toUpperCase
  }
  println( formatNames("Kumara")(testFunc4) )

}
