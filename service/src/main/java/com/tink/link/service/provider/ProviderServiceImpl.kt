package com.tink.link.service.provider

import io.grpc.Channel
import se.tink.grpc.v1.rpc.ProviderListRequest
import se.tink.grpc.v1.rpc.ProviderSuggestRequest
import se.tink.grpc.v1.services.ProviderServiceGrpc
import com.tink.link.model.provider.Provider
import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.handler.toStreamObserver
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProviderServiceImpl @Inject constructor(
    channel: Channel
) : ProviderService {

    private val stub = ProviderServiceGrpc.newStub(channel)

    override fun listSuggestions(handler: ResultHandler<List<Provider>>) {
        stub.suggest(
            ProviderSuggestRequest.getDefaultInstance(),
            handler.toStreamObserver { value ->
                value.providersList.map { it.toProvider() }
            }
        )
    }

    override fun listProviders(
        handler: ResultHandler<List<Provider>>,
        includeDemoProviders: Boolean
    ) {
        stub.listProviders(
            ProviderListRequest
                .newBuilder()
                .setIncludeTestType(includeDemoProviders)
                .build(),
            handler.toStreamObserver { value ->
                value.providersList.map { it.toProvider() }
            }
        )
    }
}