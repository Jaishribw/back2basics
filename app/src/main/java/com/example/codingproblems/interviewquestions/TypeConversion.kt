package com.example.codingproblems.interviewquestions

fun main(args: Array<String>){

    var x: Byte = 127
    var y:Int = x.toInt()
    var z :Double = y.toDouble()
    println("x: {$x}")
    println("y: {$y}")
    println("z: {$z}")

    val s1 = "earth"
    val s2 = "HEART"
    if (s1.replace(" ", "").lowercase().length !=
        s2.replace(" ", "").lowercase().length) {
        print("not anagram")
        return
    }else{
        val s1CharArray = s1.replace(" ", "").lowercase().toCharArray()
        val s2CharArray = s2.replace(" ", "").lowercase().toCharArray()

        s1CharArray.sort()
        s2CharArray.sort()

        if(s1CharArray.contentEquals(s2CharArray))
            print("anagram")
        else
            println("not anagram")
    }

}
