package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
    testWhen(true)
}

// Any type example. This is similar to Object in Java
fun testWhen(input: Any) {
    // error: unresolved reference 'length'.
    // input.length

    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("from 10 to 20")
        /* input.length is OK here
        In Java, you would have to do this
        (String) object;
         */
        is String -> println("The string was entered ${input.length}")
        else -> println("Something else")
    }

    /**
     * It would be necessary to write in Java something like:
     *
     * public void test(Object input) {
     *   if (input instanceOf String) {
     *     String strInput = (String) input;
     *   }
     *
     *   if (input instanceOf Integer) {
     *     ...
     *   }
     * }
     */
}