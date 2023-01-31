package array
/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val array5 =
        """Given an int array length 2, return true if it does not contain a 2 or 3.
     """
    println(array5)

    val a = intArrayOf(5, 3)
    println("Result: " + (a.contains(2) || a.contains(3)))
}