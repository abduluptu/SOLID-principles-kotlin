package ocp_2.a_violation

// Open/Closed Principle Violation
// In this example, when we try to add something new to our class,
// we have to rewrite our existing code, which can cause problems later on.

class Shape(val type: String, val width: Double, val height: Double)

fun calculateArea(shape: Shape): Double {
    if (shape.type == "rectangle") {
        return shape.width * shape.height
    } else if (shape.type == "circle") {
        return Math.PI * shape.width * shape.height
    }
    return 0.0
}

// using 'when'
/*fun calculateArea(shape: Shape): Double {
    return when (shape.type) {
        "rectangle" -> shape.width * shape.height
        "circle" -> Math.PI * shape.width * shape.height
        else -> 0.0
    }
}*/

fun main() {
    val rectangle = Shape("rectangle", 5.0, 10.0)
    val circle = Shape("circle", 7.0, 7.0)

    val rectangleArea = calculateArea(rectangle)
    val circleArea = calculateArea(circle)

    println("Rectangle Area: $rectangleArea")
    println("Circle Area: $circleArea")
}