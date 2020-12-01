package com.tink.link.ui.analytics.network

import com.tink.link.ui.analytics.models.AnalyticsEventTypeDto
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.InteractionEventDto
import com.tink.link.ui.analytics.models.ProductDto
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ViewEventDto
import com.tink.link.ui.analytics.models.AnalyticsFlowInfo
import com.tink.link.ui.analytics.models.AppInfo
import com.tink.service.network.Environment
import okhttp3.OkHttpClient
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.security.KeyStore
import java.security.cert.CertificateFactory
import java.security.cert.X509Certificate
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManager
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.X509TrustManager

internal object AnalyticsService {

    private const val PLATFORM = "ANDROID"
    private const val DEVICE = "MOBILE"

    private val product: ProductDto = ProductDto.CREDENTIALS

    private val client =
        OkHttpClient.Builder()
            .apply {
                Environment.Production.restSSLKey?.let { sslKey ->
                    sslSocketFactory(
                        TLSHelper.getSslSocketFactory(ByteArrayInputStream(sslKey.toByteArray())),
                        TLSHelper.getFirstTrustManager(ByteArrayInputStream(sslKey.toByteArray()))
                    )
                }
            }
            .build()

    private val retrofit =
        Retrofit.Builder()
            .client(client)
            .baseUrl("https://api.tink.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    private val api = retrofit.create(AnalyticsApi::class.java)

    private var sessionId: String = ""

    private var clientId: String = ""

    private var userId: String = ""

    private var appInfo: AppInfo? = null

    private var flowInfo: AnalyticsFlowInfo? = null

    private var isInitialized: Boolean = false

    fun initialize(
        clientId: String,
        userId: String,
        appInfo: AppInfo,
        flowInfo: AnalyticsFlowInfo
    ) {
        this.clientId = clientId
        this.userId = userId
        this.appInfo = appInfo
        this.flowInfo = flowInfo
        initSession()
        isInitialized = true
    }

    private fun initSession() {
        sessionId = java.util.UUID.randomUUID().toString()
    }

    suspend fun sendScreenEvent(screenEvent: ScreenEvent) {
        if (!isInitialized) return
        api.sendViewEvent(
            ViewEventRequest(
                type = AnalyticsEventTypeDto.VIEW_EVENT,
                viewEvent = ViewEventDto(
                    appName = appInfo?.appName,
                    appIdentifier = appInfo?.appPackageName,
                    appVersion = appInfo?.appVersion,
                    clientId = clientId,
                    sessionId = sessionId,
                    isTest = flowInfo?.isTest ?: false,
                    product = product,
                    version = appInfo?.version ?: "",
                    platform = PLATFORM,
                    device = DEVICE,
                    userId = userId,
                    flow = flowInfo?.flow?.name ?: "",
                    view = screenEvent.name,
                    timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                )
            )
        )
    }

    suspend fun sendInteractionEvent(
        interactionEvent: InteractionEvent,
        screenEvent: ScreenEvent
    ) {
        if (!isInitialized) return
        api.sendInteractionEvent(
            InteractionEventRequest(
                type = AnalyticsEventTypeDto.INTERACTION_EVENT,
                interactionEvent = InteractionEventDto(
                    appName = appInfo?.appName,
                    appIdentifier = appInfo?.appPackageName,
                    appVersion = appInfo?.appVersion,
                    clientId = clientId,
                    sessionId = sessionId,
                    userId = userId,
                    label = null,
                    view = screenEvent.name,
                    timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                    product = product,
                    action = interactionEvent.name,
                    device = DEVICE
                )
            )
        )
    }
}

internal object TLSHelper {

    @Throws(Exception::class)
    private fun getTrustManagers(ca: InputStream): Array<TrustManager> {
        val ks = KeyStore.getInstance(KeyStore.getDefaultType())
        ks.load(null)
        val cf = CertificateFactory.getInstance("X.509")
        val cert = cf.generateCertificate(ca) as X509Certificate
        val principal = cert.subjectX500Principal
        ks.setCertificateEntry(principal.getName("RFC2253"), cert)
        // Set up trust manager factory to use our key store.
        val trustManagerFactory =
            TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
        trustManagerFactory.init(ks)
        return trustManagerFactory.trustManagers
    }

    @Throws(Exception::class)
    fun getSslSocketFactory(ca: InputStream?): SSLSocketFactory {
        if (ca == null) {
            return SSLSocketFactory.getDefault() as SSLSocketFactory
        }

        val context = SSLContext.getInstance("TLS")
        context.init(null, getTrustManagers(ca), null)
        return context.socketFactory
    }

    fun getFirstTrustManager(ca: InputStream): X509TrustManager {
        val trustManagers = getTrustManagers(ca)
        check(trustManagers.size == 1 && trustManagers[0] is X509TrustManager) {
            ("Unexpected default trust managers: ${trustManagers.contentToString()}")
        }
        return trustManagers[0] as X509TrustManager
    }
}
