package com.tink.link.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tink.link.app.theme.WebTheme
import com.tink.link.core.base.Tink

class SampleActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("tink-sdk-sample", "onCreate()")

        Tink.initSdk(
            // required for all flows
            clientId = "0c16388dd2ba43e5a7cda346d4961583",
            redirectUri = "tink://callback"
        )

        setContent {
            WebTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreenApp(this)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("tink-sdk-sample", "onResume()")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("tink-sdk-sample", "onNewIntent() intent.data = ${intent?.data}")
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
                HomeScreenApp(this)
            }
        }
    }
}
