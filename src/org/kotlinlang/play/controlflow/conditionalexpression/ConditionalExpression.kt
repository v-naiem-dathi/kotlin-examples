package org.kotlinlang.play.controlflow.conditionalexpression

fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(99, -42))
}