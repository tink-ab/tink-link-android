---
title: com.tink.model.user
---
//[link](../../index.html)/[com.tink.model.user](index.html)



# Package com.tink.model.user



## Types


| Name | Summary |
|---|---|
| Authorization | [common, androidJvm]<br>[common]<br>sealed class [Authorization]([common]-authorization/index.html)<br>[androidJvm]<br>sealed class [Authorization]([android-jvm]-authorization/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| Scope | [common, androidJvm]<br>[common]<br>sealed class [Scope]([common]-scope/index.html)<br>[androidJvm]<br>sealed class [Scope]([android-jvm]-scope/index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| User | [common, androidJvm]<br>[common]<br>data class [User]([common]-user/index.html)(val authorization: [Authorization]([common]-authorization/index.html))<br>[androidJvm]<br>data class [User]([android-jvm]-user/index.html)(val authorization: [Authorization]([android-jvm]-authorization/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| UserInfo | [common, androidJvm]<br>[common]<br>data class [UserInfo]([common]-user-info/index.html)(val created: &lt;ERROR CLASS&gt; = Instant.EPOCH, val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val profile: [UserProfile]([common]-user-profile/index.html), val flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = emptyList(), val username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val nationalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>[androidJvm]<br>data class [UserInfo]([android-jvm]-user-info/index.html)(val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html) = Instant.EPOCH, val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val profile: [UserProfile]([android-jvm]-user-profile/index.html), val flags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt; = emptyList(), val username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val nationalId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |
| UserProfile | [common, androidJvm]<br>[common]<br>data class [UserProfile]([common]-user-profile/index.html)(val locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val timeZone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val currency: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val periodMode: [UserProfile.PeriodMode]([common]-user-profile/-period-mode/index.html))<br>[androidJvm]<br>data class [UserProfile]([android-jvm]-user-profile/index.html)(val locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val timeZone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val currency: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val periodMode: [UserProfile.PeriodMode]([android-jvm]-user-profile/-period-mode/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |

