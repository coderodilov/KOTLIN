package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter number: ")
    val num = readln().toInt()
    print("Enter power: ")
    val power = readln().toInt()

    println("$num^$power= " + powerN(num, power))
}

private fun powerN(num: Int, power: Int): Int {
    return if (power == 1) num else num * powerN(num, power - 1)
}