object LS5Q5 extends App {

    def sumOfEvenTo(n:Int):Int = {
        if (n>0) {
            if (isEven(n)) { n + sumOfEvenTo(n-1) }
            else { sumOfEvenTo(n-1) }
        }
        else return 0
    } 

    def isEven(n:Int):Boolean = {
        if(n==0) return true
        else return !(isEven(n-1))
    }

    print("Number: ")
    var num = scala.io.StdIn.readInt()
    print(sumOfEvenTo(num))
}