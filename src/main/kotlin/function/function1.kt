package function
/*
* Coder Odilov
* 31.01.2023
* */

/*
* Given a list of integers, return a list where each integer is multiplied by 2.
* */

fun main() {
    val list = ArrayList<Int>()

    list.add(1)
    list.add(2)
    list.add(5)
    list.add(8)

    println(list)
    println(doubling(list))
}

fun doubling(numbs: List<Int>): List<Int?> {
    val list = ArrayList<Int>()
    numbs.forEach {
        list.add(it * 2)
    }
    return list
}