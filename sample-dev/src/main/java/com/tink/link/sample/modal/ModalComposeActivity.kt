package com.tink.link.sample.modal

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.configuration.BaseDomain
import com.tink.link.core.data.request.configuration.Configuration
import com.tink.link.core.data.request.transactions.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.Modal
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceCompose

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
            redirectUri = "",
            baseDomain = BaseDomain.EU
        )

        // Get Modal UI.
        val modal = Modal(getTinkTheme())

        // More parameters can be added to ConnectAccountsForOneTimeAccess().
        val oneTimeAccess = ConnectAccountsForOneTimeAccess("SE")

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
                windowBackgroundColor = Color.White
            ),
            dark = TinkAppearanceCompose.ThemeAttributes(
                windowBackgroundColor = Color.Black
            )
        )
    }
}

private const val TAG = "tink-sdk-sample"
