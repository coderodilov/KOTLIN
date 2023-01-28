package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main(){
    val begin1 = """
        Kvadrat tomoni A berilgan.
        Uning Perimetrini aniqlang!
        P = (4 * a)
    """.trimIndent()
    println(begin1)

    print("a = ")
    val a = readln().toInt()
    val s = a * 4

    println("P = $s")
}
