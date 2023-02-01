package function
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
* .*/

fun main() {
    val numList = ArrayList<Int>()
    numList.add(3)
    numList.add(8)
    numList.add(5)

    println(numList)
    println(multiply10(numList))
}

fun multiply10(strList : List<Int>) : List<Int?> {
    val list = ArrayList<Int>()
    strList.forEach {
        list.add(it * 10)
    }
    return list
}

