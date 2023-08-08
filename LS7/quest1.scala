object quest1 extends App {

    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(number => number % 2 == 0)
    }

    println("Enter a list of integers separated by spaces:")
    val inputStr = scala.io.StdIn.readLine()
    
    // Convert the input string to a list of integers
    val numbers = inputStr.split(" ").map(_.toInt).toList
    
    val evenNumbers = filterEvenNumbers(numbers)
    println("Even numbers: " + evenNumbers)
    
}