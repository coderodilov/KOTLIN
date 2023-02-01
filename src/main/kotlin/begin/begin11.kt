package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    print("a = ")
    var a = readln().toInt()
    print("b = ")
    var b = readln().toInt()

    val temp = a
    a = b
    b = temp

    println("A = $a \nB = $b")
}