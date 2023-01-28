package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main(){
    val begin4 = """
        Aylananing diametri d berilgan.
        Uning uzunligi L ni aniqlang!
        L = (pi * d)  pi = 3.14
    """.trimIndent()
    println(begin4)

    print("d = ")
    val d = readln().toInt()
    val pi = 3.14f
    val l = pi * d

    println("L = $l")
}