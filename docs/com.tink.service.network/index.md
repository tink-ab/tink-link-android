//[link](../index.md)/[com.tink.service.network](index.md)



# Package com.tink.service.network  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network/Environment///PointingToDeclaration/"></a>Environment| <a name="com.tink.service.network/Environment///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>sealed class [Environment]([common]-environment/index.md)  <br>[androidJvm]  <br>sealed class [Environment]([android-jvm]-environment/index.md)  <br>More info  <br>Represents the environment you want to connect to.  <br><br><br>
| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>TinkConfiguration| <a name="com.tink.service.network/TinkConfiguration///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [TinkConfiguration]([common]-tink-configuration/index.md)(**environment**: [Environment]([common]-environment/index.md), **oAuthClientId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **redirectUri**: <ERROR CLASS>)  <br>[androidJvm]  <br>data class [TinkConfiguration]([android-jvm]-tink-configuration/index.md)(**environment**: [Environment]([android-jvm]-environment/index.md), **oAuthClientId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **redirectUri**: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html))  <br>More info  <br>Configuration for Tink Link  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.network//withSslKey/com.tink.service.network.Environment.Production#kotlin.String/PointingToDeclaration/"></a>withSslKey| <a name="com.tink.service.network//withSslKey/com.tink.service.network.Environment.Production#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [Environment.Production]([common]-environment/-production/index.md).[withSslKey]([common]with-ssl-key.md)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom]([common]-environment/-custom/index.md)  <br>More info  <br>Creates an environment with the [Environment.Production]([common]-environment/-production/index.md) rest URL and the specified sslCertificate.  <br><br><br>[androidJvm]  <br>Content  <br>fun [Environment.Production]([android-jvm]-environment/-production/index.md).[withSslKey]([android-jvm]with-ssl-key.md)(sslCertificate: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Environment.Custom]([android-jvm]-environment/-custom/index.md)  <br>More info  <br>Creates an environment with the [Environment.Production]([android-jvm]-environment/-production/index.md) rest URL and the specified sslCertificate.  <br><br><br>

