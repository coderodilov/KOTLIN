package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter number: ")
    println("fibonacci: " + fibonacci(readln().toInt()))
}

private fun fibonacci(n: Int): Int {
    return when (n) {
        0 -> 0
        1, 2 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}

