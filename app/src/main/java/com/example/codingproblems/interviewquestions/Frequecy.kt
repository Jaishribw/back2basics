package com.example.codingproblems.interviewquestions

fun main(args: Array<String>) {
    val input = "acbcdd"//"Hello World"
    val frequencyMap = mutableMapOf<Char, Int>()

    for (char in input) {
        if (char.isLetter()) {
            val lowerChar = char.lowercaseChar()
            frequencyMap[lowerChar] = frequencyMap.getOrDefault(lowerChar, 0) + 1
        }
    }

    for ((char, frequency) in frequencyMap) {
        print("$char$frequency")
    }
}