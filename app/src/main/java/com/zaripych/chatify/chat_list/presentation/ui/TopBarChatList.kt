package com.zaripych.chatify.chat_list.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaripych.chatify.R

@Composable
fun TopBarChatList(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Chatify",
            fontSize = 20.sp
        )
        Image(
            modifier = Modifier
                .padding(12.dp)
                .clickable {

                },
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = null
        )
    }
}

@Preview
@Composable
private fun TopBarChatListPreview() {
    TopBarChatList()
}
