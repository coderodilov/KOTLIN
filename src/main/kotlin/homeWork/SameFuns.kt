package homeWork
/*
* Coder Odilov
* 09.02.2023
* */

/*
* 1. Bir xil nomli funksiya xosil qiling, biri qiymat qaytarsin, ikkinchisi Unit tipda bo'lsin
*  */

fun main() {
    val name = "Bro"
    sample()
    println(sample(name))
}

fun sample() {
    print("Hello ")
}
fun sample(name: String): String{
    return name
}