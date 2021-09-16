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
    fun termsAndConditions(locale: Locale = Locale.getDefault()): Uri {
        return Uri.parse("https://link.tink.com/terms-and-conditions/${locale.language}?locale=$locale")
    }

    /**
     * Get a link to the Privacy Policy for Tink Link.
     *
     * Note: Not all languages are supported. The link will display the page in english if the requested language is not available.
     *
     * @param locale The locale with the language to use.
     * @return A [Uri] to the Privacy Policy
     */
    fun privacyPolicy(locale: Locale = Locale.getDefault()): Uri {
        return Uri.parse("https://link.tink.com/privacy-policy/${locale.language}?locale=$locale")
    }

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
