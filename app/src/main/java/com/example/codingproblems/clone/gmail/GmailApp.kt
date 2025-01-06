package com.example.codingproblems.clone.gmail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codingproblems.R
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.MENU
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.PROFILE
import com.example.codingproblems.clone.gmail.gmailutil.Utility.Companion.SEARCH_BAR

@Composable
fun HomeAppBar(){
    Box(modifier = Modifier.padding(10.dp)){
        Card(modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(4.dp)

        ) {
            Row (verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)) {
                IconButton(onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(0.25f)) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = MENU)
                }
                Text(text = SEARCH_BAR, modifier = Modifier.weight(2.0f))
                Image(painter = painterResource(id = R.drawable.baked_goods_2),
                    contentDescription = PROFILE,
                    modifier = Modifier
                        .weight(0.25f)
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                )
            }
        }
    }
}

@Composable
@Preview
fun HomeAppBarPreview(){
    HomeAppBar()
}