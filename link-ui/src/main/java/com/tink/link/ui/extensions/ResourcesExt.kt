package com.tink.link.ui.extensions

import android.content.res.Resources
import android.util.TypedValue

internal fun Resources.dpToPixels(dp: Int): Int {
    return dpToPixels(dp.toFloat())
}

internal fun Resources.dpToPixels(dp: Float): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics).toInt()
}
