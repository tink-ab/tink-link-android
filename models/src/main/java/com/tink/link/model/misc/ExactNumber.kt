package com.tink.link.model.misc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class ExactNumber(
    val unscaledValue: Long,
    val scale: Long
) : Comparable<ExactNumber>, Parcelable {

    fun toBigDecimal() = BigDecimal(unscaledValue.toBigInteger(), scale.toInt())

    override fun compareTo(other: ExactNumber): Int = toBigDecimal().compareTo(other.toBigDecimal())
}