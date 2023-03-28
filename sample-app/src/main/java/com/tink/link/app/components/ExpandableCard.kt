package com.tink.link.app.components

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tink.link.app.SDKAppearance.getComposeAppearance
import com.tink.link.app.navToFlows.LaunchModeName
import com.tink.link.app.navToFlows.navigateToFlows
import com.tink.link.app.theme.Blue300
import com.tink.link.app.theme.Blue500
import com.tink.link.app.theme.Blue700
import com.tink.link.core.data.request.configuration.Configuration
import com.tink.link.core.navigator.FullScreen
import com.tink.link.core.navigator.LaunchMode
import com.tink.link.core.navigator.Modal

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExpandableCard(
    header: String,
    itemList: List<String>,
    activity: Activity,
    configuration: Configuration,
    selectedLaunchMode: LaunchModeName
) {
    var expand by remember { mutableStateOf(false) } // Expand State
    val rotationState by animateFloatAsState(if (expand) 180f else 0f) // Rotation State

    Card(
        modifier = Modifier
            .animateContentSize( // Animation
                animationSpec = tween(
                    durationMillis = 400, // Animation Speed
                    easing = LinearOutSlowInEasing // Animation Type
                )
            )
            .padding(12.dp),
        backgroundColor = Blue300,
        shape = RoundedCornerShape(16.dp),
        onClick = { expand = !expand }
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = header,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .weight(.9f)
                        .padding(start = 8.dp),
                    style = TextStyle(
                        color = Blue500,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                IconButton(
                    modifier = Modifier
                        .rotate(rotationState)
                        .weight(.1f),
                    onClick = {
                        expand = !expand
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        tint = Blue700,
                        contentDescription = "Drop Down Arrow"
                    )
                }
            }
            if (expand) {
                Column(Modifier.padding(bottom = 20.dp)) {
                    itemList.forEach { item ->
                        FlowCard(item) {
                            when (selectedLaunchMode) {
                                LaunchModeName.FULL_SCREEN -> executeLaunch(activity, configuration, FullScreen(getComposeAppearance()), item)
                                LaunchModeName.MODAL -> executeLaunch(activity, configuration, Modal(getComposeAppearance()), item)
                            }
                        }
                    }
                }
            }
        }
    }
}

private fun executeLaunch(activity: Activity, configuration: Configuration, launchMode: LaunchMode? = null, selectedFlow: String) {
    launchMode?.let {
        navigateToFlows(launchMode, configuration, selectedFlow, activity)
    }
}
