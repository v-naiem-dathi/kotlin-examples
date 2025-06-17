package org.kotlinlang.play.controlflow.loops

val cakes = listOf("carrot", "cheese", "chocolate")

fun main() {
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }
}
