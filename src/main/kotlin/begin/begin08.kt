package begin
import kotlin.math.sqrt
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin8 = """
        2 ta (0 < N) son berilgan A va B.
        Ularni o'rta geometrigini aniqlang!
        Geo = sqrt(a * b)
    """.trimIndent()
    println(begin8)

    print("a = ")
    val a = readln().toDouble()
    print("b = ")
    val b = readln().toDouble()

    val geo = sqrt(a * b)

    println("Geo = $geo")
}