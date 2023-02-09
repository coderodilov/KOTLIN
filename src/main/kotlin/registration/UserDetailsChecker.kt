package registration
open class UserDetailsChecker : CheckerInterface{
        override fun checkName(name: String): Boolean {
            return name.length > 2 && "[A-Za-z']+".toRegex().matches(name)
        }

        override fun checkMail(mail: String): Boolean {
            return mail.length > 2 && mail.contains("@") && mail.contains(".")
        }

        override fun checkPassword(pass: String): Boolean {
            return pass.length > 6
        }

       fun checkUserDetails(name: String, mail: String, pass: String) : Boolean {
           val checker = UserDetailsChecker()
        return checker.checkName(name) && checker.checkMail(mail) && checker.checkPassword(pass)
       }
}



