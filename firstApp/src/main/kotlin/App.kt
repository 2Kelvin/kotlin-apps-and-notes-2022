// all Kotlin code goes to the 'src' folder
// "main function" is the starting point of all Kotlin applications
// when you run the application, 'main' is automatically executed
// there can only be one main function in a Kotlin file/application

fun main() {
    // WHILE LOOP
    var x = 1
    println("Before the loop, x = $x.")
    while (x < 4) {
        println("In the loop, x = $x.")
        x++
    }
    println("After the loop, x = $x.")

    // IF STATEMENT/ EXPRESSION
    val number = 59
    val total = 30
    // using an if as an expression i.e. to return a value
    println(if (number < total) "The number is less than $total" else "The number is higher than the $total")
    println("This line prints no matter what")

    // example
    var a = 1
    while (a < 3) {
        print(if (a == 1) "Yab" else "Dab")
        print("ba")
        a++
    }
    if (a == 3) println("Do")
}

//the 3 standard looping constructs in Kotlin are: "while", "for" & "do while"
// WHILE LOOP
    // so long as the condition is true, execute the while-loop code block (code inside curly braces {} )
    // whatever needs to be repeated is inside that code block AKA loop block
    // omit the curly braces {} if you only have one line of code/ one statement in the loop block

// When you use if as an expression, you MUST include an else clause

// Kotlin has four basic integer types: Byte, Short, Int and Long
// If the integer you assign to a variable is too large to fit into an Int, it will use a Long instead
// you can directly declare a Long by adding an "L" to the end of the value/integer e.g. var d  = 4L
// Byte is 8 bits(-128 to 127); Short is 16 bits(-32768 to 32767);
// Int is 32 bits(-2147483648 to 2147483647) & Long is 64 bits(huge to (huge - 1))

// There are two basic floating-point types: Float and Double
// Floats can hold 32 bits, whereas Doubles can hold 64 bits
// a value with a floating point(decimal) is of type Double e.g. var j = 4.5
// to declare a float type value, add an "F" / "f" at the end e.g. var j = 4.5f

// Booleans: The value is assigned either "true" or "false"

// character type variables hold a single character e.g. var grade = 'A'
// a character variable uses single quotes for its  assigned value/ character (see example above)
// strings are multiple characters joined together
// therefore, a string type variable holds multiple characters e.g. val name = "Zoe"
// a string variable uses double quotes

// explicitly declaring variables e.g. var name: String, var h: Int, var g: Short, var tinyNum: Byte
// you can also declare a variable & assign a value too. e.g. var t: Short = 5

// you MUST initialize a variable before you use it, or you’ll get a compiler error
// that is, you must give it a value first before using it
// this compiles with an error e.g. var x: Int  var y = x + 3
// a compile error also happens when you assign a wrong value to a variable type e.g. var x: Int = "Hello"
// the value should be compatible with the variable’s type

// ASSIGNING VALUES TO VARIABLES OF DIFFERENT TYPES/ CONVERTING TYPES
// do so by using the data type (object's) functions
// objects have both state and behavior (properties & methods)
// E.g. converting an "Int" to "Long" - use the Int object's method 'toLong'
// toLong converts Int objects to Long objects
// example: var r: Int = 5   var y: Long = r.toLong()
// Every numeric type has the following conversion functions: toByte(), toShort(),
// toInt(), toLong(), toFloat() and toDouble().
// when you’re converting numeric values from one type to
//another, make sure the type is large enough for the value otherwise you may get unexpected results in your code
// e.g. converting a large Long variable to an Int
// converting a floating-point to an Int results in all the decimals being chopped off
// e.g. var i = 89.843  var r = i.toInt()  result: r = 89

// ARRAYS
// create one using: "arrayOf()"
// it's a tray of cups where each cup is a variable: the cup variable name is the array index
// get the value of an item in the array by referencing the array variable with an index
// e.g. var myArray = arrayOf(1,2,3,)  ->  myArray[0] -> fetches the 1st item in the array
// to get the size/ length of the array -> "myArray.size"