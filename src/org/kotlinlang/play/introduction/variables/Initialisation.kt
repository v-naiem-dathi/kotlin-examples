package org.kotlinlang.play.introduction.variables

fun main() {
    val d: Int  // 1

    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3
}

fun someCondition(): Boolean {
    return true
}