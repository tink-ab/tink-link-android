package com.tink.link.ui.analytics.network

import com.tink.link.ui.analytics.models.AnalyticsEventTypeDto
import com.tink.link.ui.analytics.models.AnalyticsFlowInfo
import com.tink.link.ui.analytics.models.AppInfo
import com.tink.link.ui.analytics.models.ApplicationEvent
import com.tink.link.ui.analytics.models.ApplicationEventDto
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.InteractionEventDto
import com.tink.link.ui.analytics.models.ProductDto
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ScreenEventData
import com.tink.link.ui.analytics.models.ViewEventDto
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

internal object AnalyticsService {

    private const val PLATFORM = "ANDROID"
    private const val DEVICE = "MOBILE"

    private val product: ProductDto = ProductDto.CREDENTIALS

    private val client = OkHttpClient()

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

    private var market: String = ""

    private var appInfo: AppInfo? = null

    private var flowInfo: AnalyticsFlowInfo? = null

    private var isInitialized: Boolean = false

    fun initialize(
        clientId: String,
        userId: String,
        market: String,
        appInfo: AppInfo,
        flowInfo: AnalyticsFlowInfo
    ) {
        this.clientId = clientId
        this.userId = userId
        this.market = market
        this.appInfo = appInfo
        this.flowInfo = flowInfo
        initSession()
        isInitialized = true
    }

    private fun initSession() {
        sessionId = java.util.UUID.randomUUID().toString()
    }

    suspend fun sendScreenEvent(screenEvent: ScreenEvent, screenEventData: ScreenEventData?) {
        if (!isInitialized) return
        api.sendViewEvent(
            ViewEventRequest(
                type = AnalyticsEventTypeDto.VIEW_EVENT,
                viewEvent = ViewEventDto(
                    appName = appInfo?.appName,
                    appIdentifier = appInfo?.appPackageName,
                    appVersion = appInfo?.appVersion,
                    market = market,
                    clientId = clientId,
                    sessionId = sessionId,
                    isTest = flowInfo?.isTest ?: false,
                    product = product,
                    version = appInfo?.version ?: "",
                    platform = PLATFORM,
                    device = DEVICE,
                    userId = userId,
                    providerName = screenEventData?.providerName ?: "",
                    credentialsId = screenEventData?.credentialsId ?: "",
                    flow = flowInfo?.flow?.name ?: "",
                    view = screenEvent.name,
                    timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                )
            )
        )
    }

    suspend fun sendInteractionEvent(
        interactionEvent: InteractionEvent,
        screenEvent: ScreenEvent,
        screenEventData: ScreenEventData?
    ) {
        if (!isInitialized) return
        api.sendInteractionEvent(
            InteractionEventRequest(
                type = AnalyticsEventTypeDto.INTERACTION_EVENT,
                interactionEvent = InteractionEventDto(
                    appName = appInfo?.appName,
                    appIdentifier = appInfo?.appPackageName,
                    appVersion = appInfo?.appVersion,
                    market = market,
                    clientId = clientId,
                    sessionId = sessionId,
                    userId = userId,
                    providerName = screenEventData?.providerName ?: "",
                    credentialsId = screenEventData?.credentialsId ?: "",
                    label = null,
                    view = screenEvent.name,
                    timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                    product = product,
                    action = "${screenEvent.name}/${interactionEvent.name}",
                    device = DEVICE
                )
            )
        )
    }

    suspend fun sendApplicationEvent(
        applicationEvent: ApplicationEvent,
        screenEventData: ScreenEventData?
    ) {
        if (!isInitialized) return
        api.sendApplicationEvent(
            ApplicationEventRequest(
                type = AnalyticsEventTypeDto.APPLICATION_EVENT,
                applicationEvent = ApplicationEventDto(
                    appName = appInfo?.appName,
                    appIdentifier = appInfo?.appPackageName,
                    appVersion = appInfo?.appVersion,
                    market = market,
                    clientId = clientId,
                    sessionId = sessionId,
                    isTest = flowInfo?.isTest ?: false,
                    product = product,
                    version = appInfo?.version ?: "",
                    platform = PLATFORM,
                    device = DEVICE,
                    userId = userId,
                    providerName = screenEventData?.providerName ?: "",
                    credentialsId = screenEventData?.credentialsId ?: "",
                    flow = flowInfo?.flow?.name ?: "",
                    type = applicationEvent.name,
                    timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                )
            )
        )
    }
}
