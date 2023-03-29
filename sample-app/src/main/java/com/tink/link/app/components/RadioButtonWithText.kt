package com.tink.link.app.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tink.link.app.navToFlows.LaunchModeName
import com.tink.link.app.theme.Blue500

@Composable
fun RadioButtonWithText(
    selectedItem: LaunchModeName,
    label: LaunchModeName
) {
    RadioButton(
        modifier = Modifier.padding(end = 8.dp),
        selected = (selectedItem == label),
        onClick = null
    )

    Text(
        text = label.modeName,

        modifier = Modifier
            .padding(start = 8.dp),
        style = TextStyle(
            color = Blue500,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    )
}
