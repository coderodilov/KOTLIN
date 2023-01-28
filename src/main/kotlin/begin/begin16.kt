package begin
/*
* Coder Odilov
* 28.01.2023
* */
fun main() {
    val begin16 = """
        Userdan: ismi,yoshi,kasbi so'ralsin!
        Va user malumotlarini ekranga chiqaring!
    """.trimIndent()
    println(begin16)

    print("Ismingiz:")
    val name = readln()
    print("Yoshingiz:")
    val age = readln()
    print("Kasbingiz:")
    val job = readln()

    println("Ismi: $name \nYoshi: $age \nKasbi: $job")
}