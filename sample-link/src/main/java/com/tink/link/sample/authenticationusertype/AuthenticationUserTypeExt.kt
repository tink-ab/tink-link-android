package com.tink.link.sample.authenticationusertype

import com.tink.model.provider.Provider

internal fun Provider.AuthenticationUserType.getDescription() =
    when (this) {
        Provider.AuthenticationUserType.PERSONAL -> "Personal"
        Provider.AuthenticationUserType.BUSINESS -> "Business"
        Provider.AuthenticationUserType.CORPORATE -> "Corporate"
        Provider.AuthenticationUserType.UNKNOWN -> "Unknown"
    }
