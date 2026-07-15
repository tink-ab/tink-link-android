package com.tink.link.sample

import android.util.Log

/**
 * Sample-module logger that gates sensitive messages behind DEBUG builds.
 *
 * Use [Logger.d] instead of [Log.d] for any value that may be sensitive
 * (OAuth authorization codes, credentials IDs, redirect URIs, consent IDs)
 * so the DEBUG gate is enforced in one place.
 * Never replace calls to this with direct [Log.d] calls in production integrations.
 */
internal object Logger {

    fun d(tag: String, msg: String) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg)
        }
    }
}
