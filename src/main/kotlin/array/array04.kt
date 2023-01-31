package array

/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val array4 = """
Given 2 int arrays, a and b, each length 3,
return a new array length 2 containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
    """
    println(array4)

    val a = intArrayOf(8, 4, 9)
    val b = intArrayOf(5, 3, 6)
    val c = intArrayOf(a[1], b[1])

    for (i in a) print("$i ")
    println()
    for (i in b) print("$i ")
    println()
    for (i in c) print("$i ")

}