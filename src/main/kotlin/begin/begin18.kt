package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin18 = """
        X tonna mahsulot yetkazib berilgan!
        Mahsulotni Y kg lik qadoqlarga bo'linsa?
        Jami butun qadoqlar sonini aniqlang!!!
    """.trimIndent()
    println(begin18)
    println()

    print("X tonna = ")
    val x = readln().toInt()
    print("Y kg = ")
    val y = readln().toInt()

    val result = x * 100 / y
    println("Jami qadoqlar soni = $result")
}