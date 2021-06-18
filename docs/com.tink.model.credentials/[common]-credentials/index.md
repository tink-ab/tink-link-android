---
title: [common]Credentials -
---
//[link](../../index.md)/[com.tink.model.credentials](../index.md)/[[common]Credentials](index.md)



# Credentials  
 [common] data class [Credentials](index.md)(**providerName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **type**: [Credentials.Type](-type/index.md), **fields**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, **id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **status**: [Credentials.Status](-status/index.md)?, **statusPayload**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **supplementalInformation**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field](../../com.tink.model.misc/[common]-field/index.md)>, **statusUpdated**: <ERROR CLASS>, **updated**: <ERROR CLASS>, **sessionExpiryDate**: <ERROR CLASS>?, **thirdPartyAppAuthentication**: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.md)?) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)<[Credentials](index.md)> 

This model represents how users are connected to a [Provider](../../com.tink.model.provider/[common]-provider/index.md) to access their financial data.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials/Credentials/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#kotlin.String#com.tink.model.credentials.Credentials.Status?#kotlin.String?#kotlin.collections.List[com.tink.model.misc.Field]###?#com.tink.model.authentication.ThirdPartyAppAuthentication?/PointingToDeclaration/"></a>[Credentials](-credentials.md)| <a name="com.tink.model.credentials/Credentials/Credentials/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#kotlin.String#com.tink.model.credentials.Credentials.Status?#kotlin.String?#kotlin.collections.List[com.tink.model.misc.Field]###?#com.tink.model.authentication.ThirdPartyAppAuthentication?/PointingToDeclaration/"></a> [common] fun [Credentials](-credentials.md)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Credentials.Type](-type/index.md), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), status: [Credentials.Status](-status/index.md)? = null, statusPayload: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, supplementalInformation: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field](../../com.tink.model.misc/[common]-field/index.md)> = emptyList(), statusUpdated: <ERROR CLASS> = Instant.EPOCH, updated: <ERROR CLASS> = Instant.EPOCH, sessionExpiryDate: <ERROR CLASS>? = null, thirdPartyAppAuthentication: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.md)? = null)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials.Status///PointingToDeclaration/"></a>[Status](-status/index.md)| <a name="com.tink.model.credentials/Credentials.Status///PointingToDeclaration/"></a>[common]  <br>Content  <br>enum [Status](-status/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Credentials.Status](-status/index.md)>   <br>More info  <br>Represents the status of the credentials.  <br><br><br>
| <a name="com.tink.model.credentials/Credentials.Type///PointingToDeclaration/"></a>[Type](-type/index.md)| <a name="com.tink.model.credentials/Credentials.Type///PointingToDeclaration/"></a>[common]  <br>Content  <br>enum [Type](-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Credentials.Type](-type/index.md)>   <br>More info  <br>Represents the type of authentication used for the credentials.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials/compareTo/#com.tink.model.credentials.Credentials/PointingToDeclaration/"></a>[compareTo](compare-to.md)| <a name="com.tink.model.credentials/Credentials/compareTo/#com.tink.model.credentials.Credentials/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [compareTo](compare-to.md)(other: [Credentials](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.model.credentials/Credentials/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component10/#/PointingToDeclaration/"></a>[component10](component10.md)| <a name="com.tink.model.credentials/Credentials/component10/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component10](component10.md)(): <ERROR CLASS>?  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component11/#/PointingToDeclaration/"></a>[component11](component11.md)| <a name="com.tink.model.credentials/Credentials/component11/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component11](component11.md)(): [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.md)?  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.model.credentials/Credentials/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [Credentials.Type](-type/index.md)  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.model.credentials/Credentials/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component3](component3.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.tink.model.credentials/Credentials/component4/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component4](component4.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component5/#/PointingToDeclaration/"></a>[component5](component5.md)| <a name="com.tink.model.credentials/Credentials/component5/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component5](component5.md)(): [Credentials.Status](-status/index.md)?  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component6/#/PointingToDeclaration/"></a>[component6](component6.md)| <a name="com.tink.model.credentials/Credentials/component6/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component6](component6.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component7/#/PointingToDeclaration/"></a>[component7](component7.md)| <a name="com.tink.model.credentials/Credentials/component7/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component7](component7.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field](../../com.tink.model.misc/[common]-field/index.md)>  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component8/#/PointingToDeclaration/"></a>[component8](component8.md)| <a name="com.tink.model.credentials/Credentials/component8/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component8](component8.md)(): <ERROR CLASS>  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/component9/#/PointingToDeclaration/"></a>[component9](component9.md)| <a name="com.tink.model.credentials/Credentials/component9/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component9](component9.md)(): <ERROR CLASS>  <br><br><br>
| <a name="com.tink.model.credentials/Credentials/copy/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#kotlin.String#com.tink.model.credentials.Credentials.Status?#kotlin.String?#kotlin.collections.List[com.tink.model.misc.Field]###?#com.tink.model.authentication.ThirdPartyAppAuthentication?/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.model.credentials/Credentials/copy/#kotlin.String#com.tink.model.credentials.Credentials.Type#kotlin.collections.Map[kotlin.String,kotlin.String]#kotlin.String#com.tink.model.credentials.Credentials.Status?#kotlin.String?#kotlin.collections.List[com.tink.model.misc.Field]###?#com.tink.model.authentication.ThirdPartyAppAuthentication?/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(providerName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [Credentials.Type](-type/index.md), fields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), status: [Credentials.Status](-status/index.md)? = null, statusPayload: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, supplementalInformation: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field](../../com.tink.model.misc/[common]-field/index.md)> = emptyList(), statusUpdated: <ERROR CLASS> = Instant.EPOCH, updated: <ERROR CLASS> = Instant.EPOCH, sessionExpiryDate: <ERROR CLASS>? = null, thirdPartyAppAuthentication: [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.md)? = null): [Credentials](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials/fields/#/PointingToDeclaration/"></a>[fields](fields.md)| <a name="com.tink.model.credentials/Credentials/fields/#/PointingToDeclaration/"></a> [common] val [fields](fields.md): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>The map of [Field](../../com.tink.model.misc/[common]-field/index.md) name and value pairs for the [Provider](../../com.tink.model.provider/[common]-provider/index.md).   <br>
| <a name="com.tink.model.credentials/Credentials/id/#/PointingToDeclaration/"></a>[id](id.md)| <a name="com.tink.model.credentials/Credentials/id/#/PointingToDeclaration/"></a> [common] val [id](id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The unique identifier of the credentials.   <br>
| <a name="com.tink.model.credentials/Credentials/providerName/#/PointingToDeclaration/"></a>[providerName](provider-name.md)| <a name="com.tink.model.credentials/Credentials/providerName/#/PointingToDeclaration/"></a> [common] val [providerName](provider-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Identifier for the [Provider](../../com.tink.model.provider/[common]-provider/index.md).   <br>
| <a name="com.tink.model.credentials/Credentials/sessionExpiryDate/#/PointingToDeclaration/"></a>[sessionExpiryDate](session-expiry-date.md)| <a name="com.tink.model.credentials/Credentials/sessionExpiryDate/#/PointingToDeclaration/"></a> [common] val [sessionExpiryDate](session-expiry-date.md): <ERROR CLASS>? = nullThe session expiration time of the credentials for a [Provider](../../com.tink.model.provider/[common]-provider/index.md) with [Provider.accessType](../../com.tink.model.provider/[common]-provider/access-type.md) set to [Provider.AccessType.OPEN_BANKING](../../com.tink.model.provider/[common]-provider/-access-type/-o-p-e-n_-b-a-n-k-i-n-g/index.md)   <br>
| <a name="com.tink.model.credentials/Credentials/status/#/PointingToDeclaration/"></a>[status](status.md)| <a name="com.tink.model.credentials/Credentials/status/#/PointingToDeclaration/"></a> [common] val [status](status.md): [Credentials.Status](-status/index.md)? = nullThe current status of the credentials.   <br>
| <a name="com.tink.model.credentials/Credentials/statusPayload/#/PointingToDeclaration/"></a>[statusPayload](status-payload.md)| <a name="com.tink.model.credentials/Credentials/statusPayload/#/PointingToDeclaration/"></a> [common] val [statusPayload](status-payload.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = nullA user-friendly text connected to the [Status](-status/index.md)   <br>
| <a name="com.tink.model.credentials/Credentials/statusUpdated/#/PointingToDeclaration/"></a>[statusUpdated](status-updated.md)| <a name="com.tink.model.credentials/Credentials/statusUpdated/#/PointingToDeclaration/"></a> [common] val [statusUpdated](status-updated.md): <ERROR CLASS>Indicates when the credentials' status was last updated   <br>
| <a name="com.tink.model.credentials/Credentials/supplementalInformation/#/PointingToDeclaration/"></a>[supplementalInformation](supplemental-information.md)| <a name="com.tink.model.credentials/Credentials/supplementalInformation/#/PointingToDeclaration/"></a> [common] val [supplementalInformation](supplemental-information.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Field](../../com.tink.model.misc/[common]-field/index.md)>The list of [Field](../../com.tink.model.misc/[common]-field/index.md) objects representing additional information required for the authentication flow   <br>
| <a name="com.tink.model.credentials/Credentials/thirdPartyAppAuthentication/#/PointingToDeclaration/"></a>[thirdPartyAppAuthentication](third-party-app-authentication.md)| <a name="com.tink.model.credentials/Credentials/thirdPartyAppAuthentication/#/PointingToDeclaration/"></a> [common] val [thirdPartyAppAuthentication](third-party-app-authentication.md): [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.md)? = nullThe [ThirdPartyAppAuthentication](../../com.tink.model.authentication/[common]-third-party-app-authentication/index.md) object containing information about the third party authentication flow   <br>
| <a name="com.tink.model.credentials/Credentials/type/#/PointingToDeclaration/"></a>[type](type.md)| <a name="com.tink.model.credentials/Credentials/type/#/PointingToDeclaration/"></a> [common] val [type](type.md): [Credentials.Type](-type/index.md)The authentication type used for the credentials.   <br>
| <a name="com.tink.model.credentials/Credentials/updated/#/PointingToDeclaration/"></a>[updated](updated.md)| <a name="com.tink.model.credentials/Credentials/updated/#/PointingToDeclaration/"></a> [common] val [updated](updated.md): <ERROR CLASS>Indicates the last time when the [status](status.md) was [Status.UPDATED](-status/-u-p-d-a-t-e-d/index.md)   <br>
