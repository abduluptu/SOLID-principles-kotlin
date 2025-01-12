package lsp.solution

// Liskov Substitution Principle Correct Usage
// As you can see in this example, all the things we write in the superclass will be valid in the subclasses,
// because we have implemented the method that is not valid for subclasses by creating an interface and implementing it where we need it.

//Example1
/*open class Bird {
    // common bird methods and properties
}

interface IFlyingBird {
    fun fly(): Boolean
}

class Penguin : Bird() {
    // methods and properties specific to penguins
}

class Eagle : Bird(), IFlyingBird {
    override fun fly(): Boolean {
        return true
    }
}*/

//Example2
open class Vehicle {
    open fun getInteriorWidth(): Int {
        return 0
    }
}

 class Car : Vehicle() {
    override fun getInteriorWidth(): Int {
        return this.getCabinWidth()
    }

    private fun getCabinWidth(): Int {
        return 39
    }
}

class RacingCar : Vehicle() {
    override fun getInteriorWidth(): Int {
        return this.cockpitWidth()
    }

    private fun cockpitWidth(): Int {
        return 12
    }
}

fun main() {
    val list = mutableListOf(RacingCar(), Car())
    list.forEach {
        println(it.getInteriorWidth())
    }
}