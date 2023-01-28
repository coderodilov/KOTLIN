package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin19 = """
        Avtomobil eng yuqori tezligi A km/soat
        Agar ushbu avtomobil yarim tezligi bilan 4 soat 
        va uchdan bir tezligi bilan 6 soat yol bosgan bolsa?
        Jami qancha km masofa bosib o'tgan?
    """.trimIndent()
    println(begin19)
    println()

    print("X mashina tezligi A km/soat = ")
    val a = readln().toInt()

    val yarimTezlik = a / 2
    val uchdanBirTezlik = a / 3
    val masofa = 4 * yarimTezlik + 6 * uchdanBirTezlik

    println("Jami bosib o'tilgan masofa = $masofa km")
}