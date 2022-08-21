fun main() {
    val simba = Dog("Simba", "Mixed", 24)
    println("Simba says ${simba.bark()}")

    // updating simba's weight property
    simba.weight = 27
    println("Simba's new weight is ${simba.weight} kilograms")
    println("Hey ${simba.name}. You're a ${simba.breed} breed that weighs ${simba.weight} pounds.")
    simba.activities = arrayOf("running", "searching for bones")
    println("${simba.name} loves ${simba.activities[0]} and ${simba.activities[1]}")
    println("${simba.name}'s weight in kilograms is ${simba.weightInKgs}")
    println()

    // creating Pus, a Cat object
    val pus = Cat("Puss", "White", "Female")
    println("Hi, am ${pus.name} and I ${pus.purr()}")
    println()

    // creating an array of dogs
    // since the dog objects in the array are of the same class; Dog, the array type is --> Array<Dog> (array of class Dog)
    val dogs = arrayOf(Dog("Mady", "Chihuahua", 15), Dog("Bolt", "Poodle", 32))

    // this array contains Dog & Cat class objects, therefore it's of type any --> Array<Any>
    val catsNDogs = arrayOf(Cat("Fio", "Grey", "Female"), Dog("Kyle", "Mixed", 15))

    // accessing $ printing Dog object's 2 properties through the array
    println("Hi, am ${dogs[1].name} and am a ${dogs[1].breed}. ${dogs[1].bark()} ${dogs[1].bark()}")
    println()

    // updating a Dog object's breed property through the array & calling its method
    dogs[0].breed = "German Shepherd"
    println("My name is ${dogs[0].name} and from now on am a ${dogs[0].breed}. ${dogs[0].bark()} ${dogs[0].bark()}")
}

// Class Dog
class Dog(val name: String, breedParam: String, weightParam: Int) {
    // this is an initializer block
    init {
        println("The dog's name property has been assigned a value")
    }

    // initially, initialized in the constructor, but I wanted to convert the breed input to capitals first
    var breed = breedParam.uppercase()
    // default property (all dogs created through this class will have it)
    var activities = arrayOf("walking")

    // this property has a custom getter that returns the weight in kgs
    // this property hasn't been assigned a value(initialized) since it's value is derived from its getter function
    // Each time the property’s value is asked for, the getter is called, which figures out the value that should be returned
    val weightInKgs: Double
        get() = weight/2.2

    // adding a custom setter to the weight property so that the weight can ONLY be updated to a value greater than 0
    // moved the weight property from the constructor to the class' body in order to make a custom setter function
    // If you try to update the weight property to a value that’s less than or equal to 0...
    // ...the setter stops the property from being updated
    var weight = weightParam
        set(value) {
            if (value > 0) field = value
        }

    fun bark(): String {
        return if (weight > 20) "Woof!" else "Yip!"
    }

    // this is an initializer block
    init {
        println("$name (a Dog object) has been created")
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

// properties are defined in the class' constructor
// when creating an object, these properties are assigned values and initialized inside the object

// CREATING DEFAULT PROPERTIES
// you can do this by initializing the property inside the class
// this means that every object created through that class, will have that property by default
// e.g. property 'activities' above in the Dog class is a default property

// INITIALIZER BLOCK(S)
// runs when an object is being created
// --> they are executed when the object is initialized, immediately after the constructor is called
// to use an initializer block, use the keyword "init"
// you can use multiple initializer blocks in one class
// Each one runs in the order in which it appears in the class body
// use an initializer block to insert code that you want to run when an object has been initialized
// NOTE: the code in the Constructor runs 1st followed by the code in the Class' body
// that means, the properties in the Constructor are created first before the Class' code block runs & creates other default properties and methods
// if an initializer block is used in-front of a default property initialization in the class code block...
// ...the initializer block runs 1st then the default properties are created after

// *** you MUST initialize properties before you try to use them ***
// i.e. all properties, just like variables, have to be assigned values before being used

// it's OK to have a class without a constructor i.e. the constructor is empty || a class with an empty constructor
// objects created through such a class, will 'inherit' the default properties/methods in the class' code block
// skip the parentheses for classes with no constructors Or include the parentheses but let it be empty inside/ no parameters/ instance variables
// an empty constructor --> is a constructor with no parameters / instance variables

// CUSTOM GETTERS & SETTERS -->  used to get and set values from/to properties
// GETTER -> returns a value from a property
// it's a get() function with NO parameters that you add to the property you want to custom make
// You write it immediately below the property declaration of the property you are custom-making
// Its return type MUST match that of the custom property whose value you want to return or the code won’t compile
// i.e. if your custom property returns a Long, your getter; get() should also return Long, and so on...
// each time you ask for the value of a property, e.g. simba.weightInKgs ... the property's get() function gets called and returns the value you asked for.
// for the above getter, since it's custom, it first converts the weight into kgs then returns the value
// A custom getter lets you control what value is returned when the property value is requested

// SETTER -> takes an argument and sets it as the value for the property
// it's a set() added beneath the property you want to custom-make
// it has ONE PARAMETER called "value" --> which is the value of the property
// A property’s setter runs each time you try to set a property’s value
// The setter updates the value of a property through the "field" identifier
// 'field' is a reference to the value of the property (a backing field)...
// it helps avoid using the property's name in the setter & getter, therefore saving us from being stuck in an endless loop
// a custom setter lets you validate a value before assigning it to a property
// custom getters and setters protect your property values and controls what values are returned / assigned
// Behind the scenes, the compiler secretly creates getters and setters for all properties (that don’t already have one manually written)
// if a property is defined using val, the compiler adds a getter (no setter because you can't change / update val)
// if a property is defined using var, the compiler adds both a getter and a setter
// whenever you use the dot operator to get or set a property’s value, ...
// ...behind the scenes it's always the property’s getter or setter that gets called.
// Removing direct access to a property’s value by wrapping it in getters and setters is known as "data hiding"
// Adding a getter and setter to every property means that there’s a standard way of accessing a property’s value
// The getter handles any requests to get the value
// the setter handles any requests to set the value
// default "getter" and "setter" in every property:
                    /*
                        get() = field
                        set(value) {
                          field = value
                        }
                    */