---
title: [androidJvm]AuthenticationTask -
---
//[link](../../index.md)/[com.tink.link.authentication](../index.md)/[[androidJvm]AuthenticationTask](index.md)



# AuthenticationTask  
 [androidJvm] sealed class [AuthenticationTask](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Represents an authentication that needs to be completed by the user.



The possible values are [SupplementalInformation](-supplemental-information/index.md) and [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.SupplementalInformation///PointingToDeclaration/"></a>[SupplementalInformation](-supplemental-information/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.SupplementalInformation///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [SupplementalInformation](-supplemental-information/index.md)(**credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [AuthenticationTask](index.md)  <br>More info  <br>Indicates that there is additional information required from the user to proceed.  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication///PointingToDeclaration/"></a>[ThirdPartyAuthentication](-third-party-authentication/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ThirdPartyAuthentication](-third-party-authentication/index.md)(**credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [AuthenticationTask](index.md)  <br>More info  <br>Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask/isNewerThan/#com.tink.link.authentication.AuthenticationTask/PointingToDeclaration/"></a>[isNewerThan](is-newer-than.md)| <a name="com.tink.link.authentication/AuthenticationTask/isNewerThan/#com.tink.link.authentication.AuthenticationTask/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNewerThan](is-newer-than.md)(other: [AuthenticationTask](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Helper function comparing two [AuthenticationTask](index.md)s to see if one is newer than that the other.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.authentication/AuthenticationTask.SupplementalInformation///PointingToDeclaration/"></a>AuthenticationTask
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication///PointingToDeclaration/"></a>AuthenticationTask

