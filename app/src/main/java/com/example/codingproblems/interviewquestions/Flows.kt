package com.example.codingproblems.interviewquestions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

//https://outcomeschool.com/blog/flow-api-in-kotlin

suspend fun demoFlowOF(){
    val TAG = "FLOW flowOf"
    flowOf(1,2,3,5).collect{

        println( it)
    }
}

suspend fun demoAsFlow(){
    (1..5).asFlow().collect{
        println(it)
    }
}

suspend fun demoFlow(){
    flow{
        (0..10).forEach { emit(it) }
    }.collect{
        println(it)
    }
}


suspend fun demoChannelFlow(){
    //Cold flow
    channelFlow {
        (0..10).forEach { send(it) }
    }.collect{
        println(it)
    }
}
fun main(args: Array<String>){
    CoroutineScope(Dispatchers.Unconfined).launch {
        //demoFlowOF()
//        demoAsFlow()
//        demoFlow()
        demoChannelFlow()
    }
}