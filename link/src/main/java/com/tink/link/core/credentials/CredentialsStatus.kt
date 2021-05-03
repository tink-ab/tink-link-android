package com.tink.link.core.credentials

import com.tink.link.authentication.AuthenticationTask
import com.tink.model.credentials.Credentials

/**
 * The status of a Credentials.
 * Possible values are [Success], [Loading], and [AwaitingAuthentication]
 */
sealed class CredentialsStatus {

    abstract val credentials: Credentials?

    /**
     * The credentials were successfully created.
     *
     * @param message a message containing details about the status.
     * @param credentials the successfully created credentials
     */
    data class Success(
        val message: String? = null,
        override val credentials: Credentials
    ) : CredentialsStatus()

    /**
     * The creation is being processed by Tink. There is currently no user action
     * required.
     *
     * @param message a message containing details about the status.
     * @param credentials the credentials being processed, if available
     */
    data class Loading(
        val message: String? = null,
        override val credentials: Credentials? = null
    ) : CredentialsStatus()

    /**
     * There is an outstanding authentication waiting that needs to be completed by the user to
     * proceed.
     *
     * @property authenticationTask the authentication that needs to be completed by the user.
     * @param credentials the credentials for which authentication is needed
     */
    class AwaitingAuthentication(
        val authenticationTask: AuthenticationTask,
        override val credentials: Credentials
    ) : CredentialsStatus()
}
