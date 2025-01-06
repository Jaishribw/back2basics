package com.example.codingproblems.interviewquestions

sealed class Demo {
    data object A : Demo() {
        fun display() {
            println("Subclass A of Sealed class Demo ")
        }
    }

    data object B : Demo() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}

sealed class ABC {
    data object X : ABC() {
        // println("Subclass B of sealed class Demo")
    }
}
class Y : ABC(){
    class z: ABC(){

    }
}


fun main(args: Array<String>){
    val obj =Demo.B
    obj.display()
    val obj1=Demo.A
    obj1.display()

    val y = ABC.X

}
