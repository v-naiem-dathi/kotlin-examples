package org.kotlinlang.play.productivityboosters.destructuring

data class User(val username: String, val email: String)    // 1

fun getUser() = User("Mary", "mary@somewhere.com")

fun main() {
    val user = getUser()
    val (username, email) = user                            // 2
    println(username == user.component1())                  // 3
    println(email != user.component2())

    val (_, emailAddress) = getUser()                       // 4
    println(emailAddress)
}