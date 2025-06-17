package org.kotlinlang.play.introduction.nullsafety

fun main() {
    val neverNull: String = "This can't be null"            // 1

    //neverNull = null                                        // 2

    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5

    //inferredNonNull = null                                  // 6

    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }

    strLength(neverNull)                                    // 8
    //strLength(nullable)                                     // 9

    val length = strLength(neverNull)
    println(length)

    fun describeString(maybeString: String?): String {              // 1
        return if (!maybeString.isNullOrEmpty()) {        // 2
            "String of length ${maybeString.length}"
        } else {
            "Empty or null string"                           // 3
        }
    }

    println(describeString("a string"))
    println(describeString(null))
    println(describeString(""))
}