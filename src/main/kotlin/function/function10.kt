package function
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of strings, return a list of the strings, omitting any string that contains a "z".
* (Note: the str.contains(x) method returns a boolean)
*.*/

fun main() {
    val numList = ArrayList<String>()
    numList.add("Hello")
    numList.add("zebro")
    numList.add("Duck")
    numList.add("fuckz")

    println(numList)
    println(noZ(numList))
}

fun noZ(strList : List<String>) : List<String?> {
    val list = ArrayList<String>()
    strList.forEach {
        if (it.contains("z").not()) list.add(it)
    }
    return list
}

