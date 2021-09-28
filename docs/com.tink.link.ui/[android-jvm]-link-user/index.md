---
title: [androidJvm]LinkUser -
---
//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[androidJvm]LinkUser](index.md)



# LinkUser  
 [androidJvm] sealed class [LinkUser](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Use this to let Tink Link UI know if it should use an [existing user](-existing-user/index.md) or create a [temporary user](-temporary-user/index.md).

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/LinkUser.ExistingUser///PointingToDeclaration/"></a>[ExistingUser](-existing-user/index.md)| <a name="com.tink.link.ui/LinkUser.ExistingUser///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ExistingUser](-existing-user/index.md)(**user**: [User](../../com.tink.model.user/[android-jvm]-user/index.md)) : [LinkUser](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.md) function to use an existing user for the flow.  <br><br><br>
| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>[TemporaryUser](-temporary-user/index.md)| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [TemporaryUser](-temporary-user/index.md)(**market**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **locale**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.md) function to create a temporary user to be used in the flow.  <br><br><br>
| <a name="com.tink.link.ui/LinkUser.UnauthenticatedUser///PointingToDeclaration/"></a>[UnauthenticatedUser](-unauthenticated-user/index.md)| <a name="com.tink.link.ui/LinkUser.UnauthenticatedUser///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [UnauthenticatedUser](-unauthenticated-user/index.md)(**authorizationCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [LinkUser](index.md)  <br>More info  <br>Pass this to the [TinkLinkUiActivity.createIntent](../[android-jvm]-tink-link-ui-activity/-companion/create-intent.md) function to authenticate the permanent user to be used in the flow.  <br><br><br>


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
| <a name="com.tink.link.ui/LinkUser.ExistingUser///PointingToDeclaration/"></a>LinkUser
| <a name="com.tink.link.ui/LinkUser.UnauthenticatedUser///PointingToDeclaration/"></a>LinkUser
| <a name="com.tink.link.ui/LinkUser.TemporaryUser///PointingToDeclaration/"></a>LinkUser

