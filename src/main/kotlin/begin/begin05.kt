package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin5 = """
        Kubning yon tomoni a berilgan
        Uning hajmi V ni va to'la sirti S ni aniqlang!
        V = (a * a * a)  S = 6 * (a * a)
    """.trimIndent()
    println(begin5)

    print("a = ")
    val a = readln().toInt()
    val v = a * a * a
    val s = 6 * (a * a)

    println("V = $v \nS = $s")
}