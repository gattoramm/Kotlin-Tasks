package part1

import java.util.Random

class Rectangle2(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}

fun createRandomRectangle(): Rectangle2 {
    val random = Random()
    return Rectangle2(random.nextInt(), random.nextInt())
}
