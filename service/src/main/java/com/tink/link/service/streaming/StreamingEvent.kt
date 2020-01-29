package com.tink.link.service.streaming

import com.tink.link.model.account.Account
import com.tink.link.model.credential.Credential
import com.tink.link.model.provider.Provider

sealed class StreamingEvent {

    abstract val type: Type

    enum class Type {
        CREATE,
        READ,
        UPDATE,
        DELETE,
        UNKNOWN
    }

    data class ProviderEvent(
        val providers: List<Provider>,
        override val type: Type
    ) : StreamingEvent()

    data class AccountEvent(
        val accounts: List<Account>,
        override val type: Type
    ) : StreamingEvent()

    data class CredentialEvent(
        val credentials: List<Credential>,
        override val type: Type
    ) : StreamingEvent()
}