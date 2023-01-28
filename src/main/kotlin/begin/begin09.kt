package begin
import kotlin.math.sqrt
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin9 = """
        Tog'ri 3 burchakning katetlari a va b berilgan.
        Uning gipatenuzasi C va perimetri P ni aniqlang!
        C = sqrt( (a * a) + (b * b) )
        P = (a + b + c)
    """.trimIndent()
    println(begin9)

    print("a = ")
    val a = readln().toDouble()
    print("b = ")
    val b = readln().toDouble()

    val c = sqrt((a * a) + (b * b))
    val p = a + b + c

    println("C = $c \nP = $p")
}