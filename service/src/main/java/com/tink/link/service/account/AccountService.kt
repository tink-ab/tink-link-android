package com.tink.link.service.account

import com.tink.link.model.account.Account
import com.tink.link.service.handler.ResultHandler

interface AccountService {

    fun update(descriptor: UpdateAccountDescriptor, handler: ResultHandler<Account>)
}
