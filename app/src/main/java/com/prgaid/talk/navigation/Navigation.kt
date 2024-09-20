package com.prgaid.talk.navigation

import android.provider.ContactsContract.Profile
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prgaid.talk.screens.Login
import com.prgaid.talk.screens.Profile
import com.prgaid.talk.screens.Register

@Composable
fun Navigation(navController: NavHostController, startingScreen: String) {
    NavHost(navController = navController, startDestination = startingScreen) {
        composable(Screens.Profile.name){
            Profile(navController = navController)
        }
        composable(Screens.Login.name){
            Login(navController = navController)
        }
        composable(Screens.Register.name){
            Register(navController = navController)
        }

    }
}






