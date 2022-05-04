---
title: TemporaryUser
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]LinkUser](../index.html)/[TemporaryUser](index.html)



# TemporaryUser



[androidJvm]\
data class [TemporaryUser](index.html)(val market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](../index.html)

Pass this to the [TinkLinkUiActivity.createIntent](../../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to create a temporary user to be used in the flow. The [market](market.html) determines what providers will be available to the user, and the [locale](locale.html) determines which language is used on a backend level.



We recommend that the [locale](locale.html) is set to the same as is used in the user's phone so that the user is not faced with a mix of languages.



## Parameters


androidJvm

| | |
|---|---|
| locale | Locale for the user. Defaults to default locale for the user's market. Example: &quot;sv_SE&quot; |
| market | Market specific code for the user as a ISO 3166-1 country code. Example: &quot;SE&quot; |



## Constructors


| | |
|---|---|
| [TemporaryUser](-temporary-user.html) | [androidJvm]<br>fun [TemporaryUser](-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [locale](locale.html) | [androidJvm]<br>val [locale](locale.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [market](market.html) | [androidJvm]<br>val [market](market.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

