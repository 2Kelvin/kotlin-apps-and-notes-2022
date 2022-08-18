fun main() {
    val gameArrOptions = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(gameArrOptions)
    println(getUserChoice(gameArrOptions))
}

// function computer choice
fun getGameChoice(anArray: Array<String>) = anArray[(Math.random() * anArray.size).toInt()]

// function user's choice
fun getUserChoice(optionsArr: Array<String>) {
    print("Please enter one of the following: ")
    for (userChoice in optionsArr) print(" $userChoice")
    println(".")

    val userInput = readLine()
}


// a function  ->  REUSABLE chunk of code that performs a SPECIFIC TASK
// if a function has a parameter, you MUST pass it an argument
// the argument MUST be a value of the appropriate type i.e. argument's value type should be same as parameter type
// e.g. you cannot pass a String argument in place of an Int parameter, this will result in a compile error
// a parameter is nothing more than a local variable: ->
// -> a variable with a name and type that’s 'used inside the body of the function'
// if a function has multiple parameters, you must pass arguments of the right type in the right order
// the arguments you pass land in the function in the same order you passed them
// the first argument lands in the first parameter & the second argument lands in the second parameter and so on ...
// each argument you pass MUST be the same type as the parameter it lands in
// if a function returns something, then you have to declare this after the closing bracket of the function parameter(s)
// declare the type it returns
// If you declare that a function returns a value, then you must return a value of the declared type
// i.e. if you declare a function returns an "Int" then you cannot  return e.g. a "String" or a "Byte" e.t.c.
// failure to adhere to this, results in a compile error
// if you don't want your function to return anything, either * omit the return type declaration OR
// declare a return type of "Unit"
// "Unit" means that the function returns no value
// trying to return a value from a function that doesn't return one, causes a compile error
// if a function returns only one statement/ expression, simplify your code by REMOVING the curly braces and return statement
// after, use " = " to signify the function returns something
// since the compiler can infer the function’s return type from the single expression, you can omit it's return type
// A function can declare ONLY one return value
// to return more than one value from a function: make the function return an array of a single type
// then put the values you want to return from the function in an array; all values should be of the same type as the function's return array type

// local variables -> are variables defined inside a function
// they can only be used inside the function they were defined in
// trying to access them outside the function they were defined in, causes a compile error
// you must initialize a variable before returning it from the function.
// function parameters are local variables as they can only be used in the function & are also defined in the function
// parameter variables are treated as local variables created using val
// therefore, you CANNOT reassign their values
// you can’t assign a new value to any of a function’s parameter variables

// FOR LOOP
// useful in situations where you want to loop through a fixed range of numbers, or through every item in an array
// looping through a range of numbers e.g. (1 to 10) -> for (x in 1..10) { }
// it means for each number between 1 and 10, assign the number to a variable named x, and run the body of the loop
// specify a range of values using '..' operator
// at the beginning of each loop, it assigns the variable given ('x' in our case) to the current number in the loop
// if the body loop consists of a single expression/ statement, omit the curly braces
// in -> 1..10 -> the 1 is the start number and 10 is the end number; they'll all be used in the body loop code
// if you wanted to exclude the end number e.g. 10, use keyword "until" e.g. for (x in 1 until 10) {}
// this will use numbers 1 to 9 and will exclude number 10
// increment operator shortcut: (x++)  : same as (x = x + 1)
// decrement operator shortcut: (x--)  : same as (x = x - 1)
// If you want to add a number other than 1 to a variable, you can use the (+= )operator e.g. (x += 7) : same as (x = x + 7)
// Similarly, you can use shortcuts:
// -->  (-=) for subtraction
// -->  (*=) for multiplication and
// -->  (/=) for division

// While loops run while a given "condition" is true || For loops run over a "range" of values or items
// if you want to loop in reverse order, use "downTo" --> replace '..' or 'until' with 'downTo'
// also place the largest number as the 1st one & the smallest one as the last number
// e.g. for (x in 10 downTo 1) {}
// '..' , 'until' and 'downTo' step through the range one number at a time
// to skip numbers in a range, use the keyword "step" followed by a number of how much you want to skip by
// e.g. for (1 in 1..10 step 2) {} -->  this will use the numbers; 1, 3, 5, 7 and 9

// for loops are also mostly used to iterate through items in an array

// "readLine()" function is used to read the user's input
// it reads a line of input from the standard input stream e.g. an IDE output window
// it returns a String value; the text entered by the user
// If the input stream for your application has been redirected to a file, the
// readLine() function returns null if the end of file has been reached
// null means 'no value'