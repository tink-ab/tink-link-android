package com.tink.link.core.authentication

import com.tink.link.coroutines.launchForResult
import com.tink.model.user.Scope
import com.tink.service.authentication.user.User
import com.tink.service.authorization.UserCreationDescriptor
import com.tink.service.authorization.UserService
import com.tink.service.handler.ResultHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import javax.inject.Inject

internal class AuthenticationRepository @Inject constructor(
    private val service: UserService
) {

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    internal fun createAnonymousUser(
        market: String,
        locale: String,
        resultHandler: ResultHandler<User>
    ) {
        scope.launchForResult(resultHandler) {
            val token = service.createAnonymousUser(UserCreationDescriptor(market, locale))
            User.fromAccessToken(token)
        }
    }

    internal fun authorize(scopes: Set<Scope>, resultHandler: ResultHandler<String>) {
        scope.launchForResult(resultHandler) {
            service.authorize(scopes)
        }
    }

    internal fun authenticate(authenticationCode: String, resultHandler: ResultHandler<User>) {
        scope.launchForResult(resultHandler) {
            val token = service.authenticate(authenticationCode)
            User.fromAccessToken(token)
        }
    }
}
