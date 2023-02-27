package com.tink.link.sample.stack

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
import com.tink.link.core.data.request.transaction.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.Stack
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceXml
import com.tink.link.core.widgets.stack.StackContainer
import com.tink.link.sample.R

/**
 * This class is to show how to implement Transactions as Stack in Compose.
 *
 * */
class StackComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the SDK.
        Tink.initSdk(
            // Required for all flows.
            clientId = "",
            redirectUri = ""
        )

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

    // Example of one time access to Transactions presented in a stack.
    // TODO: For launching other flows, please find implementation guidance in this link.
    @Composable
    private fun ShowTransactionsWithOneTimeAccess() {
        val stack = Stack(tinkAppearance = getTinkAppearance(), onDismiss = {
            finish() // Pop backstack or finish activity (Depends upon implementation).
        })

        StackContainer(stack) {
            // More parameters, such as market = Market.SE can be added to ConnectAccountsForOneTimeAccess().
            val oneTimeAccess = ConnectAccountsForOneTimeAccess()

            // Call this method to trigger the flow.
            Tink.Transactions.connectAccountsForOneTimeAccess(
                this,
                oneTimeAccess,
                stack,
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

    private fun getTinkAppearance(): TinkAppearance {
        return TinkAppearanceXml(
            light = TinkAppearanceXml.ThemeAttributes(
                toolbarColorId = R.color.white,
                windowBackgroundColorId = R.color.white,
                iconBackId = R.drawable.ic_back,
                iconBackTint = R.color.black,
                iconBackDescriptionId = R.string.app_name,
                iconCloseId = R.drawable.ic_cross,
                iconCloseTint = R.color.black,
                iconCloseDescriptionId = R.string.app_name,
                toolbarTitleObj = TinkAppearanceXml.ToolbarTitle()
            ),
            dark = TinkAppearanceXml.ThemeAttributes(
                toolbarColorId = R.color.black,
                windowBackgroundColorId = R.color.white,
                iconBackId = R.drawable.ic_back,
                iconBackTint = R.color.white,
                iconBackDescriptionId = R.string.app_name,
                iconCloseId = R.drawable.ic_cross,
                iconCloseTint = R.color.white,
                iconCloseDescriptionId = R.string.app_name,
                toolbarTitleObj = TinkAppearanceXml.ToolbarTitle()
            )
        )
    }

}

private const val TAG = "tink-sdk-sample"
