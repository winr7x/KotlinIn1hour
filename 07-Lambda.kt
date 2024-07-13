package topics

class A(prop: Int) {
    var prop_: Int = prop
    override fun toString(): String {
        return "=${prop_.toString()}="
    }
}

fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    // We place a lambda in Kotlin within curly braces
    a.forEach { e -> println(e) }

    // map with lambda example
    println(a.map { e -> e * 2 })

    // filter with lambda example
    println(a.filter { e -> e % 2 == 0 })

    // reduce with lambda example. sum is accumulator variable.
    println(a.reduce { sum, e -> sum + e }) // It will sum all elements of the list

    /* sortedByDescending with lambda example
    When iterating over a collection in Kotlin, we should name this variable 'it'
     */
    println( a.sortedByDescending { it } )

    // sortedByDescending of objects with lambda example
    val b = listOf(A(1), A(2), A(3))
    println( b.sortedByDescending { it.prop_ } )

    /* any with lambda example
    return true if there is at least one element in the collection that satisfies the condition
    */
    println(a.any { it > 10 }) // false
    println(a.all { it < 10 }) // true
    println(a.sum()) // 15

    val numbers = listOf(1, 3, -4, 2, -11)
    /* partition with lambda example
    allows to divide the list into two collections
    */
    println(numbers.partition { it > 0 }) // [1, 3, 2], [-4, -11]
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)

    // groupBy with lambda example
    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
    println(result) //HashMap or LinkedHashMap
}
