package com.example.codingproblems.clone.todoapp.model

import java.time.Instant
import java.util.Date

data class ToDo(
    val id:Int,
    val title : String,
    val createdAt : Date
)


fun getFakeToDo() : List<ToDo> {
    return listOf<ToDo>(
        ToDo(1, "First", Date.from(Instant.now())),
        ToDo(2, "Second", Date.from(Instant.now())),
        ToDo(3, "Third", Date.from(Instant.now()))
    )
}