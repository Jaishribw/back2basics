package com.example.codingproblems.clone.gmail.drawer

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.codingproblems.R
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.GITHUB
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.LINKED_IN
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.TWEETER

@ExperimentalAnimationApi
@ExperimentalComposeUiApi
@Composable
fun DrawerFooter(
) {
    val uriHandler = LocalUriHandler.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 10.dp)
    ) {


        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Contact Creator",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.SemiBold,
        )

        LazyRow {
            item {
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        modifier = Modifier.size(18.dp),
                        contentDescription = LINKED_IN
                    )
                }
                Spacer(modifier = Modifier.size(12.dp))

                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        modifier = Modifier.size(18.dp),
                        contentDescription = GITHUB
                    )
                }

                Spacer(modifier = Modifier.size(12.dp))

                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        modifier = Modifier.size(18.dp),
                        contentDescription = TWEETER
                    )
                }
            }
        }
    }
}