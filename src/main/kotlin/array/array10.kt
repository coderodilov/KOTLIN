package array

/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val array10 =
        """Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. 
The array length will be a least 1.""".trimMargin()
    println(array10)

    val a = intArrayOf(6, 42, 15)

    println(a.max())
}