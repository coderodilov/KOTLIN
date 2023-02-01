package function
/*
* Coder Odilov
* 31.01.2023
* */

/*
* Given a list of strings, return a list where each string has "*" added at its end.
* */

fun main() {
    val list = ArrayList<String>()

    list.add("Shahzod")
    list.add("Coder")
    list.add("Odilov")
    println(list)
    println(addStar(list))
}

fun addStar(numbs: List<String>): List<String?> {
    val list = ArrayList<String>()
    numbs.forEach {
        list.add(it.plus("*"))
    }
    return list
}