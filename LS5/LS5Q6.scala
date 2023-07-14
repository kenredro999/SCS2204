object LS5Q6 extends App {

    def fibonacci(n:Int):Int = {

        if (n==0)   { return 0 }
        else if (n==1)  { return 1 }
        else    { return fibonacci(n-1) + fibonacci(n-2) }        

    }

    def printFibbonacci(n:Int, m:Int):Unit = {
        if (m-n >= 0 && n>0) { 
            print(fibonacci(m-n) + "  ")
            printFibbonacci(n-1, m)
        }
    }

    print("Number: ")
    var num = scala.io.StdIn.readInt()
    printFibbonacci(num, num)
}