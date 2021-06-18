//[link](../../../index.md)/[com.tink.service.network](../../index.md)/[[common]Environment](../index.md)/[Production](index.md)



# Production  
 [common] object [Production](index.md) : [Environment](../index.md)

Represents the Tink production environment

   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/Environment.Production/restUrl/#/PointingToDeclaration/"></a>[restUrl](index.md#%5Bcom.tink.service.network%2FEnvironment.Production%2FrestUrl%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963)| <a name="com.tink.service.network/Environment.Production/restUrl/#/PointingToDeclaration/"></a> [common] val [restUrl](index.md#%5Bcom.tink.service.network%2FEnvironment.Production%2FrestUrl%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The url for the REST endpoint   <br>
| <a name="com.tink.service.network/Environment.Production/sslCertificate/#/PointingToDeclaration/"></a>[sslCertificate](index.md#%5Bcom.tink.service.network%2FEnvironment.Production%2FsslCertificate%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963)| <a name="com.tink.service.network/Environment.Production/sslCertificate/#/PointingToDeclaration/"></a> [common] val [sslCertificate](index.md#%5Bcom.tink.service.network%2FEnvironment.Production%2FsslCertificate%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = nullAn optional ssl pinning certificate associated with the [restUrl](../rest-url.md)   <br>


## Extensions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network//withSslKey/com.tink.service.network.Environment.Production#kotlin.String/PointingToDeclaration/"></a>withSslKey| <a name="com.tink.service.network//withSslKey/com.tink.service.network.Environment.Production#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [Environment.Production](index.md).[withSslKey](../../[common]with-ssl-key.md)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom](../-custom/index.md)  <br>More info  <br>Creates an environment with the [Environment.Production](index.md) rest URL and the specified sslCertificate.  <br><br><br>[androidJvm]  <br>Content  <br>fun [Environment.Production](../../[android-jvm]-environment/-production/index.md).[withSslKey](../../[android-jvm]with-ssl-key.md)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom](../../[android-jvm]-environment/-custom/index.md)  <br>More info  <br>Creates an environment with the [Environment.Production](../../[android-jvm]-environment/-production/index.md) rest URL and the specified sslCertificate.  <br><br><br>

