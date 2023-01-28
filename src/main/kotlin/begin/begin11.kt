package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin11 = """
        A va B sonlari berilgan,
        Ularning qiymatlarini almashtiring!
        A = B    B = A
    """.trimIndent()
    println(begin11)

    print("a = ")
    var a = readln().toInt()
    print("b = ")
    var b = readln().toInt()

    val temp = a
    a = b
    b = temp

    println("A = $a \nB = $b")
}