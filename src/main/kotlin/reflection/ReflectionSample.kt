package reflection

/*
* Creator Coder Odilov
* Created on 13/02/23
*/
fun main() {
    var workers = listOf<String>(
        "Odilov", "Karimov", "Toshboyeva", "Azimova", "Toshboyev", "Odilova"
    )

    fun males(name: String) = name.endsWith("v")
    fun female(name: String) = name.endsWith("a")

    println("""
        Ishchilar ro'yxati: 
        1 - Erkaklar
        2 - Ayollar
        3 - Barchasi
    """.trimIndent())

    print("Tanlang: ")
   when(readln().toString().trim()){
        "1" -> workers =  workers.filter(::males)
        "2" -> workers =  workers.filter(::female)
        "3" -> workers
       else -> println("Invalid operation selected")
   }

    for (worker in workers) {
        println(worker)
    }
}