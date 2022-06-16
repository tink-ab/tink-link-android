---
title: [androidJvm]LinkUser
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[androidJvm]LinkUser](index.html)



# LinkUser



[androidJvm]\
sealed class [LinkUser](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Use this to let Tink Link UI know if it should use an [existing user](-existing-user/index.html) or create a [temporary user](-temporary-user/index.html).



## Types


| Name | Summary |
|---|---|
| [ExistingUser](-existing-user/index.html) | [androidJvm]<br>data class [ExistingUser](-existing-user/index.html)(val user: [User](../../com.tink.model.user/[android-jvm]-user/index.html)) : [LinkUser](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to use an existing user for the flow. |
| [TemporaryUser](-temporary-user/index.html) | [androidJvm]<br>data class [TemporaryUser](-temporary-user/index.html)(val market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to create a temporary user to be used in the flow. The [market](-temporary-user/market.html) determines what providers will be available to the user, and the [locale](-temporary-user/locale.html) determines which language is used on a backend level. |
| [UnauthenticatedUser](-unauthenticated-user/index.html) | [androidJvm]<br>data class [UnauthenticatedUser](-unauthenticated-user/index.html)(val authorizationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate the permanent user to be used in the flow. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| ExistingUser |
| UnauthenticatedUser |
| TemporaryUser |

