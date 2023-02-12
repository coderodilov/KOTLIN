package uzmobiloperators.main
import uzmobiloperators.data.UserData
import uzmobiloperators.util.ServicesInterface
import uzmobiloperators.util.SortingInterface
class User : ServicesInterface, SortingInterface {
    private val listUser: ArrayList<UserData> = ArrayList()

    fun sortingType(){
        println("""
            1. by Balance
            2. by Name
            3. All
            0. Back
        """.trimIndent())
        print("Select service: ")

        when(readln()) {
            "1" -> sortByBalance()
            "2" -> sortByName()
            "3" -> allUsersList()
            else ->  println("Invalid operator selected ❌")
        }
    }

    override fun addUser() {
        println("--- \uD83E\uDDD1 add user --- ")
        println("""
            1. Uzmobile
            2. Beeline
            3. Ucell
            4. UMS
        """.trimIndent())
        print("Select operator: ")
        val n = readln().toInt()

        val listCompany = listOf("Uzmobile","Beeline","Ucell","UMS")
        if (n > 4)  {
            println("Invalid operator selected ❌")
        } else {
            print("Enter phone number: +998 ")
            val phoneNumber = readln()
            print("Enter full name: ")
            val fullName = readln()
            print("Enter your balance: ")
            val balance = readln()

            val userData = UserData(company = listCompany[n-1],phoneNumber = "+998${phoneNumber.trim()}",fullName = formatUserName(fullName), balance = balance.toDouble())

            if (Checker().checkAll(userData)) {
                listUser.add(userData)
                println("-- user added ✅ --")
            } else println("Something went wrong ❌")

        }
    }

    override fun deleteUser() {
        var count = 0
        listUser.sortBy { it.fullName }
        listUser.forEach {
            count++
            print("$count .")
            printUserInfo(it)
        }
        print("input user id to delete:")
        val userId = readln().toInt()
        printUserInfo(listUser[userId-1])
        listUser.removeAt(userId-1)
        println("-- user deleted ✅ --")
    }

    override fun searchUser() {
        println("""
            1. by Name
            2. by Lastname
            3. by Company
            0. Back
        """.trimIndent())
        print("Select service: ")

        when(readln()) {
            "1" -> searchByName()
            "2" -> searchByLastName()
            "3" -> searchByCompany()
            else ->  println("Invalid operator selected ❌")
        }

    }

    fun loadUser(){
        listUser.add(UserData(company = "Beeline",phoneNumber = "+998916060266",fullName = "Ali Kadirov", balance = 152.00))
        listUser.add(UserData(company = "Beeline",phoneNumber = "+998905233368",fullName = "Shakhzod Toshboyev", balance = 23000.20))
        listUser.add(UserData(company = "Ucell",phoneNumber = "+998934125758",fullName = "Oydinbek Kamolov", balance = 1350.20))
        listUser.add(UserData(company = "Ucell",phoneNumber = "+9989400000000",fullName = "Asal Honey", balance = 00.00))
        listUser.add(UserData(company = "UMS",phoneNumber = "+998976536856",fullName = "Zarian Nizomiddinova", balance = 16200.00))
        listUser.add(UserData(company = "UMS",phoneNumber = "+998986356007",fullName = "Sherbek Polatov", balance = 8500.00))
        listUser.add(UserData(company = "Uzmobile",phoneNumber = "+998999655875",fullName = "Lil Hurramov", balance = 15870.00))
        listUser.shuffle()
    }

    //region Search

    private fun searchByName(){
        print("Enter name: ")
        val name = readln()
        var counter = 0
        listUser.forEach {
            if ( it.fullName.contains(name.trim().lowercase().capitalize()))  {
                counter++
                printUserInfo(it)
            }
        }
        if (counter == 0) println("User not found ❌")
    }

    private fun searchByLastName(){
        print("Enter lastname: ")
        val name = readln()
        var counter = 0
        listUser.forEach {
            if (it.fullName.contains(name.trim().lowercase().capitalize()))   {
                counter++
                printUserInfo(it)
            }
        }
        if (counter == 0) println("User not found ❌")
    }

    private fun searchByCompany(){
        print("Enter company name: ")
        val name = readln()
        var counter = 0
        listUser.forEach {

            if ( it.company.contains(name.trim().lowercase().capitalize())) {
                counter++
                printUserInfo(it)
            }
        }
        if (counter == 0) println("User not found ❌")
    }

    //endregion

    //region Users
    override fun allUsersList() {
        listUser.forEach {
            printUserInfo(it)
        }
    }

    override fun sortByName() {
        listUser.sortBy { it.fullName }
        allUsersList()
    }

    override fun sortByBalance() {
        listUser.sortByDescending { it.balance }
        allUsersList()
    }

    //endregion

    //region Functions
    private fun printUserInfo(data: UserData){
        println("👨 ${data.fullName},📞 ${data.phoneNumber}, 💰 ${data.balance}, 🏦 ${data.company}")
    }

    private fun formatUserName(name : String): String{
        return name.lowercase().split(" ").joinToString(separator = " ", transform = String::capitalize)
    }

    //endregion
}

