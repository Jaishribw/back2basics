package com.example.codingproblems.interviewquestions

import java.util.Locale

fun main(args: Array<String>) {
    print(13/2)
    print(13/2.0)
    print(13%2)
    print(13%2.0)

    /*------------------------------*/
    var str :String? = "Foo"
//    str = null
    val lowerCase = str?.toLowerCase(Locale.ROOT)
    println(lowerCase)
}