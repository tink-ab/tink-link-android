package com.tink.link.consent

import android.net.Uri
import com.tink.link.coroutines.launchForResult
import com.tink.model.consent.OAuthClientDescription
import com.tink.model.user.Scope
import com.tink.service.consent.ConsentService
import com.tink.service.handler.ResultHandler
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import java.util.Locale
import javax.inject.Inject

private const val TERMS_CONDITIONS_URL = "https://link.tink.com/terms-and-conditions"
private const val PRIVACY_POLICY_URL = "https://link.tink.com/privacy-policy"
private const val LOCALE_PARAMETER = "locale"
private const val CHROMELESS_PARAMETER = "chromeless"

/**
 * Context for handling things around user consent.
 */
class ConsentContext(
    private val consentService: ConsentService,
    dispatcher: CoroutineDispatcher
) {

    @Inject
    constructor(consentService: ConsentService) : this(consentService, Dispatchers.IO)

    private val scope = CoroutineScope(dispatcher + SupervisorJob())

    /**
     * Get a link to the Terms & Conditions for Tink Link.
     *
     * Note: Not all languages are supported. The link will display the page in english if the requested language is not available.
     *
     * @param locale The locale with the language to use.
     * @return A [Uri] to the Terms & Conditions
     */
    fun termsAndConditions(locale: Locale = Locale.getDefault(), showChromeless: Boolean = true): Uri =
        Uri.parse(TERMS_CONDITIONS_URL)
            .buildUpon()
            .appendPath(locale.language)
            .appendQueryParameter(LOCALE_PARAMETER, locale.toString())
            .appendQueryParameter(CHROMELESS_PARAMETER, showChromeless.toString())
            .build()

    /**
     * Get a link to the Privacy Policy for Tink Link.
     *
     * Note: Not all languages are supported. The link will display the page in english if the requested language is not available.
     *
     * @param locale The locale with the language to use.
     * @return A [Uri] to the Privacy Policy
     */
    fun privacyPolicy(locale: Locale = Locale.getDefault(), showChromeless: Boolean = true): Uri =
        Uri.parse(PRIVACY_POLICY_URL)
            .buildUpon()
            .appendPath(locale.language)
            .appendQueryParameter(LOCALE_PARAMETER, locale.toString())
            .appendQueryParameter(CHROMELESS_PARAMETER, showChromeless.toString())
            .build()

    /**
     * Get the [client description][OAuthClientDescription] for a client with the provided scopes.
     *
     * @param scopes A [Scope] set of OAuth scopes authorized for this client
     * @param resultHandler Handler for successful (providing the [client description][OAuthClientDescription]) or error events.
     */
    fun describeClient(
        scopes: Set<Scope>,
        resultHandler: ResultHandler<OAuthClientDescription>
    ) {
        scope.launchForResult(resultHandler) {
            consentService.describeClient(scopes)
        }
    }
}
