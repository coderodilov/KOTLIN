package nullable

fun main() {
    val text : String? = null
    val text2 = text ?: "Variable is null"
    println(text2)
}