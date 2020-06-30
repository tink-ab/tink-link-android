package com.tink.link.ui

import androidx.lifecycle.MutableLiveData

class AutoFetchLiveData<T>(private val fetch: (AutoFetchLiveData<T>) -> Unit) : MutableLiveData<T>() {
    override fun onActive() = update()

    // Can be called manually to force update
    fun update() = fetch(this)
}
