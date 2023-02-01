package array
/*
* Coder Odilov
* 31.01.2023
* */

/*
* Given an array of ints length 3, figure out which is larger,
* the first or last element in the array, and set all the other
* elements to be that value. Return the changed array.
* */

fun main() {
    val a = intArrayOf(9, 3, 8)
    val b = intArrayOf(1, 2, 3)
    val temp = if (a.first() > a.last()) a.first() else a.last()

    for (i in a.indices) b[i] = temp
    for (i in a) print("$i ")
    println()
    for (i in b) print("$i ")
}