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

    val geo = sqrt(a * b)

    println("Geo = $geo")
}