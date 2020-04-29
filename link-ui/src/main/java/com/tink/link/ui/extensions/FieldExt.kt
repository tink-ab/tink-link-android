package com.tink.link.ui.extensions

import android.content.Context
import android.view.View
import com.tink.link.ui.credentials.ImmutableCredentialsField
import com.tink.link.ui.credentials.MutableCredentialsField
import com.tink.model.misc.Field

internal fun Field.toView(context: Context): View =
    if (isEditable()) {
        MutableCredentialsField(context).also { it.setupField(this) }
    } else {
        ImmutableCredentialsField(context).also { it.setupField(this) }
    }

internal fun Field.isEditable(): Boolean = !attributes.inputType.isImmutable || value.isEmpty()

internal fun List<Field>.toFieldMap() = map { it.name to it.value }.toMap()