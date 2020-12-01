package com.tink.link.ui.analytics.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.tink.link.ui.analytics.models.AnalyticsEventTypeDto
import com.tink.link.ui.analytics.models.InteractionEventDto
import com.tink.link.ui.analytics.models.ViewEventDto
import retrofit2.Response
import retrofit2.http.POST

internal interface AnalyticsApi {

    @POST("/link/v1/analytics")
    suspend fun sendViewEvent(
        @retrofit2.http.Body body: ViewEventRequest
    ): Response<Unit>

    @POST("/link/v1/analytics")
    suspend fun sendInteractionEvent(
        @retrofit2.http.Body body: InteractionEventRequest
    ): Response<Unit>
}

@JsonClass(generateAdapter = true)
internal data class ViewEventRequest(
    @Json(name = "type") @field:Json(name = "type") var type: AnalyticsEventTypeDto? = null,
    @Json(name = "viewEvent") @field:Json(name = "viewEvent") var viewEvent: ViewEventDto? = null
)

@JsonClass(generateAdapter = true)
internal data class InteractionEventRequest(
    @Json(name = "type") @field:Json(name = "type") var type: AnalyticsEventTypeDto? = null,
    @Json(name = "interactionEvent") @field:Json(name = "interactionEvent") var interactionEvent: InteractionEventDto? = null
)

