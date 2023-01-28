package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main(){
    val begin3 = """
        To'g'ri 4 burchakning tomonlari a va b berilgan.
        Uning perimetri P va yuzasi S ni aniqlang!
        S = (a * b)   P = 2 * (a + b)
    """.trimIndent()
    println(begin3)

    print("a = ")
    val a = readln().toInt()
    print("b = ")
    val b= readln().toInt()

    val s = a * b
    val p = 2 * (a + b)

    print("S = $s \nP = $p")
}