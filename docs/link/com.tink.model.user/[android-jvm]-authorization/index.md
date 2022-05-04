---
title: [androidJvm]Authorization
---
//[link](../../../index.html)/[com.tink.model.user](../index.html)/[[androidJvm]Authorization](index.html)



# Authorization



[androidJvm]\
sealed class [Authorization](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Types


| Name | Summary |
|---|---|
| [AccessToken](-access-token/index.html) | [androidJvm]<br>data class [AccessToken](-access-token/index.html)(val accessToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Authorization](index.html) |
| [SessionId](-session-id/index.html) | [androidJvm]<br>data class [SessionId](-session-id/index.html)(val sessionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Authorization](index.html) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| AccessToken |
| SessionId |

