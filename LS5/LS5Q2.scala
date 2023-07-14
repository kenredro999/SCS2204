object LS5Q2 extends App {

    def gcd(a:Int, b:Int):Int = {
                if (b==0)   { return a }
        else    if (b>a)    { gcd(b,a) }
        else                { gcd(b, a%b) }
    }

    def prime(n:Int, m:Int=2):Boolean = {
                if (n==m)           { return true  }
        else    if ( gcd(n,m) > 1 ) { return false }
        else                        { prime(n, m+1)}
    }

    def primeSeq(n:Int):Unit = {
        if (n<1) {
            println("-1")
        }
        else if (n==1)  { 
            println("") 
        }
        else {
            if (prime(n)) { print(n + "  ") }
            primeSeq(n-1)
        }
    }

    print("Number: ")
    val num = scala.io.StdIn.readInt()
    primeSeq(num)
    
}