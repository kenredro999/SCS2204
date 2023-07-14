object LS5Q4 extends App {

    def isEven(n:Int):Boolean = {
        if (n==0) { return true }
        else { !(isEven(n-1)) }
    }

    print("Number: ")
    var num = scala.io.StdIn.readInt()
    
    if (isEven(num))    {println("Number is Even")}
    else                {println("Number is Odd")}

}