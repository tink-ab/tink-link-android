package com.tink.link.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Images(
    val icon: String,
    val banner: String
) : Parcelable
