@file:JvmName("TinkLink")

package com.tink.link

import com.tink.core.Tink
import com.tink.link.core.user.User
import com.tink.service.handler.ResultHandler

fun getUserContext() = Tink.getUserContext()
fun authenticateUser(authenticationCode: String, resultHandler: ResultHandler<User>) =
    Tink.authenticateUser(authenticationCode, resultHandler)

