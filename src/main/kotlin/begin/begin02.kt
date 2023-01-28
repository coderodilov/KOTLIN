package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main(){
    val begin2 = """
        Kvadrat tomoni A berilgan.
        Uning yuzasini aniqlang!
        S = (a * a)
    """.trimIndent()
    println(begin2)

    print("a = ")
    val a = readln().toInt()
    val s = a * a
    print("S = $s")
}