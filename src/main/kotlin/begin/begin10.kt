package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    print("l = ")
    val l = readln().toDouble()
    val pi = 3.14

    val r = (l / 2 / pi)
    val s = pi * (r * r)

    println("R = $r \nS = $s")
}