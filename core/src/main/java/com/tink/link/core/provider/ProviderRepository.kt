package com.tink.link.core.provider

import com.tink.link.model.provider.Provider
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.provider.ProviderService
import javax.inject.Inject

/**
 * Repository for retrieving [Provider]s
 *
 * @constructor Create a new repository instance from a [ProviderService].
 * This is usually done inside the TinkLink framework and it should normally not be necessary to create your own instance.
 */
class ProviderRepository @Inject constructor(private val service: ProviderService) {

    /**
     * List all providers on the current market. The result will already be filtered to only contain
     * providers that are [enabled][Provider.Status.ENABLED]
     * @param handler the [ResultHandler] for processing error and success callbacks
     * @param includeDemoProviders Set this to true if the response should contain demo providers.
     * This is very useful for test and demonstration purposes, but should be set to `false`
     * in the release version of the application.
     */
    @JvmOverloads
    fun listProviders(
        handler: ResultHandler<List<Provider>>,
        includeDemoProviders: Boolean = false
    ) {
        service.listProviders(
            ResultHandler(
                { providers ->
                    handler.onSuccess(providers.filter { it.status == Provider.Status.ENABLED })
                },
                handler.onError
            ),
            includeDemoProviders
        )
    }
}