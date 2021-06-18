//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[androidJvm]TinkLinkError](index.md)



# TinkLinkError  
 [androidJvm] sealed class [TinkLinkError](index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

Represents errors that happen during the Tink Link UI flow.

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkError.CredentialsNotFound///PointingToDeclaration/"></a>[CredentialsNotFound](-credentials-not-found/index.md)| <a name="com.tink.link.ui/TinkLinkError.CredentialsNotFound///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [CredentialsNotFound](-credentials-not-found/index.md)(**credentialsId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkError](index.md)  <br>More info  <br>Tink Link UI is unable to fetch the credentials with the specified [credentialsId](-credentials-not-found/credentials-id.md).  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkError.FailedToAddCredentials///PointingToDeclaration/"></a>[FailedToAddCredentials](-failed-to-add-credentials/index.md)| <a name="com.tink.link.ui/TinkLinkError.FailedToAddCredentials///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [FailedToAddCredentials](-failed-to-add-credentials/index.md)(**errorsByCredentialsId**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [TinkLinkErrorInfo](../[android-jvm]-tink-link-error-info/index.md)>) : [TinkLinkError](index.md)  <br>More info  <br>Tink Link UI failed to add one or more credentials.  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkError.InternalError///PointingToDeclaration/"></a>[InternalError](-internal-error/index.md)| <a name="com.tink.link.ui/TinkLinkError.InternalError///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [InternalError](-internal-error/index.md) : [TinkLinkError](index.md)  <br>More info  <br>An internal error occurred in the Tink Link UI flow.  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkError.ProviderListEmpty///PointingToDeclaration/"></a>[ProviderListEmpty](-provider-list-empty/index.md)| <a name="com.tink.link.ui/TinkLinkError.ProviderListEmpty///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [ProviderListEmpty](-provider-list-empty/index.md) : [TinkLinkError](index.md)  <br>More info  <br>Tink Link UI fetched an empty list of providers  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkError.ProviderNotFound///PointingToDeclaration/"></a>[ProviderNotFound](-provider-not-found/index.md)| <a name="com.tink.link.ui/TinkLinkError.ProviderNotFound///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [ProviderNotFound](-provider-not-found/index.md)(**providerName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkError](index.md)  <br>More info  <br>Tink Link UI is unable to fetch the provider with the specified [providerName](-provider-not-found/provider-name.md).  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkError.UnableToFetchProviders///PointingToDeclaration/"></a>[UnableToFetchProviders](-unable-to-fetch-providers/index.md)| <a name="com.tink.link.ui/TinkLinkError.UnableToFetchProviders///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [UnableToFetchProviders](-unable-to-fetch-providers/index.md) : [TinkLinkError](index.md)  <br>More info  <br>Tink Link UI is unable to fetch providers.  <br><br><br>


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
| <a name="com.tink.link.ui/TinkLinkError.UnableToFetchProviders///PointingToDeclaration/"></a>TinkLinkError
| <a name="com.tink.link.ui/TinkLinkError.ProviderNotFound///PointingToDeclaration/"></a>TinkLinkError
| <a name="com.tink.link.ui/TinkLinkError.ProviderListEmpty///PointingToDeclaration/"></a>TinkLinkError
| <a name="com.tink.link.ui/TinkLinkError.CredentialsNotFound///PointingToDeclaration/"></a>TinkLinkError
| <a name="com.tink.link.ui/TinkLinkError.FailedToAddCredentials///PointingToDeclaration/"></a>TinkLinkError
| <a name="com.tink.link.ui/TinkLinkError.InternalError///PointingToDeclaration/"></a>TinkLinkError

