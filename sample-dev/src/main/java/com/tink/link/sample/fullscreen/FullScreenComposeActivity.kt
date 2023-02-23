package com.tink.link.sample.fullscreen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.transaction.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.FullScreen

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
        // More parameters, such as market = Market.SE can be added to ConnectAccountsForOneTimeAccess().
        val oneTimeAccess = ConnectAccountsForOneTimeAccess()

        // Call this method to trigger the flow.
        Tink.Transactions.connectAccountsForOneTimeAccess(
            this,
            oneTimeAccess,
            FullScreen,
            { success: TinkTransactionsSuccess ->
                Log.d(TAG, "credentials_id = ${success.credentialsId}")
                Log.d(TAG, "code = ${success.code}")
            },
            { error: TinkError ->
                Log.d(TAG, "error message = ${error.errorDescription}")
            }
        )
    }
}

private const val TAG = "tink-sdk-sample"
