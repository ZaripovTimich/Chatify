package com.zaripych.chatify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zaripych.chatify.chat_list.presentation.ui.ChatListScreen
import com.zaripych.chatify.private_chat.presentation.ui.PrivateChatScreen
import com.zaripych.chatify.ui.theme.ChatifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            ChatifyTheme {
                NavHost(navController = navController, startDestination = Screen.ChatList.route) {
                    composable(Screen.ChatList.route) {
                        ChatListScreen(navController = navController)
                    }
                    composable(Screen.PrivateChat.route) {
                        PrivateChatScreen(navController = navController)
                    }
                }
            }
        }
    }
}
