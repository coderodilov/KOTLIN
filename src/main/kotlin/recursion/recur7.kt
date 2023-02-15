package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter number with 7 like(77417): ")
    println("Count of '7'= " + count7(readln().toInt()))
}
private fun count7(number: Int): Int {
    var counter = 0
    if (number % 10 == 7) counter++
    return if (number == 0)  0  else counter + count7(number / 10)
}