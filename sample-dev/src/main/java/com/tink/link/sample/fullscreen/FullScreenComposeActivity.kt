package com.tink.link.sample.fullscreen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.transaction.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.FullScreen
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceCompose

/**
 * This class is to show how to implement Transactions as Fullscreen in Compose.
 *
 * */

class FullScreenComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the SDK.
        Tink.initSdk(
            // Required for all flows.
            clientId = "",
            redirectUri = ""
        )

        // Add Compose view.
        setContent {
            // Present the SDK.
            ShowTransactionsWithOneTimeAccess()
        }
    }

    // Example of one time access to Transactions presented in a fullscreen.
    // TODO: For launching other flows, please find implementation guidance in this link.
    @Composable
    private fun ShowTransactionsWithOneTimeAccess() {
        val fullScreen = FullScreen(getTinkTheme())

        // More parameters, such as market = Market.SE can be added to ConnectAccountsForOneTimeAccess().
        val oneTimeAccess = ConnectAccountsForOneTimeAccess()

        // Call this method to trigger the flow.
        Tink.Transactions.connectAccountsForOneTimeAccess(
            this,
            oneTimeAccess,
            fullScreen,
            { success: TinkTransactionsSuccess ->
                Log.d(TAG, "credentials_id = ${success.credentialsId}")
                Log.d(TAG, "code = ${success.code}")
            },
            { error: TinkError ->
                Log.d(TAG, "error message = ${error.errorDescription}")
            }
        )
    }

    private fun getTinkTheme(): TinkAppearance {
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

private const val TAG = "tink-sdk-sample"
