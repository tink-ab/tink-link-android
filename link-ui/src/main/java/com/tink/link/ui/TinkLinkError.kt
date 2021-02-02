package com.tink.link.ui

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Represents errors that happen during the Tink Link UI flow.
 */
sealed class TinkLinkError : Parcelable {

    /**
     * Tink Link UI is unable to fetch providers.
     */
    @Parcelize
    object UnableToFetchProviders : TinkLinkError()

    /**
     * Tink Link UI is unable to fetch the provider with the specified [providerName].
     */
    @Parcelize
    data class ProviderNotFound(val providerName: String) : TinkLinkError()

    /**
     * Tink Link UI is unable to fetch the credentials with the specified [credentialsId].
     */
    @Parcelize
    data class CredentialsNotFound(val credentialsId: String) : TinkLinkError()

    /**
     * Tink Link UI failed to add one or more credentials.
     *
     * @param errorsByCredentialsId A map of failed credentials ids to [errors][Throwable]
     */
    @Parcelize
    data class FailedToAddCredentials(val errorsByCredentialsId: Map<String, Throwable>) :
        TinkLinkError()

    /**
     * An internal error occurred in the Tink Link UI flow.
     */
    @Parcelize
    object InternalError : TinkLinkError()
}
