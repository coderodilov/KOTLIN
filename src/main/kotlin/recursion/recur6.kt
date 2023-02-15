package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter number: ")
    println("Result = " + digitSum(readln().toInt()))
}

private fun digitSum(number: Int): Int {
    return when (number) {
        0 -> 0
        else -> number % 10 + digitSum(number / 10)
    }
}