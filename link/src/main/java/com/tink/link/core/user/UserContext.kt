package com.tink.link.core.user

import android.net.Uri
import com.tink.core.provider.ProviderRepository
import com.tink.link.core.credentials.CredentialsRepository
import com.tink.model.user.Scope
import com.tink.service.handler.ResultHandler
import com.tink.service.network.TinkConfiguration

/**
 * Context for functionality that requires a user to be set.
 */
interface UserContext {
    val providerRepository: ProviderRepository
    val credentialsRepository: CredentialsRepository

    /**
     * Handle a third-party callback.
     *
     * Call this method when identifying a third-party callback from the registered
     * [redirectUri][TinkConfiguration.redirectUri]
     *
     * Example:
     * ```
     * private fun redirectIfAppropriate(intent: Intent?) {
     *      intent?.data?.let { uri ->
     *          Tink.getUserContext()?.handleUri(uri)
     *      }
     * }
     * ```
     */
    fun handleUri(uri: Uri, resultHandler: ResultHandler<Unit>? = null): Boolean

    /**
     * Authorize your user towards a new set of scopes.
     * These scopes needs to be enabled for your [clientId][TinkConfiguration.oAuthClientId].
     */
    fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>)
}
