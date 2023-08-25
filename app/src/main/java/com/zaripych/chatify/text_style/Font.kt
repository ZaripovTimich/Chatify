package com.zaripych.chatify.text_style

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.zaripych.chatify.R

val robotoFontFamily = FontFamily(
    Font(
        resId = R.font.roboto_thin,
        weight = FontWeight.W100,
        style = FontStyle.Italic,
    ),
    Font(
        resId = R.font.roboto_light,
        weight = FontWeight.W300,
        style = FontStyle.Normal,
    ),
    Font(
        resId = R.font.roboto_regular,
        weight = FontWeight.W400,
        style = FontStyle.Normal,
    ),
    Font(
        resId = R.font.roboto_black,
        weight = FontWeight.W900,
        style = FontStyle.Italic,
    ),
    Font(
        resId = R.font.roboto_medium,
        weight = FontWeight.W500,
        style = FontStyle.Normal,
    ),
)
