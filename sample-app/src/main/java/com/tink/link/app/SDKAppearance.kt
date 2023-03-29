package com.tink.link.app

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Close
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceCompose

object SDKAppearance {
    fun getComposeAppearance(): TinkAppearance {
        return TinkAppearanceCompose(
            light = TinkAppearanceCompose.ThemeAttributes(
                toolbarColor = Color.White,
                windowBackgroundColor = Color.White,
                iconBack = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black
                    )
                },
                iconClose = {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Close",
                        tint = Color.Black
                    )
                },
                toolbarTitle = { Text(text = "Tink", color = Color.Black, fontSize = 24.sp) }
            ),
            dark = TinkAppearanceCompose.ThemeAttributes(
                toolbarColor = Color.Black,
                windowBackgroundColor = Color.Black,
                iconBack = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                },
                iconClose = {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = "Close",
                        tint = Color.White
                    )
                },
                toolbarTitle = { Text(text = "Tink", color = Color.White, fontSize = 24.sp) }
            )
        )
    }
}
