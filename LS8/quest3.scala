object quest3 extends App {

    // Method to convert a string to upper case
    def toUpper(input: String): String = input.toUpperCase

    // Method to convert a string to lower case
    def toLower(input: String): String = input.toLowerCase

    // Method to format a string using a given formatting function
    def formatNames(name: String)(formatFunc: String => String): String = {
        formatFunc(name)
    }

    // Test1: Benny -> BENNY
    val test1 = "Benny"
    def func1(name:String):String = {
        return toUpper(name)
    }
    val res1 = formatNames(test1)(func1)
    println(s"$test1 => $res1")

    // Test2: Niroshan => NIroshan
    val test2 = "Niroshan"
    def func2(name:String):String = {
        return toUpper(name.substring(0,2)) + toLower(name.substring(2))
    }
    val res2 = formatNames(test2)(func2)
    println(s"$test2 => $res2")

    // Test3: Saman -> saman
    val test3 = "Saman"
    def func3(name:String):String = {
        return toLower(name)
    }
    val res3 = formatNames(test3)(func3)
    println(s"$test3 => $res3")

    // Test4: KumarA => Kumara
    val test4 = "Kumara"
    def func4(name:String):String = {
        return toUpper(name.substring(0,1)) + toLower(name.substring(1, name.length-1)) + toUpper(name.substring(name.length-1))
    }
    val res4 = formatNames(test4)(func4)
    println(s"$test4 => $res4")

}