package com.tink.sample.extensions

fun <T> Collection<T>.toArrayList() = ArrayList(this)