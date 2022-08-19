fun main() {
    val simba = Dog("Simba", "Mixed", 24)
    println("Simba says ${simba.bark()}")

    // updating simba's weight property
    simba.weight = 27
    println("Simba's new weight is ${simba.weight} kilograms")
    println("Hey ${simba.name}. You're a ${simba.breed} breed that weighs ${simba.weight} kilograms.")

    // creating Pus, a Cat object
    val pus = Cat("Puss", "White", "Female")
    println("Hi, am ${pus.name} and I ${pus.purr()}")

    // creating an array of dogs
    // since the dog objects in the array are of the same class; Dog, the array type is --> Array<Dog> (array of class Dog)
    val dogs = arrayOf(Dog("Mady", "Chihuahua", 15), Dog("Bolt", "Poodle", 32))

    // this array contains Dog & Cat class objects, therefore it's of type any --> Array<Any>
    val catsNDogs = arrayOf(Cat("Fio", "Grey", "Female"), Dog("Kyle", "Mixed", 15))

    // accessing $ printing Dog object's 2 properties through the array
    println("Hi, am ${dogs[1].name} and am a ${dogs[1].breed}. ${dogs[1].bark()} ${dogs[1].bark()}")

    // updating a Dog object's breed property through the array & calling its method
    dogs[0].breed = "German Shepherd"
    println("My name is ${dogs[0].name} and from now on am a ${dogs[0].breed}. ${dogs[0].bark()} ${dogs[0].bark()}")
}

// Class Dog
class Dog(val name: String, var breed: String, var weight: Int) {
    fun bark(): String {
        return if (weight > 20) "Woof!" else "Yip!"
    }
}

// Class Cat
class Cat(val name: String, val color: String, val sex: String) {
    fun purr(): String {
        return if (sex == "Female") "purr" else "zzz"
    }
}


// Class --> a TEMPLATE that allows you to create your own types of objects || it's an object template
// it defines what properties and functions are associated with objects of a particular type
// it tells the compiler how to create the object - what properties and methods each object should have
// the basic Kotlin types (String, Int, Boolean, Long ...) are created using a class
// e.g. var i = 5 --> means you've created an Int object with a value of 5
// -->  and assigned its reference to the variable i
// -->  this Int object created, is created using a class...
// -->  ... i.e. an Int Class that has properties & functions defining how an Int object should be & act like
// the same goes for the other types too with their own respective classes
// knowing this, you can therefore create your own classes, which create custom objects that Kotlin doesn't have
// an object has 2 things: properties (state/data) and functions/ methods (behavior)
// these 2 object things are defined in the class
// each object can have its own unique values for the properties when created through the class
// the object's functions define how the object behaves
// and can use the object's properties if needed
// a function defined inside a class is called a "method"
// therefore, classes & objects have 'properties' and 'methods'
// create an object from a class by PASSING it ARGUMENTS for each of the class' properties
// the arguments passed will be the values for each respective property in the object created
// access an object's property or method by using the dot " . " operator
// any property defined using 'var' can also be updated
// trying to update properties defined using 'val' will just cause a compile error
// just like other Kotlin types, objects can also be used in arrays