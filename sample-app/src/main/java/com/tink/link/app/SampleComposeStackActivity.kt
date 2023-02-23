package com.tink.link.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tink.link.app.components.stack.StackSampleView
import com.tink.link.app.theme.WebTheme

class SampleComposeStackActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val selectedFlow = intent.getStringExtra("selected_flow") ?: ""
        setContent { ShowComposeContent(selectedFlow) }
    }

    @Composable
    private fun ShowComposeContent(selectedFlow: String) {
        WebTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                StackSampleView(this, selectedFlow)
            }
        }
    }
}
