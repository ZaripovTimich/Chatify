package com.zaripych.chatify.text_style

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.zaripych.chatify.ui.theme.black


@Composable
fun TextMedium13(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = black,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyleRobotoMedium13(
            textAlign = textAlign,
            color = color
        ),
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines
    )
}

@Composable
fun TextMedium14(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = black,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyleRobotoMedium14(
            textAlign = textAlign,
            color = color
        ),
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines
    )
}

@Composable
fun TextMedium16(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign? = null,
    color: Color = black,
    maxLines: Int = Int.MAX_VALUE
) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyleRobotoMedium16(
            textAlign = textAlign,
            color = color
        ),
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines
    )
}
