package com.example.contactlistmanager.ui.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.contactlistmanager.ui.screens.AddContactScreen
import com.example.contactlistmanager.ui.screens.ContactListScreen

sealed class Screen(val route: String) {
    object ContactList : Screen("contact_list")
    object AddContact : Screen("add_contact")
}

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.ContactList.route
    ) {
        // Route 1: The Main List
        composable(Screen.ContactList.route) {
            ContactListScreen(
                onAddContactClick = {
                    navController.navigate(Screen.AddContact.route)
                }
            )
        }

        // Route 2: Add Contact Screen (Placeholder for now)
        composable(Screen.AddContact.route){
            // We will create the Screen Soon
            AddContactScreen (
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}