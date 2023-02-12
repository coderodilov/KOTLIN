package oop.incapsulation
/*
* Creator Coder Odilov
* Created on 12/02/23
*/

fun main() {

    var coder = Person("Hakimxon", 23, "Eating pizza")

    val myList : ArrayList<Person> = ArrayList()
    myList.add(Person("Shakhzod", 24, "Coding"))
    myList.add(Person("Abdugaffor", 23, "Coding"))

    myList.forEach {
        formatPrint(it)
    }
}

fun formatPrint(data:Person){
    println("\uD83D\uDE01 ${data.name} ${data.age} ${data.hobby}")
}

