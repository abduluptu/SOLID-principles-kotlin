package ocp_2.b_usage_correct

// Open/Closed Principle Correct Usage
// As in correct usage, instead of changing the class itself,
// we wrote new classes using our existing class
// and implemented our functions under new classes.

interface Shape {
    fun area(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun area(): Double = width * height
}

class Circle(private val radius: Double) : Shape {
    override fun area(): Double = Math.PI * radius * radius

}

fun calculateArea(shape: Shape) = shape.area()

fun main() {
    val rectangle = Rectangle(5.0, 10.0)
    val circle = Circle(7.0)

    val rectangleArea = calculateArea(rectangle)
    val circleArea = calculateArea(circle)

    println("Rectangle Area: $rectangleArea")
    println("Circle Area: $circleArea")
}