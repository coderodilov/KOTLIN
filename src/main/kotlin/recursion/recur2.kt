package recursion
/*
* Creator Coder Odilov
* Created on 15/02/23
*/
fun main() {
    print("Enter bunnies count: ")
    println("Bunnies ears = " + bunnyEars(readln().toInt()))
}

private fun bunnyEars(bunny: Int): Int {
    return if(bunny == 0) 0 else return 2 + bunnyEars(bunny -1)
}

