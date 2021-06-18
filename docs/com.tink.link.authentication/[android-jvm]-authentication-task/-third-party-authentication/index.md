//[link](../../../index.md)/[com.tink.link.authentication](../../index.md)/[[androidJvm]AuthenticationTask](../index.md)/[ThirdPartyAuthentication](index.md)



# ThirdPartyAuthentication  
 [androidJvm] data class [ThirdPartyAuthentication](index.md)(**credentials**: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [AuthenticationTask](../index.md)

Indicates that there is an authentication in a third party app or in the browser necessary to proceed with the authentication. The user can be sent to redirected by calling [launch](launch.md), or you can provide a custom redirection logic with the use of the data in [thirdPartyAppAuthentication](third-party-app-authentication.md)

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/ThirdPartyAuthentication/#com.tink.model.credentials.Credentials/PointingToDeclaration/"></a>[ThirdPartyAuthentication](-third-party-authentication.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/ThirdPartyAuthentication/#com.tink.model.credentials.Credentials/PointingToDeclaration/"></a> [androidJvm] fun [ThirdPartyAuthentication](-third-party-authentication.md)(credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.md))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult///PointingToDeclaration/"></a>[LaunchResult](-launch-result/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>sealed class [LaunchResult](-launch-result/index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br>More info  <br>Indicates if the user was successfully redirected when [launch](launch.md) was called.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/copy/#com.tink.model.credentials.Credentials/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/copy/#com.tink.model.credentials.Credentials/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(credentials: [Credentials](../../../com.tink.model.credentials/[android-jvm]-credentials/index.md)): [AuthenticationTask.ThirdPartyAuthentication](index.md)  <br><br><br>
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask/isNewerThan/#com.tink.link.authentication.AuthenticationTask/PointingToDeclaration/"></a>[isNewerThan](../is-newer-than.md)| <a name="com.tink.link.authentication/AuthenticationTask/isNewerThan/#com.tink.link.authentication.AuthenticationTask/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [isNewerThan](../is-newer-than.md)(other: [AuthenticationTask](../index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Helper function comparing two [AuthenticationTask](../index.md)s to see if one is newer than that the other.  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/launch/#android.app.Activity/PointingToDeclaration/"></a>[launch](launch.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/launch/#android.app.Activity/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [launch](launch.md)(activity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)): [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](-launch-result/index.md)  <br>More info  <br>Try to redirect the user to the third party app for authentication.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/thirdPartyAppAuthentication/#/PointingToDeclaration/"></a>[thirdPartyAppAuthentication](third-party-app-authentication.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication/thirdPartyAppAuthentication/#/PointingToDeclaration/"></a> [androidJvm] val [thirdPartyAppAuthentication](third-party-app-authentication.md): [ThirdPartyAppAuthentication](../../../com.tink.model.authentication/[android-jvm]-third-party-app-authentication/index.md)   <br>

