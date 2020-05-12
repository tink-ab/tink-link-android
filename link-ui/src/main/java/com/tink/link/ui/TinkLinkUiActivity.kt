package com.tink.link.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.link.ui.extensions.toArrayList
import com.tink.model.user.Scope
import com.tink.model.user.User
import java.lang.IllegalArgumentException

class TinkLinkUiActivity : AppCompatActivity() {

    companion object {
        const val RESULT_SUCCESS = 101
        const val RESULT_CANCELLED = 102
        const val RESULT_FAILURE = 103

        const val ARG_STYLE = "styleResId"
        const val ARG_SCOPES = "scopes"
        const val ARG_USER = "user"
        const val ARG_MARKET = "market"
        const val ARG_LOCALE = "locale"

        fun createIntent(
            context: Context,
            styleResId: Int? = R.style.TinkLinkUiStyle,
            scopes: List<Scope> = listOf(Scope.AccountsRead), // TODO: Confirm if this should be the default
            user: User? = null,
            market: String = "",
            locale: String = ""
        ): Intent {
            if (user == null) {
                require(market.isNotBlank() && locale.isNotBlank()) {
                    throw IllegalArgumentException("Invalid market and locale parameters set for user creation")
                }
            }
            return Intent(context, TinkLinkUiActivity::class.java)
                .apply {
                    putExtras(
                        bundleOf(
                            ARG_STYLE to styleResId,
                            ARG_SCOPES to scopes.toArrayList(),
                            ARG_USER to user,
                            ARG_MARKET to market,
                            ARG_LOCALE to locale
                        )
                    )
                }
        }
    }

    internal var scopes: List<Scope>? = null
    internal var user: User? = null
    internal var market: String = ""
    internal var locale: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.extras?.getInt(ARG_STYLE)?.let { setTheme(it) } ?: setTheme(R.style.TinkLinkUiStyle)
        scopes = intent.extras?.getParcelableArrayList(ARG_SCOPES)
        user = intent.extras?.getParcelable(ARG_USER)
        market = intent.extras?.getString(ARG_MARKET) ?: ""
        locale = intent.extras?.getString(ARG_LOCALE) ?: ""
        setContentView(R.layout.tink_activity_main)

        // TODO: Confirm how and where this is done (perhaps in the activity that launches this one?)
        //Tink.init(testTinkLinkConfig, applicationContext)

        redirectIfAppropriate(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        redirectIfAppropriate(intent)
    }

    private fun redirectIfAppropriate(intent: Intent?) {
        intent?.data?.let { uri ->
            Tink.getUserContext()?.handleUri(uri)
        }
    }

    internal fun closeTinkLinkUi(resultCode: Int) {
        setResult(resultCode)
        finish()
    }
}
