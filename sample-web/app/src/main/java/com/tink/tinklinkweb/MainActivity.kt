package com.tink.tinklinkweb

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.tink.tinklinkweb.ui.theme.TinkLinkWebTheme

/// Domain:
/// EU: link.tink.com
/// US: link.visa.com
const val linkDomain: String = "link.visa.com"

/// Your credentials.
const val yourClientID: String = "yourClientID"
const val yourPaymentRequestID: String = "yourPaymentRequestID"
const val yourRedirectURI: String = "example://callback"
const val yourAppURI: String = "example://open"

val examplePaymentsUrl: String =
    """
    https://
        $linkDomain
        /1.0/pay/direct
        ?client_id=$yourClientID
        &market=SE
        &locale=en_US
        &payment_request_id=$yourPaymentRequestID
        &redirect_uri=$yourRedirectURI
        &app_uri=$yourAppURI
        &auto_redirect_mobile=true
    """
        .replace("\\s".toRegex(), "")

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        TinkLinkWebTheme {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                val context = LocalContext.current
                Button(
                    onClick = {
                        val intent = Intent(context, TinkLinkActivity::class.java)
                        intent.putExtra(TinkLinkActivity.EXTRA_LINK_URL, examplePaymentsUrl)
                        context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6200EA),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .padding(16.dp)
                        .background(Color.Transparent)
                ) {
                    Text(
                        text = "Open Link",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
