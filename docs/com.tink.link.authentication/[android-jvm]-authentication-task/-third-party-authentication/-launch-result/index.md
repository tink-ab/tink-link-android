---
title: LaunchResult -
---
//[link](../../../../index.md)/[com.tink.link.authentication](../../../index.md)/[[androidJvm]AuthenticationTask](../../index.md)/[ThirdPartyAuthentication](../index.md)/[LaunchResult](index.md)



# LaunchResult  
 [androidJvm] sealed class [LaunchResult](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Indicates if the user was successfully redirected when [launch](../launch.md) was called.



Possible values are [Success](-success/index.md) and [Error](-error/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>[Error](-error/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>sealed class [Error](-error/index.md) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](index.md)  <br>More info  <br>There was an error when launching the third party app.  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Success///PointingToDeclaration/"></a>[Success](-success/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Success///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Success](-success/index.md) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](index.md)  <br>More info  <br>The user has successfully been redirected to the third party app.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Success///PointingToDeclaration/"></a>AuthenticationTask.ThirdPartyAuthentication.LaunchResult
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>AuthenticationTask.ThirdPartyAuthentication.LaunchResult

