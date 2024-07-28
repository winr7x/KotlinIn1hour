package topics

fun main() {
    val p1 = Person("Tom", "Jones", 35)
    println(p1.firstName)
    println(p1.lastName)
    println(p1.age)
    println(p1.children)

    val child = Person("Child", "Child", 1)
    val p2 = Person("Tom", "Jones", 35, child)
    println(p2.firstName)
    println(p2.lastName)
    println(p2.age)
    println(p2.children)

    val rectangleA = Rectangle2(5.0, 2.0)
    println("Te perimeter is ${rectangleA.perimeter}")

    val rectangleB = Rectangle2(5.0, 2.0)
    // Check hashCode() method exists
    println(rectangleA == rectangleB) // true
    /* If the Rectangle class did not have the 'data' keyword and
     consequently, the hashCode() method, it would return false.
    */
}

/* (val firstName: String, val lastName: String, var age: Int) - this is primary constructor
fields of class: firstName, lastName, age
 */
class Person(val firstName: String, val lastName: String, var age: Int) {
    // One another field children
    var children: MutableList<Person> = mutableListOf() // ArrayList in Java

    // Code that is called when an object is created
    init {
        println("Person is created $firstName")
    }

    // Additional constructor
    constructor(firstName: String, lastName: String, age: Int, child: Person) :
        // Primary constructor must be called
        this(firstName, lastName, age) {

        children.add(child)
    }

    // Additional constructor without arguments
    constructor(): this("", "", -1)

}

// fields height, length have default getters and setters
class Rectangle1(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        // Custom getter and setter for field test
        get() = field + 1 // this.field in Java
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    // Method example
    fun area() = height * length
}

/* For data class
equals(), hashCode(), toString(), ...
methods will be created automatically
*/
data class Rectangle2(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}