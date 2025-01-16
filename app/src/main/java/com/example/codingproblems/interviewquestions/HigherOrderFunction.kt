package com.example.codingproblems.interviewquestions

class HigherOrderFunction {
    var lambdaPrint = { println("My FirstExample of Higher Oder Function") }
    var lambdaPrintMe = { println("ME: My FirstExample of Higher Oder Function") }
    fun higherFunc( lmbd: () -> Unit ) {     // accepting lambda as parameter
        lmbd()                               //invokes lambda expression
    }

    val addLambda = {a: Int, b:Int -> a+b}
    fun higherFunctionAdd(add : (Int, Int) -> Int){
        val result = add(3,4)
        println("The sum is : $result")
    }
    //Function as parameter
    fun add(a: Int, b: Int): Int{
        val sum = a + b
        return sum
    }

    fun higherOrderFunParamAdd(addFunc:(Int,Int)-> Int){
        // invoke regular function using local name
        val result = addFunc(3,6)
        println("The sum of two numbers is: $result")
    }

    /**/

    fun scanMe(s: String): Unit{
        println(s)
    }

    fun higherOrderScan(frequency : Int, message: String, scanMeFun: (String) -> Unit){
        for (i in 0..frequency){
            scanMeFun(message)
        }
    }
}

fun main(args: Array<String>) {
    HigherOrderFunction().apply {
        higherFunc (lambdaPrint)
        higherFunc  (lambdaPrintMe)
        higherFunctionAdd(addLambda)
        higherOrderFunParamAdd(::add)//Function as parameter
        higherOrderFunParamAdd(addFunc =  ::add)
        higherOrderScan(frequency = 5, message = "My Documents scanned", scanMeFun = ::scanMe)
    }
}