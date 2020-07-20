package com.tink.link.ui.extensions

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes

@JvmOverloads
fun Context.getColorFromAttr(
    @AttrRes attrColor: Int,
    typedValue: TypedValue = TypedValue(),
    resolveRefs: Boolean = true
): Int {
    theme.resolveAttribute(attrColor, typedValue, resolveRefs)
    return typedValue.data
}
