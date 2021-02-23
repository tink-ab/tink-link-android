package com.tink.link.ui.analytics.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

internal enum class AnalyticsEventTypeDto(val value: String) {
    @Json(name = "VIEW_EVENT") VIEW_EVENT("VIEW_EVENT"),
    @Json(name = "INTERACTION_EVENT") INTERACTION_EVENT("INTERACTION_EVENT"),
    @Json(name = "APPLICATION_EVENT") APPLICATION_EVENT("APPLICATION_EVENT")
}

@JsonClass(generateAdapter = true)
internal data class ViewEventDto(
    @Json(name = "appName") @field:Json(name = "appName") var appName: String? = null,
    @Json(name = "appIdentifier") @field:Json(name = "appIdentifier") var appIdentifier: String? = null,
    @Json(name = "appVersion") @field:Json(name = "appVersion") var appVersion: String? = null,
    @Json(name = "market") @field:Json(name = "market") var market: String? = null,
    @Json(name = "clientId") @field:Json(name = "clientId") var clientId: String,
    @Json(name = "sessionId") @field:Json(name = "sessionId") var sessionId: String,
    @Json(name = "isTest") @field:Json(name = "isTest") var isTest: Boolean,
    @Json(name = "product") @field:Json(name = "product") var product: ProductDto,
    @Json(name = "version") @field:Json(name = "version") var version: String,
    @Json(name = "platform") @field:Json(name = "platform") var platform: String,
    @Json(name = "device") @field:Json(name = "device") var device: String,
    @Json(name = "userId") @field:Json(name = "userId") var userId: String,
    @Json(name = "providerName") @field:Json(name = "providerName") var providerName: String? = null,
    @Json(name = "credentialsId") @field:Json(name = "credentialsId") var credentialsId: String? = null,
    @Json(name = "flow") @field:Json(name = "flow") var flow: String,
    @Json(name = "view") @field:Json(name = "view") var view: String,
    @Json(name = "timestamp") @field:Json(name = "timestamp") var timestamp: String
)

@JsonClass(generateAdapter = true)
internal data class InteractionEventDto(
    @Json(name = "appName") @field:Json(name = "appName") var appName: String? = null,
    @Json(name = "appIdentifier") @field:Json(name = "appIdentifier") var appIdentifier: String? = null,
    @Json(name = "appVersion") @field:Json(name = "appVersion") var appVersion: String? = null,
    @Json(name = "market") @field:Json(name = "market") var market: String? = null,
    @Json(name = "clientId") @field:Json(name = "clientId") var clientId: String,
    @Json(name = "sessionId") @field:Json(name = "sessionId") var sessionId: String,
    @Json(name = "userId") @field:Json(name = "userId") var userId: String,
    @Json(name = "providerName") @field:Json(name = "providerName") var providerName: String? = null,
    @Json(name = "credentialsId") @field:Json(name = "credentialsId") var credentialsId: String? = null,
    @Json(name = "label") @field:Json(name = "label") var label: String? = null,
    @Json(name = "view") @field:Json(name = "view") var view: String,
    @Json(name = "timestamp") @field:Json(name = "timestamp") var timestamp: String,
    @Json(name = "product") @field:Json(name = "product") var product: ProductDto,
    @Json(name = "action") @field:Json(name = "action") var action: String,
    @Json(name = "device") @field:Json(name = "device") var device: String
)

@JsonClass(generateAdapter = true)
internal data class ApplicationEventDto(
    @Json(name = "appName") @field:Json(name = "appName") var appName: String? = null,
    @Json(name = "appIdentifier") @field:Json(name = "appIdentifier") var appIdentifier: String? = null,
    @Json(name = "appVersion") @field:Json(name = "appVersion") var appVersion: String? = null,
    @Json(name = "market") @field:Json(name = "market") var market: String? = null,
    @Json(name = "clientId") @field:Json(name = "clientId") var clientId: String,
    @Json(name = "sessionId") @field:Json(name = "sessionId") var sessionId: String,
    @Json(name = "isTest") @field:Json(name = "isTest") var isTest: Boolean,
    @Json(name = "product") @field:Json(name = "product") var product: ProductDto,
    @Json(name = "version") @field:Json(name = "version") var version: String,
    @Json(name = "platform") @field:Json(name = "platform") var platform: String,
    @Json(name = "device") @field:Json(name = "device") var device: String,
    @Json(name = "userId") @field:Json(name = "userId") var userId: String,
    @Json(name = "providerName") @field:Json(name = "providerName") var providerName: String? = null,
    @Json(name = "credentialsId") @field:Json(name = "credentialsId") var credentialsId: String? = null,
    @Json(name = "flow") @field:Json(name = "flow") var flow: String,
    @Json(name = "type") @field:Json(name = "type") var type: String,
    @Json(name = "timestamp") @field:Json(name = "timestamp") var timestamp: String
)

internal enum class ProductDto(val value: String) {
    @Json(name = "UNDEFINED") UNDEFINED("UNDEFINED"),
    @Json(name = "AUTHORIZE") AUTHORIZE("AUTHORIZE"),
    @Json(name = "PAY") PAY("PAY"),
    @Json(name = "CREDENTIALS") CREDENTIALS("CREDENTIALS"),
    @Json(name = "ACCOUNT_CHECK") ACCOUNT_CHECK("ACCOUNT_CHECK")
}
