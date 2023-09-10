package com.example.navigationapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Shop
import androidx.compose.material.icons.filled.Task
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destination(val route: String, val icon: ImageVector, val title: String) {
    object Transaction : Destination(
        route = "transactions", icon = Icons.Filled.Wallet,
        title = "Transactions"
    )

    object Budgets : Destination(
        route = "budget", icon = Icons.Filled.Shop,
        title = "Budget"
    )

    object Tasks : Destination(route = "tasks", icon = Icons.Filled.Task, title = "Tasks")
    object Settings : Destination(
        route = "settings", icon = Icons.Filled.Settings,
        title = "Settings"
    )

    companion object {
        val toList = listOf(Transaction, Budgets, Tasks, Settings)
    }
}