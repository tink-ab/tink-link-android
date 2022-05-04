---
title: [androidJvm]TinkLinkResult
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[androidJvm]TinkLinkResult](index.html)



# TinkLinkResult



[androidJvm]\
sealed class [TinkLinkResult](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

The result data that is returned from the Tink Link UI flow. Possible values are [TemporaryUser](-temporary-user/index.html) and [PermanentUser](-permanent-user/index.html)



## Types


| Name | Summary |
|---|---|
| [PermanentUser](-permanent-user/index.html) | [androidJvm]<br>data class [PermanentUser](-permanent-user/index.html)(val credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [TinkLinkResult](index.html)<br>The data returned when a [LinkUser.ExistingUser](../[android-jvm]-link-user/-existing-user/index.html) or [LinkUser.UnauthenticatedUser](../[android-jvm]-link-user/-unauthenticated-user/index.html) is used in the Tink Link UI flow. |
| [TemporaryUser](-temporary-user/index.html) | [androidJvm]<br>data class [TemporaryUser](-temporary-user/index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.html)) : [TinkLinkResult](index.html)<br>The data returned when a [LinkUser.TemporaryUser](../[android-jvm]-link-user/-temporary-user/index.html) is used in the Tink Link UI flow. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| TemporaryUser |
| PermanentUser |

