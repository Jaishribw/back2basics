package com.example.codingproblems

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.ConsoleMessage
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.codingproblems.clone.gmail.bottomnavbar.BottomNavigationBar
import com.example.codingproblems.clone.gmail.HomeAppBar
import com.example.codingproblems.clone.gmail.drawer.DrawerItem
import com.example.codingproblems.clone.instagram.animalprofile.ProfilePageUsingColumn
import com.example.codingproblems.ui.theme.CodingProblemsTheme
import com.example.codingproblems.utils.UtilClass.Companion.WEBVIEW_URL

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodingProblemsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    GmailApp()
                    //ProfilePageUsingColumn()
//                    AddWebView()
//                    ProfilePage()
                }
            }
        }
    }

    @Composable
    fun MyApp(){
        Text(text = "Welcome to my video",
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold)
    }

    @Composable
    fun AddWebView(){
        val mUrl = WEBVIEW_URL
        AndroidView(factory = {
            WebView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webChromeClient = CustomWebChromeClient()
            }
        }, update = {
            it.loadUrl(mUrl)
        })
    }

    class CustomWebChromeClient: WebChromeClient(){
        override fun onCloseWindow(window: WebView?) {
            super.onCloseWindow(window)
        }

        override fun onConsoleMessage(consoleMessage: ConsoleMessage?): Boolean {
            return super.onConsoleMessage(consoleMessage)
        }
    }

    @Composable
    @Preview(showBackground = true)
    fun ShowInstarPreview(){
        ProfilePageUsingColumn()
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun GmailApp(){
        Scaffold(topBar = { HomeAppBar() }) {
//            val navigationState = rememberDrawerState(initialValue = DrawerValue.Closed)
//            val scope = rememberCoroutineScope()
//            var selectedItemIndex by rememberSaveable {
//                mutableStateOf(0)
//            }

            BottomNavigationBar()
        }
    }

    @Composable
    @Preview
    fun ShowGmailPreview(){
        GmailApp()
    }

    @Composable
    @Preview
    fun SHowBottomMenu(){
        Surface(modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background) {
            BottomNavigationBar()
        }
    }
}

