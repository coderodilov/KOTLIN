package array
import java.util.Arrays
import java.util.Scanner

/*
* Coder Odilov
* 31.01.2023
* */

/*
* Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
* The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement
* for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
* The syntax to make a new int array is: new int[desired_length]
* */

fun main() {
    print("Enter array length: ")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)

    for (i in 0..arr.lastIndex) arr[i] = i + 1
    print(arr.contentToString())
}