package com.zaripych.chatify.private_chat.presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrivateChatView(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopBarPrivateChat(navController = navController)
        }
    ) { paddingValues ->
        PrivateChatBodyUi(modifier = Modifier.padding(paddingValues))
    }
}

@Preview
@Composable
private fun PrivateChatPreview() {
    PrivateChatView(navController = rememberNavController())
}
