package com.example.codingproblems.interviewquestions

class NLPE {
    private var name : String = "Asha"
    private var department: String? = "IT"

    fun getName (){
        name.length
//        name = null//Null can not be a value of a non-null type String
    }

    fun getDepartment(){
        //department = null
        department?.let { println(it.length) }
    }



}