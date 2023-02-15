package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter number with 8 like(78588): ")
    println("Count of '8'= " + count8(readln().toInt()))
}
private fun count8(number: Int): Int {
    var counter = 0
    if (number % 10 == 8) counter++
    return if (number == 0)  0 else counter + count8(number / 10)
}