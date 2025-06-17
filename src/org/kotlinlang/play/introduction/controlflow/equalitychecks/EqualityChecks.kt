package org.kotlinlang.play.introduction.controlflow.equalitychecks

val authors = setOf("Shakespeare", "Hemingway", "Twain")
val writers = setOf("Twain", "Shakespeare", "Hemingway")

fun main() {
    println(authors == writers)   // 1
    println(authors === writers)  // 2
}