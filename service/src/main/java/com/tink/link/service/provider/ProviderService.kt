package com.tink.link.service.provider

import com.tink.link.model.provider.Provider
import com.tink.link.service.handler.ResultHandler

interface ProviderService {

    fun listSuggestions(handler: ResultHandler<List<Provider>>)

    fun listProviders(handler: ResultHandler<List<Provider>>, includeDemoProviders: Boolean)
}
