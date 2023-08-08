object quest2 extends App {

    def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
    }

    println("Enter a list of integers separated by spaces:")
    val inputStr = scala.io.StdIn.readLine()
    
    // Convert the input string to a list of integers
    val numbers = inputStr.split(" ").map(_.toInt).toList

    val output = calculateSquare(numbers)
    println(output)

}