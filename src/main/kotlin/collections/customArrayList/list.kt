package collections.customArrayList

fun main() {
    //Custom Array list
    val myList : ArrayList<Model> = ArrayList()

    //Adding data to list
    myList.add(Model("Corner", 23, 1))
    myList.add(Model("Jack", 15, 2))
    myList.add(Model("Joseph", 35, 3))
    myList.add(Model("Dustin", 19, 4))
    myList.add(Model("Alisha", 27, 5))
    myList.add(Model("Zoomrad", 32, 6))

    myList.sortByDescending { it.id }
    //Printing each element of list
    myList.forEach {
        //function formatter
        formatPrint(it)
    }

    //Removing elements by index
    myList.removeAt(1)

    //Sorting by name
    myList.sortBy { it.name }

    //Shuffling list elements
    myList.shuffle()

    //Getting list element using index
    myList.get(index = 1)

    //Clearing all elements of list
    myList.clear()

}

//Function which can be formatted our list elements before printing
private fun formatPrint(data: Model){
    println("${data.id} ${data.name} ${data.age}")
}
