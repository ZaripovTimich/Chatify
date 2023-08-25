package com.zaripych.chatify.text_style

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.zaripych.chatify.ui.theme.black


@Composable
fun textStyleRobotoMedium13(
    textAlign: TextAlign? = null,
    color: Color = black,
) = TextStyle(
    textAlign = textAlign,
    color = color,
    fontFamily = robotoFontFamily,
    fontSize = 13.sp,
    lineHeight = 20.sp,
    fontStyle = FontStyle.Normal,
    fontWeight = FontWeight.W500,
)

@Composable
fun textStyleRobotoMedium14(
    textAlign: TextAlign? = null,
    color: Color = black,
) = TextStyle(
    textAlign = textAlign,
    color = color,
    fontFamily = robotoFontFamily,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontStyle = FontStyle.Normal,
    fontWeight = FontWeight.W500,
)

@Composable
fun textStyleRobotoMedium16(
    textAlign: TextAlign? = null,
    color: Color = black,
) = TextStyle(
    textAlign = textAlign,
    color = color,
    fontFamily = robotoFontFamily,
    fontSize = 16.sp,
    lineHeight = 20.sp,
    fontStyle = FontStyle.Normal,
    fontWeight = FontWeight.W500,
)
