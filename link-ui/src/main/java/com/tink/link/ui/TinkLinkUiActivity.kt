package com.tink.link.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.tink.core.Tink
import com.tink.link.getUserContext
import com.tink.link.ui.extensions.toArrayList
import com.tink.model.user.Scope
import com.tink.model.user.User
import kotlinx.android.parcel.Parcelize

class TinkLinkUiActivity : AppCompatActivity() {

    companion object {
        const val RESULT_SUCCESS = 101
        const val RESULT_CANCELLED = 102
        const val RESULT_FAILURE = 103
        const val RESULT_KEY_AUTHORIZATION_CODE = "authorizationCode"

        const val ARG_STYLE = "styleResId"
        const val ARG_SCOPES = "scopes"
        const val ARG_USER = "user"
        const val ARG_MARKET = "market"
        const val ARG_LOCALE = "locale"

        fun createIntent(
            context: Context,
            linkUser: LinkUser,
            scopes: List<Scope>,
            styleResId: Int? = R.style.TinkLinkUiStyle
        ): Intent {
            return Intent(context, TinkLinkUiActivity::class.java)
                .apply {
                    val bundle = bundleOf(
                        ARG_STYLE to styleResId,
                        ARG_SCOPES to scopes.toArrayList()
                    )

                    if (linkUser is LinkUser.ExistingUser) {
                        bundle.putParcelable(ARG_USER, linkUser.user)
                    } else if (linkUser is LinkUser.TemporaryUser) {
                        bundle.putString(ARG_MARKET, linkUser.market)
                        bundle.putString(ARG_LOCALE, linkUser.locale)
                    }

                    putExtras(bundle)
                }
        }
    }

    // TODO: Inject this with dagger once it's ready
    internal val scopes: List<Scope> by lazy {
        requireNotNull(intent.extras?.getParcelableArrayList<Scope>(ARG_SCOPES))
    }

    private val user: User? by lazy {
        intent.extras?.getParcelable<User>(ARG_USER)
    }

    private val market: String by lazy {
        intent.extras?.getString(ARG_MARKET) ?: ""
    }

    private val locale: String by lazy {
        intent.extras?.getString(ARG_LOCALE) ?: ""
    }

    // TODO: Inject this with dagger once it's ready
    internal val authorizeUser: Boolean by lazy { user == null }

    internal var authorizationCode: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.extras?.getInt(ARG_STYLE)?.let { setTheme(it) } ?: setTheme(R.style.TinkLinkUiStyle)
        setContentView(R.layout.tink_activity_main)
        findNavController(R.id.nav_host_fragment).setGraph(
            R.navigation.tink_nav_graph,
            bundleOf(
                FRAGMENT_ARG_USER to user,
                FRAGMENT_ARG_MARKET to market,
                FRAGMENT_ARG_LOCALE to locale
            )
        )

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
        if (resultCode == RESULT_SUCCESS && authorizeUser) {
            val successIntent =
                Intent().apply {
                    putExtras(bundleOf(RESULT_KEY_AUTHORIZATION_CODE to authorizationCode))
                }
            setResult(resultCode, successIntent)
        } else {
            setResult(resultCode)
        }
        finish()
    }
}

sealed class LinkUser : Parcelable {

    @Parcelize
    data class ExistingUser(val user: User) : LinkUser()

    @Parcelize
    data class TemporaryUser(val market: String, val locale: String) : LinkUser()
}
