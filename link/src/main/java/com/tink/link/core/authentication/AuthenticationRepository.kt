package com.tink.link.core.authentication

import com.tink.service.authentication.AuthenticationService
import com.tink.service.authentication.UserCreationDescriptor
import com.tink.service.handler.ResultHandler
import javax.inject.Inject

internal typealias AccessToken = String

internal class AuthenticationRepository @Inject constructor(
    private val service: AuthenticationService
) {

    internal fun createAnonymousUser(
        market: String,
        locale: String,
        resultHandler: ResultHandler<AccessToken>
    ) {
        service.createAnonymousUser(UserCreationDescriptor(market, locale), resultHandler)
    }
}