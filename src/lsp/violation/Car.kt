package lsp.violation

// Liskov Substitution Principle Violation:
// As we saw in this example, the method we wrote in our main class should work properly in its subclasses according to the Liskov principle,
// but when our subclass inherited from our superclass, our fly method did not work as expected.

//Example1
/*open class Bird {
    open fun fly() {}
}

class Penguin : Bird() {
    override fun fly() {
        print("Penguins can't fly!")
    }
}*/

//Example2
open class Bird {
    open fun fly() {}
}

class Penguin : Bird() {
    override fun fly() {
        print("Penguins can't fly!")
    }
}

open class Car {
    fun getCabinWidth(): Int {
        return 39
    }
}

class RacingCar : Car() {
    fun cockpitWidth(): Int {
        return 12
    }
}

fun main() {
    val list = mutableListOf(RacingCar(), Car())
    list.forEach {
        when (it) {
            is RacingCar -> {
                println(it.cockpitWidth())
            }

            is Car -> {
                println(it.getCabinWidth())
            }
        }
    }
}