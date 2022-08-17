// a function  ->  REUSABLE chunk of code that performs a SPECIFIC TASK
fun main() {
    val gameArrOptions = arrayOf("Rock", "Paper", "Scissors")

    val gameChoice = getGameChoice(gameArrOptions)
}

// function computer choice
fun getGameChoice(anArray: Array<String>) = anArray[(Math.random() * anArray.size).toInt()]

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