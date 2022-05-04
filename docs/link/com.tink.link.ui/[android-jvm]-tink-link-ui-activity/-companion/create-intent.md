---
title: createIntent
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]TinkLinkUiActivity](../index.html)/[Companion](index.html)/[createIntent](create-intent.html)



# createIntent



[androidJvm]\




@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)



fun [createIntent](create-intent.html)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), linkUser: [LinkUser](../../[android-jvm]-link-user/index.html), scopes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;Scope&gt;, styleResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = R.style.TinkLinkUiStyle, credentialsOperation: [CredentialsOperation](../../[android-jvm]-credentials-operation/index.html) = CredentialsOperation.Create()): [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)



Creates an intent for use when starting this activity.



This helper method makes sure that all required values are set.



## Parameters


androidJvm

| | |
|---|---|
| linkUser | Information about the user to be used in the flow. |
| scopes | Needs to be a subset of the scopes enabled for the client id set in the TinkConfiguration that was used in Tink.init. |
| styleResId | Optional style for changing the appearance of the flow. See our [configuration guide](https://docs.tink.com/resources/tutorials/tink-link-ui-sdk-android-tutorial#customizing-the-appearance). The default value is R.style.TinkLinkUiStyle. |
| credentialsOperation | The type of credentials operation to be performed. The default value is [CredentialsOperation.Create](../../[android-jvm]-credentials-operation/-create/index.html) |




