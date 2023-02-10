package uzmobiloperators
import uzmobiloperators.data.UserData
import uzmobiloperators.util.ServicesInterface
import uzmobiloperators.util.SortingInterface

class User : ServicesInterface, SortingInterface {
    private val listUser: ArrayList<UserData> = ArrayList()
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
            val balance = readln().toDouble()

            val userData = UserData(company = listCompany[n-1],phoneNumber = "+998$phoneNumber",fullName = fullName, balance = balance)

            if (Checker().checkAll(userData)) {
                listUser.add(userData)
                println("-- user added ✅ --")
            } else println("Something went wrong ❌")
        }
    }

    fun sortingType(){
        println("""
            1. by Balance
            2. by Name
            3. All
            0. Back
        """.trimIndent())
        print("Select service: ")

        when(readln().toInt()) {
            1 -> sortByBalance()
            2 -> sortByName()
            3 -> userList()
        }
    }
    fun loadUser(){
        listUser.add(UserData(company = "Beeline",phoneNumber = "+998916060266",fullName = "Ali Kadirov", balance = 152.00))
        listUser.add(UserData(company = "Beeline",phoneNumber = "+998905233368",fullName = "Shakhzod Toshboyev", balance = 23000.20))
        listUser.add(UserData(company = "Ucell",phoneNumber = "+998934125758",fullName = "Oydinbek Kamolov", balance = 1350.20))
        listUser.add(UserData(company = "Ucell",phoneNumber = "+9989400000000",fullName = "Asal Honey", balance = 00.00))
        listUser.add(UserData(company = "UMS",phoneNumber = "+998976536856",fullName = "Zarian Nizomiddinova", balance = 16200.00))
        listUser.add(UserData(company = "UMS",phoneNumber = "+998986356007",fullName = "Sherbek Polatov", balance = 8500.00))
        listUser.add(UserData(company = "Uzmobile",phoneNumber = "+998999655875",fullName = "Lil Kallenga Hurramov", balance = 15870.00))
        listUser.shuffle()
    }
    override fun deleteUser() {
        var count = 0
        listUser.sortBy { it.fullName }
        listUser.forEach {
            count++
            print("$count .")
            printUserInfo(it)

        }
        println("input user id to delete:")
        val userId = readln().toInt()
        listUser.removeAt(userId-1)
        println("-- user deleted ✅ --")
    }

    override fun searchUser() {
        TODO("Not yet implemented")
    }

    override fun userList() {
        listUser.forEach {
            printUserInfo(it)
        }
    }

    override fun sortByName() {
        listUser.sortBy { it.fullName }
        userList()
    }

    override fun sortByBalance() {
        listUser.sortByDescending { it.balance }
        userList()
    }

    private fun printUserInfo(data: UserData) {
        println("👨 ${data.fullName},📞 ${data.phoneNumber}, 💰 ${data.balance}, 🏦 ${data.company}")
    }

}