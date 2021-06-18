//[link](../../../../../index.md)/[com.tink.link.authentication](../../../../index.md)/[[androidJvm]AuthenticationTask](../../../index.md)/[ThirdPartyAuthentication](../../index.md)/[LaunchResult](../index.md)/[Error](index.md)



# Error  
 [androidJvm] sealed class [Error](index.md) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult](../index.md)

There was an error when launching the third party app.



Properties [packageName](package-name.md), [title](title.md), and [message](message.md) can be used for example to show a dialog to the user prompting to install or upgrading the app.

   


## See also  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>[com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled](-app-not-installed/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>[com.tink.link.authentication.AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade](-app-needs-upgrade/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error///PointingToDeclaration/"></a>
  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade///PointingToDeclaration/"></a>[AppNeedsUpgrade](-app-needs-upgrade/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [AppNeedsUpgrade](-app-needs-upgrade/index.md)(**packageName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](index.md)  <br>More info  <br>The app necessary for authentication is installed on the users device but needs to be updated.  <br><br><br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled///PointingToDeclaration/"></a>[AppNotInstalled](-app-not-installed/index.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [AppNotInstalled](-app-not-installed/index.md)(**packageName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error](index.md)  <br>More info  <br>The app necessary for authentication is not installed on the user's device.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../../../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../../../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/message/#/PointingToDeclaration/"></a>[message](message.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/message/#/PointingToDeclaration/"></a> [androidJvm] abstract val [message](message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/packageName/#/PointingToDeclaration/"></a>[packageName](package-name.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/packageName/#/PointingToDeclaration/"></a> [androidJvm] abstract val [packageName](package-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/title/#/PointingToDeclaration/"></a>[title](title.md)| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error/title/#/PointingToDeclaration/"></a> [androidJvm] abstract val [title](title.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNotInstalled///PointingToDeclaration/"></a>AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error
| <a name="com.tink.link.authentication/AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error.AppNeedsUpgrade///PointingToDeclaration/"></a>AuthenticationTask.ThirdPartyAuthentication.LaunchResult.Error

