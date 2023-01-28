package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin7 = """
        2 ta son berilgan A va B.
        Ularni o'rta arifmetigini aniqlang!
        Arif = (a + b) / 2
    """.trimIndent()
    println(begin7)

    print("a = ")
    val a = readln().toInt()
    print("b = ")
    val b = readln().toInt()

    val arif = (a + b) / 2

    println("Arif = $arif")
}