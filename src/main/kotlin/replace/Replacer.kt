package replace

/*
* Creator Coder Odilov
* Created on 13/02/23
*/

fun main() {
    var text : String = readln()
    println(text)

    val temp = text
        .replace("A", "A")
        .replace("B", "Б")
        .replace("C", "C")
        .replace("D", "Д")
        .replace("E","Е")
        .replace("F", "Ф")
        .replace("G", "Г")
    println(temp)

}