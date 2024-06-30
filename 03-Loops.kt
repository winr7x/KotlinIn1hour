package topics

fun main() {
    // immutable list
    val items1 = listOf("apple", "banana", "orange") // List.of() Java 9
    val items2 = mutableListOf("apple", "banana", "orange") // ArrayList

    // for example
    for (item in items1)
        println(item)

    // while example
    var index = 0
    while (index < items1.size) {
        println("Item at $index is ${items1[index]}")
        index++
    }

    // ranges example (like in Python)
    println(5 in 3..10) // true

    // a in b..c example. Including last element
    for (i in 1..10)
        println(i)

    // Excluding last element example
    for (i in 1 until 10)
        println(i)

    // in descending order example
    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10)
        println(i)
}