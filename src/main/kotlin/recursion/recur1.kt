package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    println(factorial(4))
}

private fun factorial(n: Int): Int {
    return if (n == 1) n else n * factorial(n - 1)
}
