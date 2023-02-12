package collections.map
/*
* Creator Coder Odilov
* Created on 12/02/23
*/
fun main() {
    val map = mutableMapOf<Int, String>(
        1 to "Yanvar",
        2 to "Fevral",
        3 to "Mart",
        4 to "Aprel",
        5 to "May",
        6 to "Iyun",
        7 to "Iyul",
        8 to "Avgust",
        9 to "Sentabr",
        10 to "Oktabr",
        11 to "Noyabr",
        12 to "Dekabr")

    println("Enter number (1 - 12): ")
    val n = readln().toInt()
    //TODO
    println(map[n])
}