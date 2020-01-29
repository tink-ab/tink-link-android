package com.tink.link.service.account

import com.tink.link.model.account.Account
import com.tink.link.model.misc.ExactNumber

data class UpdateAccountDescriptor(
    val id: String,
    val excluded: Boolean,
    val favored: Boolean,
    val name: String,
    val ownership: ExactNumber,
    val type: Account.Type
)