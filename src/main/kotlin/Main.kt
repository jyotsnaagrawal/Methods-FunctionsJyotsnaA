import kotlin.math.PI
fun main() {
    showMenu()
}

fun showMenu() {
    println("Select a shape to calculate the area:")
    println("1. Circle")
    println("2. Square")
    println("3. Rectangle")
    println("4. Triangle")

    val choice = readlnOrNull()?.toIntOrNull()

    when (choice) {
        1 -> calculateCircleArea()
        2 -> calculateSquareArea()
        3 -> calculateRectangleArea()
        4 -> calculateTriangleArea()
        else -> println("Invalid choice. Please enter a number between 1 and 4.")
    }
}

fun calculateCircleArea() {
    println("Enter the radius of the circle:")
    val radius = readlnOrNull()?.toDoubleOrNull()

    if (radius != null && radius > 0) {
        val area = PI * radius * radius
        println("The area of the circle is: $area square units.")
    } else {
        println("Invalid input. Please enter a valid positive number for the radius.")
    }
}

fun calculateSquareArea() {
    println("Enter the side length of the square:")
    val sideLength = readlnOrNull()?.toDoubleOrNull()

    if (sideLength != null && sideLength > 0) {
        val area = sideLength * sideLength
        println("The area of the square is: $area square units.")
    } else {
        println("Invalid input. Please enter a valid positive number for the side length.")
    }
}

fun calculateRectangleArea() {
    println("Enter the length of the rectangle:")
    val length = readlnOrNull()?.toDoubleOrNull()

    println("Enter the width of the rectangle:")
    val width = readlnOrNull()?.toDoubleOrNull()

    if (length != null && width != null && length > 0 && width > 0) {
        val area = length * width
        println("The area of the rectangle is: $area square units.")
    } else {
        println("Invalid input. Please enter valid positive numbers for the length and width.")
    }
}
fun calculateTriangleArea() {
    println("Enter the base length of the triangle:")
    val base = readlnOrNull()?.toDoubleOrNull()

    println("Enter the height of the triangle:")
    val height = readlnOrNull()?.toDoubleOrNull()

    if (base != null && height != null && base > 0 && height > 0) {
        val area = 0.5 * base * height
        println("The area of the triangle is: $area square units.")
    } else {
        println("Invalid input. Please enter valid positive numbers for the base and height.")
    }
}
