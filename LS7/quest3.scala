object Q3 extends App{
    
    def isPrime(number: Int): Boolean = {
        if (number <= 1) false
        else if (number == 2) true
        else !(2 to (number - 1)).exists(i => number % i == 0) 
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(isPrime)
    }

    println("Enter a list of integers separated by spaces:")
    val inputStr = scala.io.StdIn.readLine()
    
    // Convert the input string to a list of integers
    val numbers = inputStr.split(" ").map(_.toInt).toList

    val output = filterPrime(numbers)
    println("Prime Numbers: " + output)
}