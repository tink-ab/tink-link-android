package com.tink.link.ui.extensions

import android.content.Context
import android.view.View
import com.tink.link.ui.credentials.CredentialsField
import com.tink.link.ui.credentials.ImmutableCredentialsField
import com.tink.link.ui.credentials.MutableCredentialsField
import com.tink.model.misc.Field

internal fun Field.toView(context: Context): View {
    val credentialsField: CredentialsField =
        if (isEditable()) {
            MutableCredentialsField(context)
        } else {
            ImmutableCredentialsField(context)
        }
    return credentialsField
        .let {
            it.setupField(this@toView)
            it.getView()
        }
}

internal fun Field.isEditable(): Boolean = !attributes.inputType.isImmutable || value.isEmpty()