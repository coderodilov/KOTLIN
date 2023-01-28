package begin
import kotlin.math.abs
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin12 = """
        Sonlar o'qida 2 ta nuqta berilgan.
        Ular orasidagi masofa aniqlansin!
        X2 - X1
    """.trimIndent()
    println(begin12)

    print("x1 = ")
    val x1 = readln().toInt()
    print("x2 = ")
    val x2 = readln().toInt()

    val range = abs(x2 - x1)

    println("Masofa = $range")
}