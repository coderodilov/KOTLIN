package begin
import kotlin.math.abs
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    print("x1 = ")
    val x1 = readln().toInt()
    print("x2 = ")
    val x2 = readln().toInt()

    val range = abs(x2 - x1)

    println("Masofa = $range")
}