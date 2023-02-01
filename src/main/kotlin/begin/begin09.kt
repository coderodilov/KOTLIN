package begin
import kotlin.math.sqrt
/*
* Coder Odilov
* 28.01.2023
* */

fun main() {
    print("a = ")
    val a = readln().toDouble()
    print("b = ")
    val b = readln().toDouble()

    val c = sqrt((a * a) + (b * b))
    val p = a + b + c

    println("C = $c \nP = $p")
}