package topics

fun main() {
    // Constant example
    val test1: String = "Hello";

    // error: 'val' cannot be reassigned.
    // test1 = "Goodbye"

    // Variable example
    var test2: String = "Hello"
    test2 = "Goodbye"

    // error: assignment type mismatch: actual type is 'kotlin.Int', but 'kotlin.String' was expected.
    // test2 = 1

    // Without type examples
    val test1_a = "Hello"
    val test1_b = 3
    var test2_a = "Hello"
    var test2_b = 4

    // $-substitution example
    println("Value of test1 is $test1")
    // ${ <here is any Kotlin code> }
    println("Sum is ${2 + 2}")
    println("Value is ${test1_b + test2_b}")
}