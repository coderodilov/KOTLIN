package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter number: ")
    println("Result = " + triangle(readln().toInt()))
}

private fun triangle(block: Int): Int {
    return when (block) {
        0 -> 0
        1 -> 1
        else -> block + triangle(block - 1)
    }
}