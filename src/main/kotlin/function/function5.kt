package function
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of strings, return a list where each string has "y" added at its start and end.
* .*/

fun main() {
    val strList = ArrayList<String>()
    strList.add("ali")
    strList.add("ab")
    strList.add("coder")

    println(moreY(strList))
}

fun moreY(strList : List<String>) : List<String?> {
    val list = ArrayList<String>()
    strList.forEach {
        list.add("y" + it + "y")
    }
    return list
}

