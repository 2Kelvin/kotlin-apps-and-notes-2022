class Song(val songTitle: String, val artist:String) {
    fun play() = println("Playing the song $songTitle by $artist")
    fun stop() = println("Stopped playing $songTitle")
}

class Drumkit(var hasTopHat: Boolean, var hasSnare: Boolean) {
    fun playTopHat() {
        if (hasTopHat) println("ding ding ba-da-bing!")
    }
    fun playSnare() {
        if (hasSnare) println("bang bang bang!")
    }
}

fun main() {
    val song1 = Song("Jam", "Wizkid ft Chronixx")
    val song2 = Song("Enchanted", "Taylor Swift")
    val song3 = Song("Gbona", "Burna Boy")

    song2.play()
    song2.stop()
    song3.play()
    println()

    // drumkit code
    val d = Drumkit(true, true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()
}

// CLASS CONSTRUCTOR.
// although it looks similar to a function, the "constructor" is what's used to create an object
// e.g. Song(...args..) is a constructor as it results in an object being created from the class
// a constructor contains the code needed to initialize an object
// it runs way before the object is assigned a reference variable
// it defines properties and initializes them inside the object created
// each class comes with a constructor to help create the objects
// the constructor is the class' parentheses and the code in it --> by default, it's called a "primary constructor"
// during object creation, the constructor assigns a value to each of the properties (in the parentheses) --> initialization
// each class property is a local variable in the object (created through this class)
// *** a property is a variable that’s local to the object ***
// the values passed are assigned to these local variables/properties.
// properties defined using val cannot be assigned new values, while those defined with var, can be assigned new values

// objects are referred to as "instances of a class"
// properties are "instance variables"