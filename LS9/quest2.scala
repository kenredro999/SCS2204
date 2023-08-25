object quest2 extends App {
    class Rational(n: Int, d: Int) {
        require(d != 0, "Denominator cannot be zero")
        
        private val gcdVal = gcd(n.abs, d.abs)
        val numer = n / gcdVal
        val denom = d / gcdVal
        
        private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
        
        def neg: Rational = new Rational(-numer, denom)
        
        def sub(that: Rational): Rational = {
            new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
        }
        
        override def toString: String = s"$numer/$denom"
    }

    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)    // (3/4 - 5/8 - 2/7) = -9/56
    println(result)
}