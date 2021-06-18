---
title: [androidJvm]ProviderSelection -
---
//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[androidJvm]ProviderSelection](index.md)



# ProviderSelection  
 [androidJvm] sealed class [ProviderSelection](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Used as an argument for the [TinkLinkUiActivity](../[android-jvm]-tink-link-ui-activity/index.md) to specify if you want to select a [single provider](-single-provider/index.md) or a [list of providers](-provider-list/index.md).

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/ProviderSelection.ProviderList///PointingToDeclaration/"></a>[ProviderList](-provider-list/index.md)| <a name="com.tink.link.ui/ProviderSelection.ProviderList///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ProviderList](-provider-list/index.md)(**filter**: [ProviderFilter](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md)) : [ProviderSelection](index.md)  <br>More info  <br>Show a provider list selection in the UI.  <br><br><br>
| <a name="com.tink.link.ui/ProviderSelection.SingleProvider///PointingToDeclaration/"></a>[SingleProvider](-single-provider/index.md)| <a name="com.tink.link.ui/ProviderSelection.SingleProvider///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [SingleProvider](-single-provider/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [ProviderSelection](index.md)  <br>More info  <br>Adapt the UI to launch directly into a single provider with a unique [name](-single-provider/name.md) identifier.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.ui/ProviderSelection.SingleProvider///PointingToDeclaration/"></a>ProviderSelection
| <a name="com.tink.link.ui/ProviderSelection.ProviderList///PointingToDeclaration/"></a>ProviderSelection

