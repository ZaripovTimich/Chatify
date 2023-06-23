package com.zaripych.chatify.chat_list.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.zaripych.chatify.Screen

@Composable
fun ChatItem(
    modifier: Modifier = Modifier,
    item: String,
    navController: NavController
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 3.dp)
            .background(Color.Black)
            .clickable {
                navController.navigate(Screen.PrivateChat.route)
            },
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                modifier = Modifier.padding(start = 16.dp, bottom = 2.dp, top = 8.dp),
                text = item,
                fontSize = 14.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(start = 16.dp, bottom = 8.dp, top = 2.dp),
                text = "Го в баскет зарубимся?",
                fontSize = 12.sp,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
private fun ChatItemPreview() {
    ChatItem(
        item = "Вася",
        navController = rememberNavController()
    )
}
