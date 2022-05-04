---
title: [androidJvm]UserInfo
---
//[link](../../../index.html)/[com.tink.model.user](../index.html)/[[androidJvm]UserInfo](index.html)



# UserInfo



[androidJvm]\
data class [UserInfo](index.html)(val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val profile: [UserProfile](../[android-jvm]-user-profile/index.html), val flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = emptyList(), val username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val nationalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)



## Constructors


| | |
|---|---|
| [UserInfo](-user-info.html) | [androidJvm]<br>fun [UserInfo](-user-info.html)(created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), profile: [UserProfile](../[android-jvm]-user-profile/index.html), flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = emptyList(), username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, nationalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [appId](app-id.html) | [androidJvm]<br>val [appId](app-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [created](created.html) | [androidJvm]<br>val [created](created.html): [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) |
| [flags](flags.html) | [androidJvm]<br>val [flags](flags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; |
| [id](id.html) | [androidJvm]<br>val [id](id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nationalId](national-id.html) | [androidJvm]<br>val [nationalId](national-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [profile](profile.html) | [androidJvm]<br>val [profile](profile.html): [UserProfile](../[android-jvm]-user-profile/index.html) |
| [username](username.html) | [androidJvm]<br>val [username](username.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |

