---
title: Update
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]CredentialsOperation](../index.html)/[Update](index.html)



# Update



[androidJvm]\
data class [Update](index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](../index.html)

Pass this to [TinkLinkUiActivity.createIntent](../../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to update credentials.



## Parameters


androidJvm

| | |
|---|---|
| credentialsId | Id of the [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.html) to be updated |



## Constructors


| | |
|---|---|
| [Update](-update.html) | [androidJvm]<br>fun [Update](-update.html)(credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentialsId](credentials-id.html) | [androidJvm]<br>open override val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

