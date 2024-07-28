package topics

import kotlin.math.min

operator fun Int?.plus(other: Int?): Int? =
    if (this != null && other != null)
        this + other
    else
        this ?: other

fun main() {
    // Given two arrays: [1, 2, 3, 2, 0] and [5, 1, 2, 7, 3, 2]
    // It is necessary to return [1, 2, 2, 3] (order is not important)
    val array1 = arrayOf(1, 2, 3, 2, 0, 2, 2, 2)
    val array2 = arrayOf(5, 1, 2, 7, 3, 2)

    val a1 = array1.groupingBy { it }.eachCount()
    val a2 = array2.groupingBy { it }.eachCount()

    val smallestMap = if (a1.size <= a2.size) a1 else a2
    val anotherMap = if (smallestMap == a1) a2 else a1

    val resultList: MutableList<Int> = mutableListOf()
    for (e in smallestMap) {
        if (anotherMap.containsKey(e.key)) {
            val count = min(e.value, anotherMap.get(e.key)!!)
            for (i in 1 .. count) {
                resultList.add(e.key)
            }
        }
    }

    val result = resultList.toTypedArray()

    println("smallestMap = $smallestMap")
    println("anotherMap = $anotherMap")
    println("result={${result.joinToString(", ")}}")
}
