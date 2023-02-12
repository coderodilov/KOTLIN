package oop.abstraction
/*
* Creator Coder Odilov
* Created on 13/02/23
*/class Calculate : AbstractSample(), InterfaceSample{
    override fun addTwoNum(num1 : Int, num2 : Int) : Int {
        return num1 + num2
    }

    override fun multiplyTwoNum(num1 : Int, num2 : Int) : Int {
       return num1 * num2
    }
}