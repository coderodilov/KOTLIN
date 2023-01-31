package array
/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val array3 = """
Given an array of ints length 3, 
return a new array with the elements in reverse order, 
so {1, 2, 3} becomes {3, 2, 1}.
    """
    println(array3)

    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = a.reversedArray()

    for (i in a) print("$i ")
    println()
    for (i in b) print("$i ")
}