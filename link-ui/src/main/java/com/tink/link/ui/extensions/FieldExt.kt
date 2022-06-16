package com.tink.link.ui.extensions

import android.content.Context
import android.view.View
import android.view.inputmethod.EditorInfo
import com.tink.link.ui.credentials.ImmutableCredentialsField
import com.tink.link.ui.credentials.MutableCredentialsField
import com.tink.model.misc.Field

internal fun Field.toView(context: Context, imeOption: Int = EditorInfo.IME_ACTION_NEXT): View =
    if (isEditable()) {
        MutableCredentialsField(context).also { it.setupField(this, imeOption) }
    } else {
        ImmutableCredentialsField(context).also { it.setupField(this) }
    }

internal fun Field.isEditable(): Boolean = !attributes.inputType.isImmutable || value.isEmpty()

internal fun List<Field>.toFieldMap() = map { it.name to it.value }.toMap()
