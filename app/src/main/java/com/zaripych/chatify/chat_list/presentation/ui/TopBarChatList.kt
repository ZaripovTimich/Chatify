package com.zaripych.chatify.chat_list.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zaripych.chatify.R
import com.zaripych.chatify.text_style.TextMedium16
import com.zaripych.chatify.ui.theme.primaryColor
import com.zaripych.chatify.ui.theme.white

@Composable
fun TopBarChatList(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(primaryColor),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextMedium16(
            modifier = Modifier.padding(start = 16.dp),
            text = stringResource(id = R.string.app_name),
            color = white
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
