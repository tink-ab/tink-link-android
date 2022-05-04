---
title: [androidJvm]CredentialsOperation
---
//[link](../../../index.html)/[com.tink.link.ui](../index.html)/[[androidJvm]CredentialsOperation](index.html)



# CredentialsOperation



[androidJvm]\
sealed class [CredentialsOperation](index.html) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Used as an argument for the [TinkLinkUiActivity](../[android-jvm]-tink-link-ui-activity/index.html) to specify the type of credentials operation to be performed using Tink Link UI. Possible values are [Create](-create/index.html), [Update](-update/index.html), [Refresh](-refresh/index.html) and [Authenticate](-authenticate/index.html). Please note that you need to have permanent users enabled for [Update](-update/index.html), [Refresh](-refresh/index.html) and [Authenticate](-authenticate/index.html) operations.



## Types


| Name | Summary |
|---|---|
| [Authenticate](-authenticate/index.html) | [androidJvm]<br>data class [Authenticate](-authenticate/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](index.html)<br>Pass this to [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to authenticate credentials. This operation is limited to open banking credentials. |
| [Create](-create/index.html) | [androidJvm]<br>data class [Create](-create/index.html)(val providerSelection: [ProviderSelection](../[android-jvm]-provider-selection/index.html) = ProviderSelection.ProviderList()) : [CredentialsOperation](index.html)<br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to create credentials. |
| [Refresh](-refresh/index.html) | [androidJvm]<br>data class [Refresh](-refresh/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false) : [CredentialsOperation](index.html)<br>Pass this to [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to refresh credentials. |
| [Update](-update/index.html) | [androidJvm]<br>data class [Update](-update/index.html)(val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [CredentialsOperation](index.html)<br>Pass this to [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.html) function to update credentials. |


## Functions


| Name | Summary |
|---|---|
| [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1578325224%2FFunctions%2F-812656150)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150) | [androidJvm]<br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.html#-1754457655%2FFunctions%2F-812656150)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |


## Properties


| Name | Summary |
|---|---|
| [credentialsId](credentials-id.html) | [androidJvm]<br>open val [credentialsId](credentials-id.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |


## Inheritors


| Name |
|---|
| Create |
| Authenticate |
| Refresh |
| Update |

