package com.example.codingproblems.clone.gmail.sealedclasses

sealed class Screens(val route : String) {
    object Home : Screens("home_screen")
    object Search : Screens("search_screen")
    object Profile : Screens("profile_screen")
    object Meet : Screens("meet_screen")
}