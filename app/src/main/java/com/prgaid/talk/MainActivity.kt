package com.prgaid.talk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.prgaid.talk.navigation.Navigation
import com.prgaid.talk.navigation.Screens
import com.prgaid.talk.ui.theme.TalkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TalkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    ProfileApp(navController = navController)
                }
            }
        }
    }
}



@Composable
fun ProfileApp(navController: NavHostController) {

    Navigation(navController = navController, startingScreen = Screens.Login.name)
}

@Preview(showBackground = true)
@Composable
fun ProfileAppPreview() {
    val navController = rememberNavController() // Initialise NavController pour le preview
    ProfileApp(navController = navController)
}