---
title: createIntent
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[common]TinkLinkUiActivity](../index.html)/[Companion](index.html)/[createIntent](create-intent.html)



# createIntent



[common]\
fun [createIntent](create-intent.html)(context: &lt;ERROR CLASS&gt;, linkUser: [LinkUser](../../[common]-link-user/index.html), scopes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;&lt;ERROR CLASS&gt;&gt;, styleResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = R.style.TinkLinkUiStyle, credentialsOperation: [CredentialsOperation](../../[common]-credentials-operation/index.html) = CredentialsOperation.Create()): &lt;ERROR CLASS&gt;



Creates an intent for use when starting this activity.



This helper method makes sure that all required values are set.



## Parameters


common

| | |
|---|---|
| linkUser | Information about the user to be used in the flow. |
| scopes | Needs to be a subset of the scopes enabled for the client id set in the TinkConfiguration that was used in Tink.init. |
| styleResId | Optional style for changing the appearance of the flow. See our [configuration guide](https://docs.tink.com/resources/tutorials/tink-link-ui-sdk-android-tutorial#customizing-the-appearance). The default value is R.style.TinkLinkUiStyle. |
| credentialsOperation | The type of credentials operation to be performed. The default value is [CredentialsOperation.Create](../../[common]-credentials-operation/-create/index.html) |




