package com.example.codingproblems.clone.gmail.bottomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.outlined.Face
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.MAIL
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.MEET

sealed class BottomMenuData(val icon : ImageVector,
                            val title: String) {

    object Mail: BottomMenuData(icon = Icons.Filled.MailOutline, MAIL)
    object Meet: BottomMenuData(icon = Icons.Outlined.Face, MEET)
}