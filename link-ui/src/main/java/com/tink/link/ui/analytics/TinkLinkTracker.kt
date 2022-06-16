package com.tink.link.ui.analytics

import com.tink.link.ui.CredentialsOperation
import com.tink.link.ui.analytics.models.AppInfo
import com.tink.link.ui.analytics.models.ApplicationEvent
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.ScreenEventData
import com.tink.link.ui.analytics.models.toFlowInfo
import com.tink.link.ui.analytics.network.AnalyticsService
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

internal object TinkLinkTracker {

    // TODO: use dependency injection
    private val scope = CoroutineScope(
        Dispatchers.IO + SupervisorJob() +
            CoroutineExceptionHandler { _, _ ->
                // TODO: log only in debug mode (use Timber)
            }
    )

    fun initialize(
        clientId: String,
        userId: String,
        market: String,
        appInfo: AppInfo,
        operation: CredentialsOperation
    ) {
        AnalyticsService.initialize(clientId, userId, market, appInfo, operation.toFlowInfo())
    }

    fun trackScreen(screenEvent: ScreenEvent, screenEventData: ScreenEventData? = null) {
        scope.launch {
            AnalyticsService.sendScreenEvent(screenEvent, screenEventData)
        }
    }

    fun trackInteraction(
        interactionEvent: InteractionEvent,
        screenEvent: ScreenEvent,
        screenEventData: ScreenEventData? = null
    ) {
        scope.launch {
            AnalyticsService.sendInteractionEvent(interactionEvent, screenEvent, screenEventData)
        }
    }

    fun trackApplicationEvent(
        applicationEvent: ApplicationEvent,
        screenEventData: ScreenEventData? = null
    ) {
        scope.launch {
            AnalyticsService.sendApplicationEvent(applicationEvent, screenEventData)
        }
    }
}
