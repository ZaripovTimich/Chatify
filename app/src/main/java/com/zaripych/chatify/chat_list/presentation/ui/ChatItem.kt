package com.zaripych.chatify.chat_list.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.zaripych.chatify.R
import com.zaripych.chatify.Screen
import com.zaripych.chatify.text_style.TextMedium13
import com.zaripych.chatify.text_style.TextMedium14
import com.zaripych.chatify.text_style.TextRegular13
import com.zaripych.chatify.ui.theme.darkPrimaryColor
import com.zaripych.chatify.ui.theme.darkPrimaryColor60
import com.zaripych.chatify.ui.theme.secondaryColor20
import com.zaripych.chatify.ui.theme.secondaryColor40
import com.zaripych.chatify.ui.theme.secondaryColor60
import com.zaripych.chatify.ui.theme.secondaryColor80
import com.zaripych.chatify.ui.theme.white

@Composable
fun ChatItem(
    modifier: Modifier = Modifier,
    item: String,
    navController: NavController
) {
    Column {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clickable {
                    navController.navigate(Screen.PrivateChat.route)
                },
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(64.dp, 64.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(45.dp)),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 4.dp, bottom = 8.dp, top = 8.dp)
                        .weight(1f)
                ) {
                    TextMedium14(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 8.dp),
                        text = item,
                        color = secondaryColor80
                    )
                    TextMedium13(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 8.dp)
                            .fillMaxWidth(),
                        text = "Го в баскет зарубимся?",
                        color = secondaryColor60
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(top = 8.dp, end = 16.dp, bottom = 8.dp)
                ) {
                    TextRegular13(
                        text = "Fri",
                        color = secondaryColor60
                    )
                    Box(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .background(
                                color = darkPrimaryColor60,
                                shape = RoundedCornerShape(45.dp)
                            )
                    ) {
                        TextRegular13(
                            modifier = Modifier.padding(horizontal = 6.dp),
                            text = "8",
                            color = white
                        )
                    }
                }
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 54.dp, end = 8.dp)
                .height(1.dp)
                .background(secondaryColor40)
        )
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
