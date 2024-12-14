package com.jaybobzin.universal.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.jaybobzin.universal.app.home.HomeDestination
import com.jaybobzin.universal.app.home.homeGraph

@Composable
fun UniversalComposeNavHost(
    navController: NavHostController,
    onNavigateToDestination: (UniversalComposeNavigationDestination, String) -> Unit = { _, _ -> },
    onBackClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    startDestination: String = HomeDestination.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeGraph()
    }
}
