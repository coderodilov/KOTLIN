package functions
/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val list = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(5)
    list.add(8)
    println(doubling(list))
}

fun doubling(nums: List<Int>): List<Int?> {
    val list = ArrayList<Int>()
    nums.forEach {
        list.add(it * 2)
    }
    return list
}