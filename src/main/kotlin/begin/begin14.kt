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
    print("c = ")
    var c = readln().toInt()

    val temp = a
    a = b
    b = c
    c = temp

    println("AC = $a \nB = $b \nC = $c")
}