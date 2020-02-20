@file:JvmName("TinkLink")

package com.tink.link

import com.tink.core.Tink
import com.tink.link.core.user.User
import com.tink.link.core.user.UserContext
import com.tink.service.handler.ResultHandler


// For Java

fun getUserContext() = Tink.getUserContext()

fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    Tink.authenticateUser(authenticationCode, resultHandler)

// For Kotlin

@JvmSynthetic
fun Tink.getUserContext(): UserContext? = TinkLinkComponent.instance.getUserContext()

@JvmSynthetic
fun Tink.authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    TinkLinkComponent.instance.authenticateUser(authenticationCode, resultHandler)

