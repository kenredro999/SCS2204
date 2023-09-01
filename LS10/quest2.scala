object quest2 extends App {
    
    def countLetterOccurrences(words: List[String]): Int = {
        
        // Transform words into their respective lengths using the map function
        val wordLengths = words.map(word => word.filter(_.isLetter).length)

        // Calculate the total count of letter occurrences using the reduce function
        val totalCount = wordLengths.reduce((a, b) => a + b)

        totalCount
    }

    // Example usage:
    val wordList = List("apple", "banana", "cherry", "date", "24")
    val totalLetterCount = countLetterOccurrences(wordList)
    println(s"Total count of letter occurrences: $totalLetterCount")

}