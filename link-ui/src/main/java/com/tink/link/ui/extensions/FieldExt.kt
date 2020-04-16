package com.tink.link.ui.extensions

import android.content.Context
import android.view.View
import com.tink.link.ui.credentials.CredentialField
import com.tink.link.ui.credentials.ImmutableCredentialField
import com.tink.link.ui.credentials.MutableCredentialField
import com.tink.model.misc.Field

internal fun Field.toView(context: Context): View {
    val credentialField: CredentialField =
        if (isEditable()) {
            MutableCredentialField(context)
        } else {
            ImmutableCredentialField(context)
        }
    return credentialField
        .let {
            it.setupField(this@toView)
            it.getView()
        }
}

internal fun Field.isEditable(): Boolean = !attributes.inputType.isImmutable || value.isEmpty()