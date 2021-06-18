//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[androidJvm]TinkLinkResult](index.md)



# TinkLinkResult  
 [androidJvm] sealed class [TinkLinkResult](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

The result data that is returned from the Tink Link UI flow. Possible values are [TemporaryUser](-temporary-user/index.md) and [PermanentUser](-permanent-user/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkResult.PermanentUser///PointingToDeclaration/"></a>[PermanentUser](-permanent-user/index.md)| <a name="com.tink.link.ui/TinkLinkResult.PermanentUser///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [PermanentUser](-permanent-user/index.md)(**credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [TinkLinkResult](index.md)  <br>More info  <br>The data returned when a [LinkUser.ExistingUser](../[android-jvm]-link-user/-existing-user/index.md) or [LinkUser.UnauthenticatedUser](../[android-jvm]-link-user/-unauthenticated-user/index.md) is used in the Tink Link UI flow.  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkResult.TemporaryUser///PointingToDeclaration/"></a>[TemporaryUser](-temporary-user/index.md)| <a name="com.tink.link.ui/TinkLinkResult.TemporaryUser///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [TemporaryUser](-temporary-user/index.md)(**authorizationCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [TinkLinkResult](index.md)  <br>More info  <br>The data returned when a [LinkUser.TemporaryUser](../[android-jvm]-link-user/-temporary-user/index.md) is used in the Tink Link UI flow.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.ui/TinkLinkResult.TemporaryUser///PointingToDeclaration/"></a>TinkLinkResult
| <a name="com.tink.link.ui/TinkLinkResult.PermanentUser///PointingToDeclaration/"></a>TinkLinkResult

