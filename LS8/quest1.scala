object quest1 extends App {
    def calculateInterest(depositAmount: Double): Double = depositAmount match {
    case amount if amount <= 20000 => 0.02 * amount
    case amount if amount <= 200000 => 0.04 * amount
    case amount if amount <= 2000000 => 0.035 * amount
    case _ => 0.065 * depositAmount
    }

    print("Enter the deposit amount: ")
    val depositAmount = scala.io.StdIn.readDouble()
    val interestEarned = String.format("%.2f", calculateInterest(depositAmount))
    println(s"Interest earned in a year: Rs. $interestEarned")

}