package com.example.codingproblems.clone.gmail.bottomnavbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeBottomMenu() : List<BottomMenuData> {
    val list = listOf(BottomMenuData.Mail, BottomMenuData.Meet)
    return list
}

@Composable
@Preview

fun ShowBottomNav(){
    BottomNavigationBar()
}


