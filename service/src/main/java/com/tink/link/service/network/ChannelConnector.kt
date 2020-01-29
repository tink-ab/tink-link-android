package com.tink.link.service.network

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import io.grpc.ManagedChannel

class ChannelConnector(private val context: Context, channel: ManagedChannel) {

    private val networkChangeReceiver = NetworkChangeReceiver(channel)

    fun keepConnected() {
        ProcessLifecycleOwner.get().lifecycle.addObserver(networkLifecycleObserver)
    }

    private val networkLifecycleObserver = object : LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun onStart(owner: LifecycleOwner) {
            val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
            context.registerReceiver(networkChangeReceiver, filter)
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        fun onStop(owner: LifecycleOwner) =
            context.unregisterReceiver(networkChangeReceiver)

    }
}

private class NetworkChangeReceiver @JvmOverloads constructor(
    private val channel: ManagedChannel? = null
) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

        if (isConnected) {
            channel?.resetConnectBackoff()
        }
    }
}
