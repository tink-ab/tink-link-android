package com.tink.link

import com.tink.core.Tink
import com.tink.link.core.user.UserContext
import com.tink.service.authentication.user.User
import com.tink.service.handler.ResultHandler


/**
 * This is for Java compatibility only. Use extensions on `Tink` when using Kotlin
 */
@kotlin.SinceKotlin(version = "999999999.0.0")
object TinkLink {

    @JvmStatic
    fun getUserContext() = Tink.getUserContext()

    @JvmStatic
    fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
        Tink.authenticateUser(authenticationCode, resultHandler)

    @JvmStatic
    fun setUser(user: User) = Tink.setUser(user)
}

// For Kotlin

@JvmSynthetic
fun Tink.getUserContext(): UserContext? = TinkLinkComponent.instance.getUserContext()

@JvmSynthetic
fun Tink.authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    TinkLinkComponent.instance.authenticateUser(authenticationCode, resultHandler)

