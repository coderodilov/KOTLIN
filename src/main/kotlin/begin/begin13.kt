package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    print("a = ")
    val a = readln().toInt()
    print("b = ")
    val b = readln().toInt()
    print("c = ")
    val c = readln().toInt()

    val ac = c - a
    val bc = c - b
    val sum = ac + bc

    println("AC = $ac \nBC = $bc \nSum = $sum")
}