package begin
import kotlin.math.pow
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    print("a = ")
    val a = readln().toDouble()

    val a2 = a.pow(2)
    val a4 = a.pow(4)
    val a8 = a.pow(8)

    println("A2 = $a2 \nA4 = $a4 \nA8 = $a8")
}