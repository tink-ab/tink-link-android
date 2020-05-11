package com.tink.sample.extensions

import android.content.res.Resources
import android.util.TypedValue


fun Resources.dpToPixels(dp: Int): Int {
    return dpToPixels(dp.toFloat())
}

fun Resources.dpToPixels(dp: Float): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics).toInt()
}