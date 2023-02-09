package registration
/*
* Coder Odilov
* 09.02.2023
* */

/*
* Ro'yxatdan o'tish tizimini tashkil qiling,
* bunda Data class, funksiya, List, interface dan foydalaning.
* (Barchasidan foydalanish talab qilinadi)*/

fun main(){
    print("Name: ")
    val name = readln()

    print("Mail: ")
    val mail = readln()

    print("Password: ")
    val pass = readln()

    registerUser(name, mail, pass)
}

fun registerUser(name: String, mail: String, pass: String) : ArrayList<UserModel>{
    val userList =  ArrayList<UserModel>()
    val checker = UserDetailsChecker()
    if (checker.checkUserDetails(name, mail, pass)) {
        userList.apply { add(UserModel(name,mail,pass))
        }
        println(userList)
    } else println("Something went wrong!")

    return userList
}

