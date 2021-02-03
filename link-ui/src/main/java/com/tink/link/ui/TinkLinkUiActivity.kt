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
import com.tink.service.provider.ProviderFilter
import kotlinx.android.parcel.Parcelize

/**
 * Activity used for displaying the full Tink Link UI flow.
 *
 * Results will be passed with [setResult] and can be observed with the usual methods,
 * such as [onActivityResult]. Possible results are [RESULT_SUCCESS], [RESULT_CANCELLED],
 * and [RESULT_FAILURE].
 *
 * For a [successful result][RESULT_SUCCESS], a [TinkLinkResult] is returned as data bundled
 * with the key [RESULT_DATA].
 * For a [failure result][RESULT_FAILURE], a [TinkLinkError] is returned as data bundled with
 * the key [ERROR_DATA].
 * If there are credentials that could not be added as part of the Tink Link UI flow, a map of
 * those failed credentials ids to errors will be returned as data bundled with the key [FAILED_CREDENTIALS_DATA]
 * If a [temporary user][TemporaryUser] is used for the flow, the result data is of type [TinkLinkResult.TemporaryUser]
 * which includes the authorization code (String) and the [Credentials] connected to the user.
 * If a permanent user is used for the flow (either [LinkUser.ExistingUser] or [LinkUser.UnauthenticatedUser]),
 * the result data is of type [TinkLinkResult.PermanentUser] which includes the [Credentials] connected
 * to the user.
 *
 * @sample tinkLinkUIExample
 */
class TinkLinkUiActivity : AppCompatActivity() {

    companion object {
        const val RESULT_SUCCESS = 101
        const val RESULT_CANCELLED = 102
        const val RESULT_FAILURE = 103
        const val RESULT_DATA = "resultData"
        const val ERROR_DATA = "errorData"
        const val FAILED_CREDENTIALS_DATA = "failedCredentialsData"

        const val ARG_STYLE = "styleResId"
        const val ARG_SCOPES = "scopes"
        const val ARG_LINK_USER = "linkUser"
        const val ARG_CREDENTIALS_OPERATION = "credentialsOperation"

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
         * @param credentialsOperation The type of credentials operation to be performed.
         * The default value is [CredentialsOperation.Create]
         */
        @JvmOverloads
        fun createIntent(
            context: Context,
            linkUser: LinkUser,
            scopes: List<Scope>,
            styleResId: Int? = R.style.TinkLinkUiStyle,
            credentialsOperation: CredentialsOperation = CredentialsOperation.Create()
        ): Intent {
            return Intent(context, TinkLinkUiActivity::class.java)
                .apply {
                    val bundle = bundleOf(
                        ARG_STYLE to styleResId,
                        ARG_SCOPES to scopes.toArrayList(),
                        ARG_LINK_USER to linkUser,
                        ARG_CREDENTIALS_OPERATION to credentialsOperation
                    )
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

    private val credentialsOperation: CredentialsOperation by lazy {
        requireNotNull(intent.extras?.getParcelable<CredentialsOperation>(ARG_CREDENTIALS_OPERATION))
    }

    // TODO: Inject this with dagger once it's ready
    internal val authorizeUser: Boolean by lazy { linkUser is TemporaryUser }

    internal var authorizationCode: String? = null

    internal var credentials: Credentials? = null

    private val credentialsIdToError: MutableMap<String, TinkLinkErrorInfo> = mutableMapOf()
    internal val errorsByCredentialsId: Map<String, TinkLinkErrorInfo> = credentialsIdToError

    internal var linkError: TinkLinkError? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.extras?.getInt(ARG_STYLE)?.let { setTheme(it) } ?: setTheme(R.style.TinkLinkUiStyle)
        setContentView(R.layout.tink_activity_main)
        findNavController(R.id.nav_host_fragment).setGraph(
            R.navigation.tink_nav_graph,
            bundleOf(
                FRAGMENT_ARG_LINK_USER to linkUser,
                FRAGMENT_ARG_CREDENTIALS_OPERATION to credentialsOperation
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
        val resultIntent = when (resultCode) {
            RESULT_SUCCESS -> {
                getTinkLinkResult()
                    ?.let { Intent().apply { putExtras(bundleOf(RESULT_DATA to it)) } }
                    ?: getErrorIntent(TinkLinkError.InternalError)
            }

            RESULT_FAILURE -> { getErrorIntent(linkError ?: TinkLinkError.InternalError) }
            else -> Intent()
        }
        if (errorsByCredentialsId.isNotEmpty()) {
            val failedCredentialsDataBundle = Bundle()
            for ((id, error) in errorsByCredentialsId) {
                failedCredentialsDataBundle.putParcelable(id, error)
            }
            resultIntent.putExtra(FAILED_CREDENTIALS_DATA, failedCredentialsDataBundle)
        }
        setResult(resultCode, resultIntent)
        finish()
    }

    private fun getErrorIntent(error: TinkLinkError): Intent =
        Intent().apply { putExtras(bundleOf(ERROR_DATA to error)) }

    private fun getTinkLinkResult(): TinkLinkResult? =
        if (authorizeUser) {
            whenNonNull(authorizationCode, credentials) { authorizationCode, credentials ->
                TinkLinkResult.TemporaryUser(authorizationCode, credentials)
            }
        } else {
            credentials?.let { TinkLinkResult.PermanentUser(it) }
        }

    internal fun addCredentialsError(credentialsId: String, errorInfo: TinkLinkErrorInfo) {
        credentialsIdToError[credentialsId] = errorInfo
    }

    internal fun removeCredentialsError(credentialsId: String) {
        credentialsIdToError.remove(credentialsId)
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

/**
 * The result data that is returned from the Tink Link UI flow.
 * Possible values are [TemporaryUser] and [PermanentUser]
 */
sealed class TinkLinkResult : Parcelable {

    /**
     * The data returned when a [LinkUser.TemporaryUser] is used in the Tink Link UI flow.
     *
     * @param authorizationCode Authorization code from authorizing the user towards a new set of scopes
     * @param credentials [Credentials] connected to the user
     */
    @Parcelize
    data class TemporaryUser(
        val authorizationCode: String,
        val credentials: Credentials
    ) : TinkLinkResult()

    /**
     * The data returned when a [LinkUser.ExistingUser] or [LinkUser.UnauthenticatedUser] is used
     * in the Tink Link UI flow.
     *
     * @param credentials [Credentials] connected to the user
     */
    @Parcelize
    data class PermanentUser(val credentials: Credentials) : TinkLinkResult()
}

/**
 * Used as an argument for the [TinkLinkUiActivity] to specify if you want to select a
 * [single provider][SingleProvider] or a [list of providers][ProviderList].
 */
sealed class ProviderSelection : Parcelable {

    /**
     * Adapt the UI to launch directly into a single provider with a unique [name] identifier.
     * This will launch the create credentials view directly and skip the provider list selection.
     *
     * @throws IllegalArgumentException If [name] is empty.
     */
    @Parcelize
    data class SingleProvider(val name: String) : ProviderSelection() {
        init {
            if (name.isEmpty()) {
                throw IllegalArgumentException("The name identifier can not be empty.")
            }
        }
    }

    /**
     * Show a provider list selection in the UI. This allows you to also specify an optional [filter].
     */
    @Parcelize
    data class ProviderList(val filter: ProviderFilter = ProviderFilter()) : ProviderSelection()
}

/**
 * Used as an argument for the [TinkLinkUiActivity] to specify the type of credentials operation
 * to be performed using Tink Link UI.
 * Possible values are [Create], [Update], [Refresh] and [Authenticate].
 * Please note that you need to have permanent users enabled for [Update], [Refresh]
 * and [Authenticate] operations.
 */
sealed class CredentialsOperation : Parcelable {

    open val credentialsId: String? = null

    /**
     * Pass this to the [TinkLinkUiActivity.createIntent] function to create credentials.
     *
     * @param providerSelection Optional selection used to specify if you want to show a
     * [single provider][ProviderSelection.SingleProvider] or a [list of providers][ProviderSelection.ProviderList].
     */
    @Parcelize
    data class Create(
        val providerSelection: ProviderSelection = ProviderSelection.ProviderList()
    ) : CredentialsOperation()

    /**
     * Pass this to [TinkLinkUiActivity.createIntent] function to authenticate credentials.
     * This operation is limited to open banking credentials.
     *
     * @param credentialsId Id of the [Credentials] to be authenticated
     */
    @Parcelize
    data class Authenticate(override val credentialsId: String) : CredentialsOperation()

    /**
     * Pass this to [TinkLinkUiActivity.createIntent] function to refresh credentials.
     *
     * @param credentialsId Id of the [Credentials] to be refreshed
     * @param authenticate Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional)
     */
    @Parcelize
    data class Refresh(
        override val credentialsId: String,
        val authenticate: Boolean = false
    ) : CredentialsOperation()

    /**
     * Pass this to [TinkLinkUiActivity.createIntent] function to update credentials.
     *
     * @param credentialsId Id of the [Credentials] to be updated
     */
    @Parcelize
    data class Update(override val credentialsId: String) : CredentialsOperation()
}
