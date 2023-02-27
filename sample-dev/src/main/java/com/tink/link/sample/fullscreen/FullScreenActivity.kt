package com.tink.link.sample.fullscreen

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.transaction.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.FullScreen
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceXml
import com.tink.link.sample.R

/**
 * This class is to show how to implement Transactions as Fullscreen in XML.
 *
 * */
class FullScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Add XML view.
        setContentView(R.layout.activity_empty)

        // Initialize the SDK.
        Tink.initSdk(
            // Required for all flows.
            clientId = "",
            redirectUri = ""
        )

        // Present the SDK.
        showTransactionsWithOneTimeAccess()
    }

    // Example of one time access to Transactions presented in a fullscreen.
    // TODO: For launching other flows, please find implementation guidance in this link.
    private fun showTransactionsWithOneTimeAccess() {
        val fullScreen = FullScreen(getTinkAppearance())
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
