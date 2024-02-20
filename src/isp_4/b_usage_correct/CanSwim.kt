package isp_4.b_usage_correct

// Interface Segregation Principle Correct Usage
// As we saw in the correct usage example, dividing the system into smaller interfaces and using them where we needed them made it much easier to change the system in the future.

interface CanSwim {
    fun swim()
}

interface CanFly {
    fun fly()
}

class Duck : CanSwim, CanFly {
    override fun swim() {
        println("Duck swimming")
    }

    override fun fly() {
        println("Duck flying")
    }
}

class Penguin : CanSwim {
    override fun swim() {
        println("Penguin swimming")
    }
}

fun main(){
    val duck = Duck()
    duck.swim()
    duck.fly()

    val penguin = Penguin()
    penguin.swim()
}