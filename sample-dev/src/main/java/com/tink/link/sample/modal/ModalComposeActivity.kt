package com.tink.link.sample.modal

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.transactions.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.Modal
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceCompose
import com.tink.link.core.data.request.common.Market
import com.tink.link.core.data.request.configuration.Configuration

/**
 * This class is to show how to run Transactions as Modal in Compose.
 *
 * */
class ModalComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Add Compose view.
        setContent {
            Column {
                TopAppBar(
                    title = { Text(text = "Custom Toolbar", color = Color.White) },
                    backgroundColor = Color.Black
                )

                // Present the SDK.
                ShowTransactionsWithOneTimeAccess()
            }
        }
    }

    // Example of one time access to Transactions presented in a modal.
    // For launching other flows, please find implementation guidance in this link: https://github.com/tink-ab/tink-link-android/blob/master/sample-app/src/main/java/com/tink/link/app/navToFlows/FlowCases.kt
    @Composable
    private fun ShowTransactionsWithOneTimeAccess() {
        // Add basic required parameters.
        val configuration = Configuration(
            clientId = "",
            redirectUri = "")

        // Get Modal UI.
        val modal = Modal(getTinkTheme())

        // More parameters can be added to ConnectAccountsForOneTimeAccess().
        val oneTimeAccess = ConnectAccountsForOneTimeAccess(Market.SE)

        // Call this method to trigger the flow.
        Tink.Transactions.connectAccountsForOneTimeAccess(
            this,
            configuration,
            oneTimeAccess,
            modal,
            { success: TinkTransactionsSuccess ->
                Log.d(TAG, "credentials_id = ${success.credentialsId}")
                Log.d(TAG, "code = ${success.code}")
            },
            { error: TinkError ->
                Log.d(TAG, "error message = ${error.errorDescription}")
            }
        )
    }

    // Color, icons and title can be customized for both Light/Dark mode by changing the values on TinkAppearanceCompose.ThemeAttributes as below:
    private fun getTinkTheme(): TinkAppearance {
        return TinkAppearanceCompose(
            light = TinkAppearanceCompose.ThemeAttributes(
                toolbarColor = Color.White,
                windowBackgroundColor = Color.White,
                iconBack = {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
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
                toolbarTitle = { Text(text = "Tink", color = Color.Black) }
            ),
            dark = TinkAppearanceCompose.ThemeAttributes(
                toolbarColor = Color.Black,
                windowBackgroundColor = Color.Black,
                iconBack = {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                },
                iconClose = {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = "Close",
                        tint = Color.White
                    )
                },
                toolbarTitle = { Text(text = "Tink", color = Color.White, fontSize = 20.sp) }
            )
        )
    }
}

private const val TAG = "tink-sdk-sample"
