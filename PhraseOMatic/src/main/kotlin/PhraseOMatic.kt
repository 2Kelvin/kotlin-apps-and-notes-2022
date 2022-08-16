// String templates allow you to evaluate complex expressions from inside a String
// e.g. var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"
// you can use Kotlin’s built-in "Random" functions instead to generate random numbers e.t.c
// e.g. kotlin.random.Random.nextInt()  -> generates a random Integer
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
fun calculateArraySize(anArray: Array<String>): Int {
    return (anArray.size)
}

//function random generator
fun randomArrayIndex(theArraySize: Int): Int {
    return (Math.random() * theArraySize).toInt()
}

// The compiler looks at the type of each item in the array, and infers what type of items the array should contain forever
// you get a compile error if you try to add an item of a different type in the array
// Arrays hold items of a specific type e.g. Ints, Strings, e.t.c
// You can either let the compiler infer the type from the array’s values, or
// ###  explicitly define the array type using "Array<Type>" ###
// e.g ->  var byteArray: Array<Byte> = arrayOf(1,2,3)
// simply specify the type of array you want to create by putting the type between the angle brackets (< >)