package array
/*
* Coder Odilov
* 31.01.2023
* */
fun main(){
    val array3 = """
Given 2 arrays of ints, a and b, return true if they have 
the same first element or they have the same last element. 
Both arrays will be length 1 or more.
    """
    println(array3)

    val a = intArrayOf(1,5,2,12,8,3,5)
    val b = intArrayOf(9,5,2,6)

    println("Result = " + (a.last() == b.last() || a.first() == b.first()))
}