package com.tink.tinklinkweb

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class TinkLinkActivity: ComponentActivity() {

    companion object {
        const val EXTRA_LINK_URL = "com.tink.tinklinkweb.LinkUrl"
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        handleIntent(intent)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        handleIntent(intent)

        val linkUrl = Uri.parse(requireNotNull(intent.getStringExtra(EXTRA_LINK_URL)) { "Intent extra is required" })

        setContent {
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { context ->
                    WebView(context).apply {

                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )

                        settings.javaScriptEnabled = true
                        settings.domStorageEnabled = true

                        webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                                val uri = Uri.parse(url)
                                if (uri.host == linkUrl.host) {
                                    return false
                                } else {
                                    val intent = Intent(Intent.ACTION_VIEW, uri)
                                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                    view!!.context.startActivity(intent)
                                    return true
                                }
                            }
                        }

                        loadUrl(linkUrl.toString())
                    }
                }
            )
        }
    }

    private fun handleIntent(intent: Intent) {
        intent.data?.let { uri ->
            if (uri.host == "callback") {
                // Use `paymentRequestId` to retrieve information about your payment or transfer
                uri.queryParameterNames.forEach {
                    val value = uri.getQueryParameter(it)
                    Log.d(this::class.simpleName, "$it = $value")
                }
            }
        }
    }
}
