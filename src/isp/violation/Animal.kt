package isp.violation

// Interface Segregation Principle Violation
// When we look at our example, we see that the interface we created contains many methods.
// If we do everything inside a common interface, we may have made unnecessary use in the places that implement our interface.
// Instead, we can divide our system into smaller interface parts.


interface Animal {
    fun swim()
    fun fly()
}

class Duck : Animal {
    override fun swim() {
        println("Duck swimming")
    }

    override fun fly() {
        println("Duck flying")
    }
}

class Penguin : Animal {
    override fun swim() {
        println("Penguin swimming")
    }

    override fun fly() {
        //throw UnsupportedOperationException("Penguin cannot fly")
        println("Penguin cannot fly")
    }
}

fun main(){
    val duck = Duck()
    duck.swim()
    duck.fly()

    val penguin = Penguin()
    penguin.swim()
    penguin.fly()
}