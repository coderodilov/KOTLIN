package function
/*
* Coder Odilov
* 01.02.2023
* */

/* Given a list of strings, return a list where each string has all its "x" removed.
* .*/

fun main() {
    val numList = ArrayList<String>()
    numList.add("Helxlox")
    numList.add("Brxo")
    numList.add("MxY xLOxVE")

    println(numList)
    println(noX(numList))
}

fun noX(strList : List<String>) : List<String?> {
    val list = ArrayList<String>()
    strList.forEach {
        list.add(it.replace("x",""))
    }
    return list
}

