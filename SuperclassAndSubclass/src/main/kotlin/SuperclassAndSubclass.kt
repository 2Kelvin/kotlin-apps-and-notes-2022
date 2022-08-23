// keyword "open" tells the compiler that the class is a 'superclass'
// properties & functions using keyword "open" mean that they can be "overridden" by the subclasses
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise () {
        println("The Animal is making a noise")
    }
    open fun eat () {
        println("The Animal is eating")
    }
    open fun roam () {
        println("The Animal is roaming")
    }
    fun sleep () {
        println("The Animal is sleeping")
    }
}

class Hippo : Animal () {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat: String // overriding like this and like the above properties, gives the same results.
        get() = "water" // Just that in this case, I'm overriding the property's getter function

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food.")
    }
}

open class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.png"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("The Wolf is howling!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Vet {
    fun givShot(animal: Animal) {
        // code to do something medical
        animal.makeNoise()
    }
}

fun main() {
    //hippo object
    val aHippo = Hippo()
    aHippo.eat()
    aHippo.makeNoise()
    aHippo.sleep()
    println()

    //wolf object
    val wolf = Wolf()
    wolf.sleep() //fun is in Animal
    wolf.roam() // fun overridden in Canine superclass
    wolf.eat()  //fun overridden in Wolf class
    wolf.makeNoise() //fun overridden in Wolf class
    println()

    // array
    val animals = arrayOf(Hippo(), Wolf())
    for (eachAnimal in animals) {
        eachAnimal.roam()
        eachAnimal.eat()
    }
    println()

    //polymorphism  -->  the ability to use any subtype object in place of its supertype
    // As different subclasses can have different implementations of the same function (through overriding),
    // it allows each object to respond to function calls in the way that’s most appropriate for each object
    val veterinary = Vet()
    val wolf2 = Wolf()
    val hippo2 = Hippo()
    // although we are expecting to pass an Animal object...
    // ...the 2 Animal subtypes passed will work because of the IS-A relationship
    // Wolf IS-A Animal and Hippo IS-A Animal
    veterinary.givShot(wolf2)
    veterinary.givShot(hippo2)
}


// INHERITANCE: involves;
// -> putting common code in one class (superclass)
// -> then allowing more specific classes (subclass) to inherit this code
// inheritance helps avoid duplicating code (into subclasses)
// in case of any update, you only have to update the superclass & the changes will be reflected in all its subclasses.
// subclasses inherit all the properties & functions of their superclass
// e.g. superclass: Car, subclass: ConvertibleCar
// subclasses can have/ add specific properties & functions of their own
// they can also tweak properties & functions they inherit from the superclass; this is called "overriding"
// *** A superclass contains common properties and functions that are inherited by one or more subclasses ***
// *** A subclass can include extra properties and functions, and can override the things that it inherits ***

// inheritance involves having a "hierarchy of classes" inheriting from each other...
// ...starting with the top most superclass, through all the subclasses, all the way down

// IS-A Class Hierarchy Test  --> is a class a subclass of another?
// ask, does it make sense to say that -> "type X IS-A type of Y"
// this lets you decide if a class should inherit from another || if a class should be a subclass of another
// e.g. a ConvertibleCar IS-A Car --> makes sense, so the ConvertibleCar should be a subclass of (inherit from) Car
// an IS-A test should always be true no matter how long the tree of inheritance is
// e.g. a Lion IS-A Feline & IS-A Animal --> this tree is true down to the root superclass
// example above says: a Lion can do what a Feline can do & it can do what an Animal can do

// HAS-A Test  --> one class takes the other class as a property; no inheritance
// used for classes that DON'T inherit from each other but are related in some other way e.g. a Kitchen & a Fridge
// such classes are joined by a HAS-A relationship
// ask, does it make sense to say that -> "a Kitchen HAS-A Fridge"
// if yes, that means the Kitchen "has a reference" to the Fridge class BUT neither of them is inheriting from one another
//i.e. the Kitchen class has a Fridge property -> the Fridge becomes a property of Kitchen through a HAS-A relationship

// CREATING A SUPERCLASS
// To use a class as a superclass, declare it with the keyword 'open'.
// Everything(properties and functions) you want to override must also use the keyword "open"

// HOW TO INHERIT FROM A SUPERCLASS
// To make a class inherit from another, add a colon (:) to the class header followed by the name of the superclass
// This makes the class a subclass, and receives all the properties and functions of the class it inherits from (superclass)
// e.g. class Hippo above is inheriting from Animal
// Calling the superclass constructor is mandatory i.e. you must include the () after the superclass' name
// this ensures that the superclass initializes all the properties into the subclass
// If the superclass constructor includes parameters, you must pass values for these parameters when you call the constructor

// OVERRIDING PROPERTIES
// you override an inherited property by using the keyword "override"
// *** you use keyword "override" to override properties defined in the superclass using 'val' ***
// *** otherwise, if the superclass properties you want to override are defined using 'var', just reassign values to them in the subclass's initializer block...
// since the initializer block runs immediately after the constructor has initialized values & remember var can be reassigned values***
// if you define a property in the superclass using val, you must override it in the subclass if you want to assign a different value to it
// overriding a property just to initialize it with a different value is not the only way to use 'override'
// use 'override' to:
// #override a property's getter and setter
// #override a superclass 'val' property with a subclass 'var' property: NOTE, vice versa won't work: you can't override superclass 'var' with subclass 'val'
// #override a property's type with a superclass subtype
// #override any properties defined in the superclass' constructor -> use keyword 'open' in the constructor then keyword 'override' in the subclass

// OVERRIDING FUNCTIONS
// you override a function in a similar way to how you override a property
// i.e. use the "open" keyword with the fun in the superclass, and keyword "override" in the subclass
// *** 2 Rules on overriding functions:
    // 1 ->  The function parameters in the subclass must match those in the superclass
    // 2 ->  The function return types must be compatible
        // Whatever the superclass function declares as a return type for the function, the
        // overriding function must return either the same type, or a subclass type
        // A subclass type is guaranteed to do anything its superclass declares
        // therefore, it’s safe to return a subclass where the superclass is expected

// when a function/property is declared 'open' in the superclass, ready to be overridden, it stays open in all the subclasses that inherit it no matter how many in the tree...
// ...even if it's overridden. It still stays 'open'
// this is so that you don't have to declare it open again in the subclasses down the tree in order to override it again
// you just use the keyword 'override' each time you tweak it in all the subclasses down the tree (just like you would normally do)
// *** however, to stop a function/ property from being overridden further down the class hierarchy, prefix it with keyword "final"
// e.g. final override fun makeNose() {...}
// this means that, that class' subclasses cannot override the function/property at all || that is the last class to override the function/property

// when you call a function/method through an object, e.g. wolf.eat()...
// ...you’re calling the most specific version of the function for that object type
// i.e. the one that’s lowest on the inheritance tree

// *** Through inheritance, all subclasses have ALL the properties & functions defined in the superclass ***

// You can use a subclass in any place where the superclass type is expected
// Polymorphism means “many forms”.
// It allows different subclasses to have different implementations of the same function