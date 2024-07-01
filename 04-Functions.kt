package topics

fun main() {
    println(testSimple1()) // 10
    println(testSimple2()) // 10
    println(testSimple3(3, 10)) // 10
    println(testSimple4(3, 10)) // 10
    println(testString(10))
    println(testNamedArguments(4, 2, 5))
    println(testNamedArguments(y = 4, z = 2, x = 5))
    testDefaultArguments()
    testDefaultArguments(y = 1)
    testDefaultArguments(1, 2)
    println(foo("Kotlin ", 77, true))
    printEven(1, 2, 3, 4 ,5, 6, 7, 8)
    // * operator example
    println("PrintEven")
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8, 9, 10)
}

// Function example
fun testSimple1(): Int {
    return 5 + 5
}

// Shortened-form function example
fun testSimple2(): Int = 5 + 5

// Arguments example
fun testSimple3(x: Int, y: Int): Int = 5 + 5

// Return type inference example
fun testSimple4(x: Int, y: Int) = 5 + 5

// String return type example
fun testString(x: Int): String {
    return "String is $x"
}

// Multiple parameters example
fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

/*
From Kotlin Koans:

public String foo(String name, int number, boolean toUpperCase) {
    return (tuUpperCase ? name.toUpperCase() : name) + number;
}

public String foo(String name, int number) {
    return foo(name, number, false);
}

public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}

public String foo(String name) {
    return foo(name, 42);
}
*/

// Kotlin doesn't need function overloading. It has default arguments
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg example
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}