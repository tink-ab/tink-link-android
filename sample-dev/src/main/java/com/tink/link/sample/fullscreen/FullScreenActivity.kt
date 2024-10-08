package com.tink.link.sample.fullscreen

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tink.link.core.base.Tink
import com.tink.link.core.data.request.configuration.BaseDomain
import com.tink.link.core.data.request.configuration.Configuration
import com.tink.link.core.data.request.transactions.ConnectAccountsForOneTimeAccess
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

    // Example of one time access to Transactions presented in a fullscreen.
    // For launching other flows, please find implementation guidance in this link: https://github.com/tink-ab/tink-link-android/blob/master/sample-app/src/main/java/com/tink/link/app/navToFlows/FlowCases.kt
    private fun showTransactionsWithOneTimeAccess() {
        // Add basic required parameters.
        val configuration = Configuration(
            clientId = "",
            redirectUri = "",
            baseDomain = BaseDomain.EU
        )

        // Get Fullscreen UI.
        val fullScreen = FullScreen(getTinkAppearance())

        // More parameters can be added to ConnectAccountsForOneTimeAccess().
        val oneTimeAccess = ConnectAccountsForOneTimeAccess("SE")

        // Call this method to trigger the flow.
        Tink.Transactions.connectAccountsForOneTimeAccess(
            this,
            configuration,
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

    // Color, icons and title can be customized for both Light/Dark mode by changing the values on TinkAppearanceXml.ThemeAttributes as below:
    private fun getTinkAppearance(): TinkAppearance {
        return TinkAppearanceXml(
            light = TinkAppearanceXml.ThemeAttributes(
                windowBackgroundColorId = R.color.white
            ),
            dark = TinkAppearanceXml.ThemeAttributes(
                windowBackgroundColorId = R.color.white
            )
        )
    }
}

private const val TAG = "tink-sdk-sample"
