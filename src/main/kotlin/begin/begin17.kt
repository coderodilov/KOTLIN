package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin17 = """
        1-Avtomobil tezligi A km/soat
        2-Avtomobil tezligi B km/soat
        Ular orasidagi masofa M km
        Ular harkatda davom etsa 
        T vaqtdan keyn ular orasidagi masofani aniqlang!!!
        Eslatma A > B
    """.trimIndent()
    println(begin17)
    println()

    print("1-Mashina tezligi A km/soat = ")
    val a = readln().toInt()
    print("2-Mashina tezligi B km/soat = ")
    val b = readln().toInt()
    print("Ular orasidagi masofa M km = ")
    var m = readln().toInt()
    print("Oradan o'tkan vaqt T/soat = ")
    val t = readln().toInt()

    m += ((t * a) - (t * b))

    println("Masofa = $m")
}