//[link](../../index.md)/[com.tink.link.core.credentials](../index.md)/[[androidJvm]CredentialsStatus](index.md)



# CredentialsStatus  
 [androidJvm] sealed class [CredentialsStatus](index.md)

The status of a Credentials. Possible values are [Success](-success/index.md), [Loading](-loading/index.md), and [AwaitingAuthentication](-awaiting-authentication/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsStatus.AwaitingAuthentication///PointingToDeclaration/"></a>[AwaitingAuthentication](-awaiting-authentication/index.md)| <a name="com.tink.link.core.credentials/CredentialsStatus.AwaitingAuthentication///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>class [AwaitingAuthentication](-awaiting-authentication/index.md)(**authenticationTask**: [AuthenticationTask](../../com.tink.link.authentication/[android-jvm]-authentication-task/index.md), **credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [CredentialsStatus](index.md)  <br>More info  <br>There is an outstanding authentication waiting that needs to be completed by the user to proceed.  <br><br><br>
| <a name="com.tink.link.core.credentials/CredentialsStatus.Loading///PointingToDeclaration/"></a>[Loading](-loading/index.md)| <a name="com.tink.link.core.credentials/CredentialsStatus.Loading///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [Loading](-loading/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)?) : [CredentialsStatus](index.md)  <br>More info  <br>The creation is being processed by Tink.  <br><br><br>
| <a name="com.tink.link.core.credentials/CredentialsStatus.Success///PointingToDeclaration/"></a>[Success](-success/index.md)| <a name="com.tink.link.core.credentials/CredentialsStatus.Success///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [Success](-success/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **credentials**: [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)) : [CredentialsStatus](index.md)  <br>More info  <br>The credentials were successfully created.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.core.credentials/CredentialsStatus/credentials/#/PointingToDeclaration/"></a>[credentials](credentials.md)| <a name="com.tink.link.core.credentials/CredentialsStatus/credentials/#/PointingToDeclaration/"></a> [androidJvm] abstract val [credentials](credentials.md): [Credentials](../../com.tink.model.credentials/[android-jvm]-credentials/index.md)?   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.core.credentials/CredentialsStatus.Success///PointingToDeclaration/"></a>CredentialsStatus
| <a name="com.tink.link.core.credentials/CredentialsStatus.Loading///PointingToDeclaration/"></a>CredentialsStatus
| <a name="com.tink.link.core.credentials/CredentialsStatus.AwaitingAuthentication///PointingToDeclaration/"></a>CredentialsStatus

