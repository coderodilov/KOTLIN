package homeWork
/*
* Coder Odilov
* 09.02.2023
* */

/*
* Car class hosil qiling, va Nexia classi undan meros olsin,
* Car class ichidagi show() funsiyasini override qilib Nexia class ida qayta foydalaning
* */

fun main(){
    val car = Malibu()
    car.show()
}
open class Car {
    open fun show(){ println("Car") }
}
class Malibu: Car() {
    override fun show(){ println("This is 'Malibu 2' from Malibu Class. Malibu Class extends Car Class") }
}



