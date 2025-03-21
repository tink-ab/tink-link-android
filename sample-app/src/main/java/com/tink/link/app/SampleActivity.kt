package com.tink.link.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tink.link.app.theme.WebTheme
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.configuration.BaseDomain
import com.tink.link.core.data.request.configuration.Configuration

class SampleActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")

        val configuration =
            Configuration(clientId = "", redirectUri = "", baseDomain = BaseDomain.EU)

        savedInstanceState?.let {
            Tink.restoreState(it)
        }

        val activity = this
        setContent {
            WebTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    contentWindowInsets = WindowInsets.safeDrawing
                ) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        HomeScreenApp(activity, configuration)
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent() intent.data = ${intent.data}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Tink.saveState(outState)
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        WebTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                HomeScreenApp(this, Configuration("", "", BaseDomain.EU))
            }
        }
    }
}
