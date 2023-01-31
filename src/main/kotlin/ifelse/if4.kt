package ifelse

/*
* Coder Odilov
* 31.01.2023
* */
fun main() {
    val if1 = """
        Butun son berilgan, agar son musbat bo'lsa 1 ga oshiring,
        aks holda 2 ga kamaytiring..!
    """.trimIndent()
    println(if1)

    print("a= ")
    var a = readln().toInt()
    if (a > 0) a += 1 else a -= 2
    println("a = $a")
}
