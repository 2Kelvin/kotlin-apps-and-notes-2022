



// INHERITANCE: involves;
// -> putting common code in one class (superclass)
// -> then allowing more specific classes (subclass) to inherit this code
// inheritance helps avoid duplicating code (into subclasses)
// in case of any update, you only have to update the superclass & the changes will be reflected in all its subclasses.
// subclasses inherit all the properties & functions of their superclass
// e.g. superclass: Car, subclass: ConvertibleCar
// subclasses can have/ add specific properties & functions of their own
// they can also tweak some of the properties & functions they inherit from the superclass; this is called "overriding"
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
