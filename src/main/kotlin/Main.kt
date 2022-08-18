import java.util.Scanner

abstract class Car{
    open var model : String = ""
    open var color : String = ""
    open var speed : Double = 0.0
    open var make : String = ""
    open val fuelType : String = "Gas"

    open fun getFuelType(f: String = fuelType): String {

        return fuelType
    }

}

class BMW() : Car() {
    override var make = "BMW"
    override fun getFuelType(f: String): String {
        return "Gasoline 95"
    }
}

class Tesla() : Car() {
    override var make = "Tesla"
    override fun getFuelType(fuelType: String): String {
        val fuelType = "Electricity"
        return fuelType
    }
}

fun main(args: Array<String>) {
    var scn = Scanner(System.`in`)
    var car1 = BMW()
    var car2 = Tesla()
    println("Enter first car model: ")
    car1.model = scn.nextLine()
    println("Enter first car color: ")
    car1.color = scn.nextLine()
    println("Enter first car Top speed: ")
    car1.speed = scn.nextLine().toDouble()
    println("Enter second car model: ")
    car2.model = scn.nextLine()
    println("Enter second car color: ")
    car2.color = scn.nextLine()
    println("Enter second car Top speed: ")
    car2.speed = scn.nextDouble()
    car1.make = "BMW"
    car2.make = "Tesla"
    car1.getFuelType()
    car2.getFuelType()
    println("The first car is  a ${car1.make} model ${car1.model} colored ${car1.color} and a top speed of ${car1.speed} KM/H. " +
            " It runs on ${car1.getFuelType()}")
    println("The second car is  a ${car2.make} model ${car2.model} colored ${car2.color} and a top speed of ${car2.speed} KM/H. " +
            "It runs on ${car2.getFuelType()}.")
}
