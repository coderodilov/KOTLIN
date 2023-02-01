package array
/*
* Coder Odilov
* 31.01.2023
* */

/*
* Given an array of ints, return true if 6 appears as
* either the first or last element in the array.
* The array will be length 1 or more.
* */

fun main(){
    val array = intArrayOf(0,5,2,12,8,3,6)
    println("Result = " + (array.first() == 6 || array.last() == 6))
}