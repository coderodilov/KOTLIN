package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin10 = """
        Aylananing uzunligi L berilgan.
        Uning radiusi R va yuzasi S nianiqlang!
        R = (l / 2 / pi)  pi = 3.14
        S = pi * (r * r)
    """.trimIndent()
    println(begin10)

    print("l = ")
    val l = readln().toDouble()
    val pi = 3.14

    val r = (l / 2 / pi)
    val s = pi * (r * r)

    println("R = $r \nS = $s")
}