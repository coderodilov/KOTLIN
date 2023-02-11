package uzmobiloperators.main
import java.time.LocalDate

fun main() {
    println("Today: " + LocalDate.now())
    println("<< Uzbekistan Mobile Operators >>")

    var isExitSelected = true
    val user = User()
    user.loadUser()

    while (isExitSelected) {
        println("""
            1. Users list
            2. Add new user
            3. Delete user
            4. Search user
            5. Exit
        """.trimIndent())
        print("Select service: ")

        when(readln()) {
            "1" -> user.sortingType()
            "2" -> user.addUser()
            "3" -> user.deleteUser()
            "4" -> user.searchUser()
            "5" -> {
                isExitSelected = false
                println("Thank you, Come back again!")
            }
            else -> println("Invalid operation selected!!!")
        }
    }

}