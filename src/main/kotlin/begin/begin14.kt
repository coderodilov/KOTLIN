package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin14 = """
        A B C sonlari berilgan.
        A ni qiymatini B ga 
        B ni qiymatini C ga
        C ni qiymatini A ga
        almashtring va ekranga chqaring!
    """.trimIndent()
    println(begin14)

    print("a = ")
    var a = readln().toInt()
    print("b = ")
    var b = readln().toInt()
    print("c = ")
    var c = readln().toInt()

    val temp = a
    a = b
    b = c
    c = temp

    println("AC = $a \nB = $b \nC = $c")
}