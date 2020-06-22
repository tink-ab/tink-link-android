package com.tink.link

import com.tink.core.Tink
import com.tink.link.core.user.UserContext
import com.tink.model.user.User
import com.tink.service.handler.ResultHandler

/**
 * This is for Java compatibility only. Use extensions on [Tink] when using Kotlin
 */
@kotlin.SinceKotlin(version = "999999999.0.0")
object TinkLink {

    /**
     * Fetches the [UserContext] from Tink if a user is set.
     *
     * If no user is set, this will return `null`
     */
    @JvmStatic
    fun getUserContext() = Tink.getUserContext()

    /**
     * Fetches the [UserContext] from Tink if a user is set.
     *
     * If no user is set, this will throw an [IllegalStateException]
     */
    @JvmStatic
    fun requireUserContext() = Tink.requireUserContext()

    /**
     * Authenticate an existing user with an authentication code.
     *
     * On a successful result, your resultHandler should call [Tink.setUser] to set this user to Tink.
     */
    @JvmStatic
    fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
        Tink.authenticateUser(authenticationCode, resultHandler)

    @JvmStatic
    fun getConsentContext() = Tink.getConsentContext()

    /**
     * Create a temporary user.
     * This allows you to launch the flow and fetch data for users without having permanent Tink users.
     *
     * On a successful result, your resultHandler should call [Tink.setUser] to set this user to the Tink instance.
     */
    fun createTemporaryUser(market: String, locale: String, resultHandler: ResultHandler<User>) =
        Tink.createTemporaryUser(market, locale, resultHandler)
}

// For Kotlin

/**
 * Fetches the [UserContext] from Tink if a user is set.
 *
 * If no user is set, this will return `null`
 */
@JvmSynthetic
fun Tink.getUserContext(): UserContext? = TinkLinkComponent.instance.getUserContext()

/**
 * Fetches the [UserContext] from Tink if a user is set.
 *
 * If no user is set, this will throw an [IllegalStateException]
 */
@JvmSynthetic
fun Tink.requireUserContext(): UserContext = TinkLinkComponent.instance.requireUserContext()

/**
 * Authenticate an existing user with an authentication code.
 *
 * On a successful result, your resultHandler should call [Tink.setUser] to set this user to Tink.
 */
@JvmSynthetic
fun Tink.authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    TinkLinkComponent.instance.authenticateUser(authenticationCode, resultHandler)

@JvmSynthetic
fun Tink.getConsentContext() = TinkLinkComponent.instance.consentContext

/**
 * Create a temporary user.
 * This allows you to launch the flow and fetch data for users without having permanent Tink users.
 *
 * On a successful result, your resultHandler should call [Tink.setUser] to set this user to the Tink instance.
 */
@JvmSynthetic
fun Tink.createTemporaryUser(market: String, locale: String, resultHandler: ResultHandler<User>) =
    TinkLinkComponent.instance.createTemporaryUser(market, locale, resultHandler)
