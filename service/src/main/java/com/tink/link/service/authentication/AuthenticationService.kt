package com.tink.link.service.authentication

import com.tink.link.service.handler.ResultHandler

interface AuthenticationService {
    fun createAnonymousUser(arguments: UserCreationDescriptor, resultHandler: ResultHandler<String>)
}

data class UserCreationDescriptor(
    val market: String,
    val locale: String
)
