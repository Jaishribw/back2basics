package com.example.codingproblems.clone.gmail.bottomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.Email
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.codingproblems.clone.gmail.sealedclasses.Screens

data class BottomNavigationItem(val label : String = "",
                                val icon : ImageVector = Icons.Filled.Home,
                                val route : String = ""
) {
    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Email",
                icon = Icons.Outlined.Email,
                route = Screens.Home.route
            ),
            BottomNavigationItem(
                label = "Meet",
                icon = Icons.Filled.ThumbUp,
                route = Screens.Meet.route
            )
        )
    }
}