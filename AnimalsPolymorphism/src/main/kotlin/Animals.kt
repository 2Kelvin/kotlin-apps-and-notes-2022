abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise ()
    abstract fun eat ()
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
    override val habitat: String
        get() = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food.")
    }
}

abstract class Canine : Animal() {
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
    val animals = arrayOf(Hippo(), Wolf())
    for (eachAnimal in animals) {
        eachAnimal.roam()
        eachAnimal.eat()
    }
    println()

    val veterinary = Vet()
    val wolf2 = Wolf()
    val hippo2 = Hippo()
    veterinary.givShot(wolf2)
    veterinary.givShot(hippo2)
}

// ABSTRACTING CLASSES --> prefix the class with keyword 'abstract'
// Declare a class as 'abstract' to stop it from being instantiated
// this helps avoid creating vague objects
// stopping a class from being instantiated means the class 'itself' cannot be used to create an object
// ...and the only way to use the class is through inheritance & polymorphism
// ...the class' subclasses can be used to create objects as they are more specific & not vague/ abstract
// #Summary; Abstract Classes cannot create objects but are used for inheritance as superclasses
//*** If a superclass is marked as abstract, you don’t need to declare that it’s open ***
// A class that’s not abstract is called concrete.
// a concrete class creates specific objects e.g. a Lion class, Book class, Dog class
// however, whether a class should be abstract or concrete depends on the context of your application e.g.
// ...a Dog class can be an abstract class in an app where the dog's breed/ type really matters
// ...in a different app, the Dog class can be concrete if the app doesn't need to distinguish the different types of dogs
// In an abstract class, you can choose to mark properties and functions as abstract
// this is useful if the class has behaviors that don’t make sense unless they’re implemented by a more specific subclass.
// and you can’t think of a generic implementation that might be useful for subclasses to inherit
// An abstract class can contain abstract and non-abstract properties and functions.
// It’s possible for an abstract class to have NO abstract properties & functions
// abstract properties & functions -->  are vague/ not specific & need to overrode by all subclasses to be specific
// ...in most cases, abstract properties & functions are the ones you find assigned with "generic values"
// ...e.g. in our Animal class; abstract properties are like food, habitat...
// prefix abstract properties & functions with the keyword 'abstract'
// *** abstract properties should NEVER be initialized i.e. don't assign them values ***
// neither should you define a custom getter and setter function for them
// doing any of the above results in a compile error
// marking a property as abstract means that you've decided there is no useful initial value it can have
// and also, no use implementing a custom getter or setter
// -->*** Abstract properties and functions don’t need to be marked as open ***<--
// prefix a function with keyword "abstract" to make it an abstract class
// abstract functions DO NOT have bodies. This is because, when you mark a function as abstract,
// ...you’re telling the compiler that there’s no useful code you can write for the function body
// even adding empty curly braces '{}' (curly braces with no code in them) to the function, causes a compile error
// therefore you should remove the "{}" in an abstract function & the last thing in the function should be the "()"
// if you mark ANY property or function as abstract, then the class should also be marked as abstract.