package com.tink.link.core.credentials

import com.tink.link.authentication.AuthenticationTask

/**
 * The status of a Credentials.
 * Possible values are [Success], [Loading], and [AwaitingAuthentication]
 */
sealed class CredentialsStatus {

    /**
     * The credentials were successfully created.
     *
     * @param message a message containing details about the status.
     */
    data class Success(val message: String? = null) : CredentialsStatus()

    /**
     * The creation is being processed by Tink. There is currently no user action
     * required.
     *
     * @param message a message containing details about the status.
     */
    data class Loading(val message: String? = null) : CredentialsStatus()

    /**
     * There is an outstanding authentication waiting that needs to be completed by the user to
     * proceed.
     *
     * @property authenticationTask the authentication that needs to be completed by the user.
     */
    class AwaitingAuthentication(val authenticationTask: AuthenticationTask) : CredentialsStatus()
}