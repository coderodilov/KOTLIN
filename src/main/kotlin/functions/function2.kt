package functions
/*
* Coder Odilov
* 31.01.2023
* */

/*
* Given a list of integers, return a list where each integer is multiplied with itself.
* */

fun main() {
    val list = ArrayList<Int>()

    list.add(1)
    list.add(2)
    list.add(5)
    list.add(8)

    println(list)
    println(square(list))
}

fun square(numbs: List<Int>): List<Int?> {
    val list = ArrayList<Int>()
    numbs.forEach {
        list.add(it * it)
    }
    return list
}