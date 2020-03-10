package com.tink.link.consent

import android.net.Uri
import com.tink.service.authorization.Scope
import com.tink.service.consent.ConsentService
import com.tink.service.consent.ScopeDescription
import com.tink.service.handler.ResultHandler
import java.util.Locale
import javax.inject.Inject

/**
 * Context for handling things around user consent.
 */
class ConsentContext @Inject constructor(
    private val consentService: ConsentService
) {

    /**
     * Get a link to the Terms & Conditions for Tink Link.
     *
     * Note: Not all languages are supported. The link will display the page in english if the requested language is not available.
     *
     * @param locale The locale with the language to use.
     * @return A [Uri] to the Terms & Conditions
     */
    fun termsAndConditions(locale: Locale = Locale.getDefault()): Uri {
        return Uri.parse("https://link.tink.com/terms-and-conditions/${locale.language}")
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
        return Uri.parse("https://link.tink.com/privacy-policy/${locale.language}")
    }

    /**
     * Lists [scope descriptions][ScopeDescription] for the provided scopes.
     *
     * @param scopes A [Scope] set of OAuth scopes to be requested.
     * @param resultHandler Handler for successful (providing a list of [ScopeDescription]) or error events.
     */
    fun scopeDescriptions(
        scopes: Set<Scope>,
        resultHandler: ResultHandler<List<ScopeDescription>>
    ) {
        consentService.scopeDescriptions(scopes, resultHandler)
    }
}