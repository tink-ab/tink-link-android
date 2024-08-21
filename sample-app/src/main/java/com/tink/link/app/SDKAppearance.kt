package com.tink.link.app

import androidx.compose.ui.graphics.Color
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceCompose

object SDKAppearance {
    fun getComposeAppearance(): TinkAppearance {
        return TinkAppearanceCompose(
            light = TinkAppearanceCompose.ThemeAttributes(
                windowBackgroundColor = Color.White
            ),
            dark = TinkAppearanceCompose.ThemeAttributes(
                windowBackgroundColor = Color.Black
            )
        )
    }
}
