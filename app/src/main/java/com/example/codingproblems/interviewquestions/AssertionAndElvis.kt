package com.example.codingproblems.interviewquestions

fun main(args: Array<String>) {
//    val name: String? = null
//    val length = name?.length
//    println(length)
    val nn :Int = 3*2%4-1
    printNum(nn)
    var i = 0
    do {
        print(i)
        i++
    }while (i<10)

    var a=5
    var b=a++
    val cars = arrayOf("Mercedes", "BMW", "FORD", "Opel")
//    while (a>b){
//        println(cars[2])
//    }

}

fun printNum(a:Int){
    println(a)
    val cars: Cars = Cars()
    cars.name = "FORD"
//    cars.model = "2000"
    println(cars.model)
}
class Cars{
    var name : String? = null
    var model : String? = null
        private set


}