fun main() {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = calculateArraySize(wordArray1)
    val arraySize2 = calculateArraySize(wordArray2)
    val arraySize3 = calculateArraySize(wordArray3)

    val rand1 = randomArrayIndex(arraySize1)
    val rand2 = randomArrayIndex(arraySize2)
    val rand3 = randomArrayIndex(arraySize3)

    val randomPhrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(randomPhrase)
}

// reusable function that calculates the size of an array
fun calculateArraySize(array: Array<String>): Int {
    return (array.size)
}

//function random generator
fun randomArrayIndex(theArraySize: Int): Int {
    return (Math.random() * theArraySize).toInt()
}