package com.zaripych.chatify.chat_list.presentation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ChatListScreen(
    navController: NavController
) {
    ChatListView(navController = navController)
}
