package com.tink.link.ui.analytics

import com.tink.link.ui.CredentialsOperation
import com.tink.link.ui.analytics.models.AppInfo
import com.tink.link.ui.analytics.models.InteractionEvent
import com.tink.link.ui.analytics.models.ScreenEvent
import com.tink.link.ui.analytics.models.toFlowInfo
import com.tink.link.ui.analytics.network.AnalyticsService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

internal object TinkLinkTracker {

    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    fun initialize(
        clientId: String,
        userId: String,
        market: String,
        appInfo: AppInfo,
        operation: CredentialsOperation
    ) {
        AnalyticsService.initialize(clientId, userId, market, appInfo, operation.toFlowInfo())
    }

    fun trackScreen(screenEvent: ScreenEvent) {
        scope.launch {
            AnalyticsService.sendScreenEvent(screenEvent)
        }
    }

    fun trackInteraction(interactionEvent: InteractionEvent, screenEvent: ScreenEvent) {
        scope.launch {
            AnalyticsService.sendInteractionEvent(interactionEvent, screenEvent)
        }
    }
}
