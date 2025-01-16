package com.example.codingproblems.clone.instagram.animalprofile

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.codingproblems.R

@Composable
fun ProfilePage(){
    Card (
        modifier = Modifier
            .padding(
                top = 20.dp,
                bottom = 20.dp, start = 16.dp, end = 16.dp
            )
            .border(
                width = 2.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(6.dp)
            )
        ){
        BoxWithConstraints (Modifier.verticalScroll(rememberScrollState())){
            val constraints = if(minWidth < 400.dp){
                Log.d("You : ", "LandScapeConstraint")
                PortraitConstraint(margin = 16.dp)
            } else {
                PortraitConstraint(margin = 16.dp)
//                Log.d("You : ", "PortraitConstraint")
            }
            ConstraintLayout (constraints){

                Image(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .border(
                            width = 2.dp,
                            color = Color.Red,
                            shape = CircleShape
                        )
                        .layoutId("image"),
                    contentScale = ContentScale.Crop,

                    painter = painterResource(id = R.drawable.baked_goods_3),
                    contentDescription = "animal")
                Text(text = "Baking Cake", Modifier.layoutId("nameText"))
                Text(text = "India", Modifier.layoutId("countryText"))

                Row (horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .layoutId("rowStat")
                )
                {
                    ProfileStates("150", "Followers", 6.dp)
                    ProfileStates("100", "Following", 6.dp)
                    ProfileStates("30", "Posts", 6.dp)
                }

                Button(modifier = Modifier
                    .clip(RectangleShape)
                    .layoutId("btnFollow"),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Follow")
                }

                Button(modifier = Modifier
                    .clip(RectangleShape)
                    .padding(end = 6.dp)
                    .layoutId("btnMessage"),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Direct Message")
                }

            }
        }

    }

}

@Composable
fun ProfilePageNoRotation(){
    Card (
        modifier = Modifier
            .padding(
                top = 100.dp,
                bottom = 100.dp, start = 16.dp, end = 16.dp
            )
            .border(
                width = 2.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(6.dp)
            )
    ){
        ConstraintLayout {
            val guideLine = createGuidelineFromTop(0.15f)
            val (image, nameText, countryText, rowStates, actionFollow, actionMessage) = createRefs()
            Image(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    )
                    .constrainAs(image) {
                        top.linkTo(guideLine)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                contentScale = ContentScale.Crop,

                painter = painterResource(id = R.drawable.baked_goods_3),
                contentDescription = "animal")
            Text(text = "Baking Cake",
                modifier = Modifier.constrainAs(nameText){
                    top.linkTo(image.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })
            Text(text = "India",
                modifier = Modifier.constrainAs(countryText){
                    top.linkTo(nameText.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

            Row (horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .constrainAs(rowStates) {
                        top.linkTo(countryText.bottom)
                    })
            {
                ProfileStates("150", "Followers", 6.dp)
                ProfileStates("100", "Following", 6.dp)
                ProfileStates("30", "Posts", 6.dp)
            }

            Button(modifier = Modifier
                .clip(RectangleShape)
                .constrainAs(actionFollow) {
                    top.linkTo(rowStates.bottom, margin = 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(actionMessage.start)
                    width = Dimension.wrapContent
                },
                onClick = { /*TODO*/ }) {
                Text(text = "Follow")
            }

            Button(modifier = Modifier
                .clip(RectangleShape)
                .constrainAs(actionMessage) {
                    top.linkTo(rowStates.bottom, margin = 16.dp)
                    start.linkTo(actionFollow.end)
                    end.linkTo(parent.end)

                },
                onClick = { /*TODO*/ }) {
                Text(text = "Direct Message")
            }

        }
    }

}

@Composable
fun ProfilePageUsingColumn(){
    Card (
        modifier = Modifier
            .padding(
                top = 100.dp,
                bottom = 100.dp, start = 16.dp, end = 16.dp
            )
            .border(
                width = 2.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(6.dp)
            )
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 20.dp, bottom = 20.dp)
                .verticalScroll(rememberScrollState())) {
            Image(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    ),
                contentScale = ContentScale.Crop,

                painter = painterResource(id = R.drawable.baked_goods_3),
                contentDescription = "animal")
            Text(text = "Baking Cake")
            Text(text = "India")

            Row (horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp))
            {
                ProfileStates("150", "Followers", 6.dp)
                ProfileStates("100", "Following", 6.dp)
                ProfileStates("30", "Posts", 6.dp)
            }

            Row (horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RectangleShape)
                    .padding((16.dp))){
                Button(modifier = Modifier.clip(RectangleShape),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Follow")
                }

                Button(modifier = Modifier.clip(RectangleShape),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Direct Message")
                }

            }

        }
    }

}

@Composable
fun ProfileStates(count: String, title: String, margin: Dp){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Text(text = count , fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(margin))
        Text(text = title , fontWeight = FontWeight.Bold, modifier = Modifier.padding(margin))
    }
}

@Composable
fun PortraitConstraint(margin: Dp): ConstraintSet{
    return ConstraintSet{
        val guideLine = createGuidelineFromTop(0.15f)
        val image = createRefFor("image")
        val nameText = createRefFor("nameText")
        val countryText = createRefFor("countryText")
        val rowStat = createRefFor("rowStat")
        val btnFollow = createRefFor("btnFollow")
        val btnMessage = createRefFor("btnMessage")
            constrain(image){
                top.linkTo(guideLine)
                start.linkTo(parent.start)
               // end.linkTo(parent.end)

            }

        constrain(nameText){
            top.linkTo(image.bottom, margin = margin)
            start.linkTo(parent.start, margin = margin)
          //  end.linkTo(parent.end)

        }

        constrain(countryText){
            top.linkTo(nameText.bottom)
            start.linkTo(parent.start, margin = margin)
            //end.linkTo(parent.end)

        }

        constrain(rowStat){
            top.linkTo(guideLine)
            start.linkTo(image.end, margin = margin)
            end.linkTo(parent.end, margin = margin)

        }


        constrain(btnFollow){
            top.linkTo(rowStat.bottom, margin = margin)
            start.linkTo(image.end, margin = margin)
            end.linkTo(btnMessage.start, margin = margin)
            width = Dimension.wrapContent

        }

        constrain(btnMessage){
            top.linkTo(rowStat.bottom, margin = margin)
            start.linkTo(btnFollow.end)
            end.linkTo(parent.end)
            width = Dimension.wrapContent
        }
    }
}

@Composable
fun LandScapeConstraint(margin: Dp): ConstraintSet{
    return ConstraintSet{
        val guideLine = createGuidelineFromTop(0.15f)
        val image = createRefFor("image")
        val nameText = createRefFor("nameText")
        val countryText = createRefFor("countryText")
        val rowStat = createRefFor("rowStat")
        val btnFollow = createRefFor("btnFollow")
        val btnMessage = createRefFor("btnMessage")
        constrain(image){
            top.linkTo(parent.top, margin = margin)
            start.linkTo(parent.start, margin = margin)

        }

        constrain(nameText){
            top.linkTo(image.bottom)
            start.linkTo(parent.start, margin = margin)
        }

        constrain(countryText){
            top.linkTo(nameText.bottom)
            start.linkTo(nameText.start)
            end.linkTo(nameText.end)

        }

        constrain(rowStat){
            top.linkTo(parent.top, margin = margin)
            start.linkTo(image.end)

        }


        constrain(btnFollow){
            top.linkTo(rowStat.bottom, margin = margin)
            start.linkTo(rowStat.start)
            width = Dimension.wrapContent

        }

        constrain(btnMessage){
            top.linkTo(rowStat.bottom, margin = margin)
            start.linkTo(btnFollow.end, margin = margin)
            width = Dimension.wrapContent
        }
    }
}
@Composable
@Preview
fun PreviewProfile(){
//    ProfilePageUsingColumn()
    ProfilePage()
}