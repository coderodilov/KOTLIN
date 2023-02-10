package uzmobiloperators.util

interface CheckerInterface {
    fun checkName(name : String): Boolean
    fun checkPhone(phone : String): Boolean
    fun checkBalance(balance : Double): Boolean
}