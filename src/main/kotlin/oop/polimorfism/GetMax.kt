package oop.polimorfism

/*
* Creator Coder Odilov
* Created on 13/02/23
*/class GetMax {
    fun getMax(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun getMax(a: Int, b: Int, c: Int): Int {
        return maxOf(a, maxOf(b, c))
    }
}