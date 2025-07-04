package org.kotlinlang.play.introduction.inheritance

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    var dog: Dog = Dog()
    dog.sayHello()
    dog = Yorkshire()
    dog.sayHello()
}