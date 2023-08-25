object quest1 extends App {
    class Rational(n: Int, d: Int) {
        require(d != 0, "Denominator cannot be zero")
        
        private val gcdVal = gcd(n.abs, d.abs)
        val numer = n / gcdVal
        val denom = d / gcdVal
        
        private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
        
        def neg: Rational = new Rational(-numer, denom)
        
        override def toString: String = s"$numer/$denom"
    }

    val x = new Rational(3, 4)
    val y = x.neg
    
    println(x)
    println(y)
}