---
title: Refresh
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]CredentialsOperation](../index.html)/[Refresh](index.html)



# Refresh



[androidJvm]\
data class [Refresh](index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) : [CredentialsOperation](../index.html)

Pass this to [TinkLinkUiActivity.createIntent](../../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to refresh credentials.



## Parameters


androidJvm

| | |
|---|---|
| credentialsId | Id of the Credentials to be refreshed |
| authenticate | Force an authentication before the refresh, designed for open banking credentials. Defaults to false. (optional) |



## Constructors


| | |
|---|---|
| [Refresh](-refresh.html) | [androidJvm]<br>fun [Refresh](-refresh.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [androidJvm]<br>val [authenticate](authenticate.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false |
| [credentialsId](credentials-id.html) | [androidJvm]<br>open override val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

