object LS5Q3 extends App {

    def sumTo(n:Int):Int = {
        if (n==1)   { return 1 }
        else        { return n + sumTo(n-1) }
    }

    print("Number: ")
    val n = scala.io.StdIn.readInt()
    print(sumTo(n))

}