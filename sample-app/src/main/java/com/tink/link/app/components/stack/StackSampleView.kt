package com.tink.link.app.components.stack

import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.tink.link.app.SDKAppearance
import com.tink.link.app.navToFlows.navigateToFlows
import com.tink.link.core.navigator.Stack
import com.tink.link.core.widgets.stack.StackContainer

@Composable
fun StackSampleView(activity: Activity, selectedFlow: String) {
    Column {
        TopAppBar(
            title = { Text(text = "Custom Toolbar", color = Color.White) },
            backgroundColor = Color.Black
        )

        Stack(tinkAppearance = SDKAppearance.getComposeAppearance(), onDismiss = {
            activity.finish()
        }).also {
            StackContainer(it) {
                navigateToFlows(it, selectedFlow, activity)
            }
        }
    }
}
