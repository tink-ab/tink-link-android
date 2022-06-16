package com.tink.sample

import android.app.Application
import timber.log.Timber

class TinkLinkApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(getTimberTree())
    }

    private fun getTimberTree() = if (BuildConfig.DEBUG) {
        Timber.DebugTree()
    } else {
        object : Timber.Tree() {
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                // NOOP
            }
        }
    }
}
