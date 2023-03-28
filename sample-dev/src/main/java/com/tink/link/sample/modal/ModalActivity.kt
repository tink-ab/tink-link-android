package com.tink.link.sample.modal

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.transactions.ConnectAccountsForOneTimeAccess
import com.tink.link.core.data.response.error.TinkError
import com.tink.link.core.data.response.success.transactions.TinkTransactionsSuccess
import com.tink.link.core.navigator.Modal
import com.tink.link.core.themes.TinkAppearance
import com.tink.link.core.themes.TinkAppearanceXml
import com.tink.link.sample.R
import com.tink.link.core.data.request.common.Market
import com.tink.link.core.data.request.configuration.Configuration

/**
 * This class is to show how to implement Transactions as Modal in XML.
 *
 * */
class ModalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Add XML view.
        setContentView(R.layout.activity_empty)

        // Restore SDK state if possible
        savedInstanceState?.let {
            Tink.restoreState(it)
        }

        // Present the SDK.
        showTransactionsWithOneTimeAccess()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // Save SDK state to bundle
        Tink.saveState(outState)
    }

    // Example of one time access to Transactions presented in a modal.
    // TODO: For launching other flows, please find implementation guidance in this link.
    private fun showTransactionsWithOneTimeAccess() {
        val configuration = Configuration(
            clientId = "",
            redirectUri = "")
        val modal = Modal(getTinkAppearance())
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
