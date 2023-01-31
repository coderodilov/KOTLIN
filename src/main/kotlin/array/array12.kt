package array
/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val array12 = """Given an array of ints, return the sum of the first 2 elements in the array.""".trimMargin()
    println(array12)

    val a = intArrayOf(6, 2, 1, 13, 3, 8)
    var b = a.sum()
    if (a.contains(13)) b -= 13
    println(b)
}