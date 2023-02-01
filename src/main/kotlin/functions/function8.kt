package functions
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
* .*/

fun main() {
    val numList = ArrayList<String>()
    numList.add("Hello")
    numList.add("Bro")
    numList.add("MY LOVE")

    println(numList)
    println(lowerCase(numList))
}

fun lowerCase(strList : List<String>) : List<String?> {
    val list = ArrayList<String>()
    strList.forEach {
        list.add(it.lowercase())
    }
    return list
}

