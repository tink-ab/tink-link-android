package com.tink.link.app.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tink.link.app.theme.Blue500

@Composable
fun TitleText(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        textAlign = TextAlign.Start,
        modifier = Modifier
            .padding(start = 8.dp),
        style = TextStyle(
            color = Blue500,
            fontWeight = FontWeight.Bold
        )
    )
}
