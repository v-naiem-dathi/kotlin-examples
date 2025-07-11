package org.kotlinlang.play.productivityboosters.destructuring

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(list.min(), list.max())
}

fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)                              // 1

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {                                      // 2
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3
    println("min: $min and max: $max")
}