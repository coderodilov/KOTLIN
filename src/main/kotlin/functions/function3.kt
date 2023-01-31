package functions
/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val list = ArrayList<String>()
    list.add("Shahzod")
    list.add("Coder")
    list.add("Odilov")
    println(list)
    println(addStar(list))
}

fun addStar(nums: List<String>): List<String?> {
    val list = ArrayList<String>()
    nums.forEach {
        list.add(it.plus("*"))
    }
    return list
}