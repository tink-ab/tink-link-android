package com.tink.link.service.authentication

import com.tink.link.service.handler.ResultHandler
import com.tink.link.service.handler.toStreamObserver
import io.grpc.Channel
import se.tink.grpc.v1.rpc.CreateAnonymousRequest
import se.tink.grpc.v1.services.UserServiceGrpc
import javax.inject.Inject

internal class AuthenticationServiceImpl @Inject constructor(
    channel: Channel
) : AuthenticationService {
    private val userStub = UserServiceGrpc.newStub(channel)

    override fun createAnonymousUser(
        arguments: UserCreationDescriptor,
        resultHandler: ResultHandler<String>
    ) {
        CreateAnonymousRequest
            .newBuilder()
            .setMarket(arguments.market)
            .setLocale(arguments.locale)
            .build()
            .also { request ->
                userStub.createAnonymous(
                    request,
                    ResultHandler(
                        resultHandler.onSuccess,
                        resultHandler.onError
                    ).toStreamObserver { it.accessToken }
                )
            }
    }
}
