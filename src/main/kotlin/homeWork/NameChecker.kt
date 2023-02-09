package homeWork
/*
* Coder Odilov
* 09.02.2023
* */

/*
* 1.chechName() nomli funksiya xosil qiling, bunda ism haqqiqattan ismligini tekshirsin
* (raqam bolmasligi kerak, o'lcham uzunligi, belgilar yo'qligi va hkz)
*  */
fun main() {
    print("Enter your name: ")
    val name = readln()
    show(name)
}

fun show(name: String){
    println(checkName(name))
}
fun checkName(name: String) : String{
    return if (name.length > 2 && "[A-Za-z']+".toRegex().matches(name))
        "Hello ${name.capitalize()}"
    else "Incorrect"
}


