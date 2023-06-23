package com.zaripych.chatify

sealed class Screen(val route: String) {
    object ChatList : Screen("chat_list")
    object PrivateChat : Screen("private_chat")
    object GroupChat : Screen("group_chat")
    object ProfileHome : Screen("profile_home")
    object ProfileGuest : Screen("profile_guest")
}
