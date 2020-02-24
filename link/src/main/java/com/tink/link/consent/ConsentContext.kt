package com.tink.link.consent

import android.net.Uri
import java.util.Locale

class ConsentContext {

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
}