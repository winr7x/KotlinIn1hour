package topics

fun main() {
    // This variable cannot contain null. never
    var a: String = "Hello"
    /* error: null cannot be a value of a non-null type 'kotlin.String'.
    a = null
    For this reason, unexpected NullPointerException cannot occur in Kotlin.
    */
    println(a.length) // OK

    // Type? example. If we need to store null.
    var b: String? = "Test"
    b = null
    /* error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable
    receiver of type 'kotlin.Nothing?'.
    */
    // b.length

    /* Safe call (?.) example
    Will return the length of b. If it is null, then will return null.
    */
    b?.length // OK

    /* Where are such calls most useful?
    bob?.department?.head?.name
    If there is null anywhere in this chain of calls, the entire chain will return null.
    We will never get a NullPointerException.
    */

    // Unnecessary safe call on a non-null receiver of type String
    a?.length

    /* Elvis operator (?:) example
    If b is null, return -1. Otherwise, return b.length.
    */
    val l = b?.length ?: -1

    /* !! operator example
    !! throws a NullPointerException if the variable is null
     */
    b = if ((0..10).random() > 5) "asdf" else null
    // if b <= 5 we will get:
    // Exception in thread "main" java.lang.NullPointerException
    val t = b!!.length
}
