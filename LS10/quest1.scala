object quest1 extends App {
    
    def calculateAverage(temperatures: List[Int]): Double = {
        // Convert Celsius to Fahrenheit using the map function
        val fahrenheitTemperatures = temperatures.map(celsius => (celsius.toDouble * 9/5) + 32)

        // Calculate the sum of Fahrenheit temperatures using the reduce function
        val sumFahrenheit = fahrenheitTemperatures.reduce((a, b) => a + b)

        // Calculate the average Fahrenheit temperature
        val averageFahrenheit = sumFahrenheit / temperatures.length

        averageFahrenheit
    }

    // Example usage:
    val temperaturesCelsius = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(temperaturesCelsius)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")

}