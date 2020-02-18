package com.tink.link

import com.tink.link.core.user.User
import com.tink.link.core.user.UserContext
import com.tink.service.handler.ResultHandler

/**
 * Starting point for using Tink Link in your application.
 * Call [TinkLink.create] to obtain an instance, then use [setUser] to add authorization capabilities to that instance.
 * After that you can get further access to specific repositories with the context fetched from [getUserContext].
 */
interface TinkLink {

    /**
     * Fetches the [UserContext] for this TinkLink instance if a user is set.
     *
     * If no user is set, this will return `null`
     */
    fun getUserContext(): UserContext?

    /**
     * Set the user to the TinkLink instance. This enables you to fetch the [UserContext] with
     * [getUserContext].
     */
    fun setUser(user: User)

//    /**
//     * Create a temporary user.
//     * This allows you to launch the flow and fetch data for users without having permanent Tink users.
//     *
//     * On a successful result, your resultHandler should call [setUser] to set this user to the TinkLink instance.
//     */
//    private fun createTemporaryUser(market: String, locale: String, resultHandler: ResultHandler<User>) {
//        authenticationRepository.createAnonymousUser(
//            market,
//            locale,
//            ResultHandler(
//                { accessToken -> resultHandler.onSuccess(User(accessToken)) },
//                resultHandler.onError
//            )
//        )
//    }

    /**
     * Authenticate an existing user with an authentication code.
     *
     * On a successful result, your resultHandler should call [setUser] to set this user to the TinkLink instance.
     */
    fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>)
}

