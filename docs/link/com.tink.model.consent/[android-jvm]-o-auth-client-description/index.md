---
title: [androidJvm]OAuthClientDescription
---
//[link](../../../index.html)/[com.tink.model.consent](../index.html)/[[androidJvm]OAuthClientDescription](index.html)



# OAuthClientDescription



[androidJvm]\
data class [OAuthClientDescription](index.html)(val clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), val scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[android-jvm]-scope-description/index.html)&gt;) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

A description of the OAuth client and the data it will collect from the user.



## Parameters


androidJvm

| | |
|---|---|
| clientName | : The name of the application specified by the client when creating it in the console. |
| clientUrl | : A url specified by the client for additional information. Can be empty. |
| clientIconUrl | : A url for a client icon. Can be empty. |
| scopeDescriptions | : A list of [ScopeDescription](../[android-jvm]-scope-description/index.html)s describing which financial info is going to be collected. |
| verified | : Indicates whether the app is verified or not. If it is unverified, the user should be cautious when sharing financial data. |
| aggregator | : Describes whether the client is aggregating data under their own or under Tink's license. |



## Constructors


| | |
|---|---|
| [OAuthClientDescription](-o-auth-client-description.html) | [androidJvm]<br>fun [OAuthClientDescription](-o-auth-client-description.html)(clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[android-jvm]-scope-description/index.html)&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [aggregator](aggregator.html) | [androidJvm]<br>val [aggregator](aggregator.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [clientIconUrl](client-icon-url.html) | [androidJvm]<br>val [clientIconUrl](client-icon-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientName](client-name.html) | [androidJvm]<br>val [clientName](client-name.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientUrl](client-url.html) | [androidJvm]<br>val [clientUrl](client-url.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [scopeDescriptions](scope-descriptions.html) | [androidJvm]<br>val [scopeDescriptions](scope-descriptions.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ScopeDescription](../[android-jvm]-scope-description/index.html)&gt; |
| [verified](verified.html) | [androidJvm]<br>val [verified](verified.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

