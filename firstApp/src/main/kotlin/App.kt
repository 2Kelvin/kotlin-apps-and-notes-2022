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