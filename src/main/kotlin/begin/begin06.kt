package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin6 = """
        Doiraning radiuisi r berilgan
        Uning uzunligi L va yuzasi S ni aniqlang!
        L = (2 * pi * r)   pi = 3.14
        S = pi * (r * r)
    """.trimIndent()
    println(begin6)

    print("r = ")
    val r = readln().toInt()
    val pi = 3.14f

    val l = 2 * pi * r
    val s = pi * (r * r)

    println("L = $l \nS = $s")
}