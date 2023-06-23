package com.zaripych.chatify.private_chat.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.zaripych.chatify.R

@Composable
fun TopBarPrivateChat(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .padding(12.dp)
                .clickable {
                    navController.navigateUp()
                },
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 8.dp),
            text = "Фара",
            fontSize = 20.sp
        )
    }
}

@Preview
@Composable
private fun TopBarPrivateChatPreview() {
    TopBarPrivateChat(navController = rememberNavController())
}
