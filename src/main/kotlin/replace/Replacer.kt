package replace

/*
* Creator Coder Odilov
* Created on 13/02/23
*/

fun main() {
    val text : String = readln()
    println(replaceToKrill(text))

 // А Б C Д Е Ф Г Ҳ И Ж К Л М Н О П Қ Р С Т У В Й W Х Й З Ғ Ч Ш НГ Ё Ў абсдифгҳижклмнопқрстувхйзчғёшў"



}
private fun replaceToKrill(text:String):String{
val temp = text
    // UpperCases
    .replace("a", "а")
    .replace("b", "б")
    .replace("c", "с")
    .replace("d", "д")
    .replace("e", "и")
    .replace("f", "ф")
    .replace("g", "г")
    .replace("h", "ҳ")
    .replace("i", "и")
    .replace("j", "ж")
    .replace("k", "к")
    .replace("l", "л")
    .replace("m", "м")
    .replace("n", "н")
    .replace("o", "о")
    .replace("p", "п")
    .replace("q", "қ")
    .replace("r", "р")
    .replace("s", "с")
    .replace("t", "т")
    .replace("u", "у")
    .replace("v", "в")
    .replace("x", "х")
    .replace("y", "й")
    .replace("z", "з")
    .replace("g'", "ғ")
    .replace("ch", "ч")
    .replace("sh", "ш")
    .replace("yo", "ё")
    .replace("o'", "ў")

    .replace("A", "A")
    .replace("B", "Б")
    .replace("C", "C")
    .replace("D", "Д")
    .replace("E", "Е")
    .replace("F", "Ф")
    .replace("G", "Г")
    .replace("H", "Ҳ")
    .replace("I", "И")
    .replace("J", "Ж")
    .replace("K", "К")
    .replace("L", "Л")
    .replace("M", "М")
    .replace("N", "Н")
    .replace("O", "О")
    .replace("P", "П")
    .replace("Q", "Қ")
    .replace("R", "Р")
    .replace("S", "С")
    .replace("T", "Т")
    .replace("U", "У")
    .replace("V", "В")
    .replace("X", "Х")
    .replace("Y", "Й")
    .replace("Z", "З")
    .replace("G'", "Ғ")
    .replace("CH", "Ч")
    .replace("SH", "Ш")
    .replace("YO", "Ё")
    .replace("O||'", "Ў")

    return temp
}