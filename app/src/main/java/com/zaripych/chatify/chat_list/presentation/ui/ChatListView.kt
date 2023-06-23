package com.zaripych.chatify.chat_list.presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatListView(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val list = listOf("Фара", "Name2", "Name3", "Name4")
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopBarChatList()
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(list) {
                ChatItem(
                    item = it,
                    navController = navController
                )
            }
        }
    }
}

@Preview
@Composable
private fun ChatListPreview() {
    ChatListView(navController = rememberNavController())
}
