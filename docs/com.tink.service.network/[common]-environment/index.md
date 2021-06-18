//[link](../../index.md)/[com.tink.service.network](../index.md)/[[common]Environment](index.md)



# Environment  
 [common] sealed class [Environment](index.md)

Represents the environment you want to connect to.

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/Environment.Custom///PointingToDeclaration/"></a>[Custom](-custom/index.md)| <a name="com.tink.service.network/Environment.Custom///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [Custom](-custom/index.md)(**restUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **sslCertificate**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [Environment](index.md)  <br>More info  <br>Represents a custom environment you want to connect to.  <br><br><br>
| <a name="com.tink.service.network/Environment.Production///PointingToDeclaration/"></a>[Production](-production/index.md)| <a name="com.tink.service.network/Environment.Production///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Production](-production/index.md) : [Environment](index.md)  <br>More info  <br>Represents the Tink production environment  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/Environment/restUrl/#/PointingToDeclaration/"></a>[restUrl](rest-url.md)| <a name="com.tink.service.network/Environment/restUrl/#/PointingToDeclaration/"></a> [common] val [restUrl](rest-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The url for the REST endpoint   <br>
| <a name="com.tink.service.network/Environment/sslCertificate/#/PointingToDeclaration/"></a>[sslCertificate](ssl-certificate.md)| <a name="com.tink.service.network/Environment/sslCertificate/#/PointingToDeclaration/"></a> [common] val [sslCertificate](ssl-certificate.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = nullAn optional ssl pinning certificate associated with the [restUrl](rest-url.md)   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.service.network/Environment.Production///PointingToDeclaration/"></a>Environment
| <a name="com.tink.service.network/Environment.Custom///PointingToDeclaration/"></a>Environment

