package loop
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    println(factorial(3))
}

fun factorial(n: Int): Int{
    return n * (n-1) * (n-2)
}