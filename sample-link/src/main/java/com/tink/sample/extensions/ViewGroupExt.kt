package com.tink.sample.extensions

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layoutId: Int, attachToRoot: Boolean = false) =
    LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)