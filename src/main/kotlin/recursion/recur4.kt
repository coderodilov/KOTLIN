package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter bunnies count: ")
    println("Bunnies ears = " + bunnyEars2(readln().toInt()))
}
private fun bunnyEars2(bunny: Int): Int {
    return if(bunny == 0) 0
    else if(bunny % 2 == 0) 3 + bunnyEars2(bunny -1)
    else 2 + bunnyEars2(bunny -1)
}