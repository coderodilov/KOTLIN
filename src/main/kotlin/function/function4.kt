package function
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of strings, return a list where each string is
*  replaced by 3 copies of the string concatenated together.*/

fun main() {
    val strList = ArrayList<String>()
    strList.add("ali")
    strList.add("ab")

    println(copies3(strList))
}

fun copies3(strList : List<String>) : List<String?> {
    val list = ArrayList<String>()
    strList.forEach {
        list.add(it + it + it)
    }
    return list
}

