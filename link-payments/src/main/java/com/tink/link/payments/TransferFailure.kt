package com.tink.link.payments

class TransferFailure(val reason: Reason) : Throwable() {

    sealed class Reason(val message: String?) {
        class AuthenticationError(message: String? = null) : Reason(message)
        class TransferFailed(message: String? = null) : Reason(message)
    }
}
