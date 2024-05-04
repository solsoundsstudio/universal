package com.jaybobzin.universal.app.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.jaybobzin.universal.app.navigation.UniversalComposeNavigationDestination

object HomeDestination : UniversalComposeNavigationDestination {
    override val route = "home_route"
    override val destination = "home_dest"
}

fun NavGraphBuilder.homeGraph() {
    composable(route = HomeDestination.route) {
        HomeRoute()
    }
}
