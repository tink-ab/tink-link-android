package com.tink.link

import com.tink.core.Tink
import com.tink.link.core.user.UserContext
import com.tink.service.authentication.user.User
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
     * Authenticate an existing user with an authentication code.
     *
     * On a successful result, your resultHandler should call [Tink.setUser] to set this user to Tink.
     */
    @JvmStatic
    fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
        Tink.authenticateUser(authenticationCode, resultHandler)

    @JvmStatic
    fun getConsentContext() = Tink.getConsentContext()
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
 * Authenticate an existing user with an authentication code.
 *
 * On a successful result, your resultHandler should call [Tink.setUser] to set this user to Tink.
 */
@JvmSynthetic
fun Tink.authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    TinkLinkComponent.instance.authenticateUser(authenticationCode, resultHandler)

@JvmSynthetic
fun Tink.getConsentContext() = TinkLinkComponent.instance.consentContext