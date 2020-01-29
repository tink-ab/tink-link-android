package com.tink.link.model.misc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Amount(
    val value: ExactNumber,
    val currencyCode: String
) : Parcelable