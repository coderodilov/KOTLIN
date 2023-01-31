package array

/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val array8 =
        """Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element. """
    println(array8)

    val a = intArrayOf(6, 3, 8)
    val b = intArrayOf(1, 2, 3)
    var i = 0

    if (a.first() == 1) i += 1
    if (b.first() == 1) i += 1
    println("$i")
}