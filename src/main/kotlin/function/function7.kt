package function
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
* .*/

fun main() {
    val numList = ArrayList<Int>()
    numList.add(886)
    numList.add(58)
    numList.add(32)

    println(numList)
    println(rightDigit(numList))
}

fun rightDigit(strList : List<Int>) : List<Int?> {
    val list = ArrayList<Int>()
    strList.forEach {
        list.add(it % 10)
    }
    return list
}

