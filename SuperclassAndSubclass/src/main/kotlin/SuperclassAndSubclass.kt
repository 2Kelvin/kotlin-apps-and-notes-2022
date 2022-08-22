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
}

fun main() {
    val aHippo = Hippo()
    val aAnimal = Animal()

    println(aHippo.habitat)
    println("Animal habitat is ${aAnimal.habitat}")
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

// OVERRIDING PROPERTIES & FUNCTIONS
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
