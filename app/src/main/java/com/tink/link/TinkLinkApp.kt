package com.tink.link

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

class TinkLinkApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Fresco.initialize(this)
        AndroidThreeTen.init(this)
        Timber.plant(getTimberTree())
    }

    private fun getTimberTree() = if(BuildConfig.DEBUG) {
        Timber.DebugTree()
    } else {
        object : Timber.Tree() {
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                //NOOP
            }
        }
    }
}