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
import com.tink.link.ui.LinkUser.TemporaryUser
import com.tink.link.ui.codeexamples.tinkLinkUIExample
import com.tink.link.ui.extensions.toArrayList
import com.tink.model.credentials.Credentials
import com.tink.model.user.Scope
import com.tink.model.user.User
import com.tink.service.network.TinkConfiguration
import kotlinx.android.parcel.Parcelize

/**
 * Activity used for displaying the full Tink Link UI flow.
 *
 * Results will be passed with [setResult] and can be observed with the usual methods,
 * such as [onActivityResult]. Possible results are [RESULT_SUCCESS], [RESULT_CANCELLED],
 * and [RESULT_FAILURE].
 *
 * If a [temporary user][TemporaryUser] is used for the flow,
 * the [successful result][RESULT_SUCCESS] will also have an authorization code (String) bundled
 * with the key [RESULT_KEY_AUTHORIZATION_CODE].
 *
 * @sample tinkLinkUIExample
 */
class TinkLinkUiActivity : AppCompatActivity() {

    companion object {
        const val RESULT_SUCCESS = 101
        const val RESULT_CANCELLED = 102
        const val RESULT_FAILURE = 103
        const val RESULT_KEY_AUTHORIZATION_CODE = "authorizationCode"

        const val ARG_STYLE = "styleResId"
        const val ARG_SCOPES = "scopes"
        const val ARG_LINK_USER = "linkUser"

        /**
         * Creates an intent for use when starting this activity.
         *
         * This helper method makes sure that all required values are set.
         *
         * @param linkUser Information about the user to be used in the flow.
         * @param scopes Needs to be a subset of the scopes enabled for the client id set
         * in the [TinkConfiguration] that was used in [Tink.init].
         * @param styleResId Optional style for changing the appearance of the flow.
         * See our [configuration guide](https://docs.tink.com/resources/tutorials/tink-link-ui-sdk-android-tutorial#customizing-the-appearance).
         * The default value is [R.style.TinkLinkUiStyle].
         */
        @JvmOverloads
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
                    bundle.putParcelable(ARG_LINK_USER, linkUser)
                    putExtras(bundle)
                }
        }
    }

    // TODO: Inject this with dagger once it's ready
    internal val scopes: List<Scope> by lazy {
        requireNotNull(intent.extras?.getParcelableArrayList<Scope>(ARG_SCOPES))
    }

    private val linkUser: LinkUser by lazy {
        requireNotNull(intent.extras?.getParcelable<LinkUser>(ARG_LINK_USER))
    }

    // TODO: Inject this with dagger once it's ready
    internal val authorizeUser: Boolean by lazy { linkUser is TemporaryUser }

    internal var authorizationCode: String? = null

    internal var credentials: Credentials? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.extras?.getInt(ARG_STYLE)?.let { setTheme(it) } ?: setTheme(R.style.TinkLinkUiStyle)
        setContentView(R.layout.tink_activity_main)
        findNavController(R.id.nav_host_fragment).setGraph(
            R.navigation.tink_nav_graph,
            bundleOf(
                FRAGMENT_ARG_LINK_USER to linkUser
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

/**
 * Use this to let Tink Link UI know if it should use an [existing user][ExistingUser] or
 * create a [temporary user][TemporaryUser].
 */
sealed class LinkUser : Parcelable {

    /**
     * Pass this to the [TinkLinkUiActivity.createIntent] function to use an existing user for the
     * flow.
     */
    @Parcelize
    data class ExistingUser(val user: User) : LinkUser()

    /**
     * Pass this to the [TinkLinkUiActivity.createIntent] function to authenticate the permanent user
     * to be used in the flow.
     *
     * @param authorizationCode The authorization code from delegation to use for authentication
     */
    @Parcelize
    data class UnauthenticatedUser(val authorizationCode: String) : LinkUser()

    /**
     * Pass this to the [TinkLinkUiActivity.createIntent] function to create a temporary user to be
     * used in the flow. The [market] determines what providers will be available to the user,
     * and the [locale] determines which language is used on a backend level.
     *
     * We recommend that the [locale] is set to the same as is used in the user's phone so that the
     * user is not faced with a mix of languages.
     *
     * @param locale Locale for the user. Defaults to default locale for the user's market. Example: "sv_SE"
     * @param market Market specific code for the user as a ISO 3166-1 country code. Example: "SE"
     */
    @Parcelize
    data class TemporaryUser(val market: String, val locale: String) : LinkUser()
}
