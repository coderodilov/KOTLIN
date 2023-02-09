package registeration
interface CheckerInterface {
    fun checkName(name: String) : Boolean
    fun checkMail(mail: String) : Boolean
    fun checkPassword(pass: String) : Boolean
}