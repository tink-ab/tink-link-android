---
title: [androidJvm]ProviderSelection
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[androidJvm]ProviderSelection](index.html)



# ProviderSelection



[androidJvm]\
sealed class [ProviderSelection](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Used as an argument for the [TinkLinkUiActivity](../[android-jvm]-tink-link-ui-activity/index.html) to specify if you want to select a [single provider](-single-provider/index.html) or a [list of providers](-provider-list/index.html).



## Types


| Name | Summary |
|---|---|
| [ProviderList](-provider-list/index.html) | [androidJvm]<br>data class [ProviderList](-provider-list/index.html)(val filter: ProviderFilter = ProviderFilter()) : [ProviderSelection](index.html)<br>Show a provider list selection in the UI. This allows you to also specify an optional [filter](-provider-list/filter.html). |
| [SingleProvider](-single-provider/index.html) | [androidJvm]<br>data class [SingleProvider](-single-provider/index.html)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [ProviderSelection](index.html)<br>Adapt the UI to launch directly into a single provider with a unique [name](-single-provider/name.html) identifier. This will launch the create credentials view directly and skip the provider list selection. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Inheritors


| Name |
|---|
| SingleProvider |
| ProviderList |

