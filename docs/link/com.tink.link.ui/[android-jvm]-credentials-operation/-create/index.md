---
title: Create
---
//[link](../../../../index.html)/[com.tink.link.ui](../../index.html)/[[androidJvm]CredentialsOperation](../index.html)/[Create](index.html)



# Create



[androidJvm]\
data class [Create](index.html)(val providerSelection: [ProviderSelection](../../[android-jvm]-provider-selection/index.html) = ProviderSelection.ProviderList()) : [CredentialsOperation](../index.html)

Pass this to the [TinkLinkUiActivity.createIntent](../../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to create credentials.



## Parameters


androidJvm

| | |
|---|---|
| providerSelection | Optional selection used to specify if you want to show a [single provider](../../[android-jvm]-provider-selection/-single-provider/index.html) or a [list of providers](../../[android-jvm]-provider-selection/-provider-list/index.html). |



## Constructors


| | |
|---|---|
| [Create](-create.html) | [androidJvm]<br>fun [Create](-create.html)(providerSelection: [ProviderSelection](../../[android-jvm]-provider-selection/index.html) = ProviderSelection.ProviderList()) |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../../com.tink.link.authentication/[android-jvm]-authentication-task/-third-party-authentication/-launch-result/-error/-app-needs-upgrade/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentialsId](../credentials-id.html) | [androidJvm]<br>open val [credentialsId](../credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [providerSelection](provider-selection.html) | [androidJvm]<br>val [providerSelection](provider-selection.html): [ProviderSelection](../../[android-jvm]-provider-selection/index.html) |

