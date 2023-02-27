package com.tink.link.sample.stack

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.tink.link.sample.R
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.transaction.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.Stack
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceXml
import com.tink.link.core.widgets.stack.StackContainer

/**
 * This class is to show how to implement Transactions as Stack in XML.
 *
 * */
class StackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Add XML view.
        setContentView(R.layout.activity_stack)

        // Initialize the SDK.
        Tink.initSdk(
            // Required for all flows.
            clientId = "",
            redirectUri = ""
        )

        findViewById<ComposeView>(R.id.composeView).apply {
            // Dispose the Composition when viewLifecycleOwner is destroyed.
            setViewCompositionStrategy(
                ViewCompositionStrategy.DisposeOnLifecycleDestroyed(this@StackActivity)
            )
            setContent {
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
