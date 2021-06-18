---
title: [androidJvm]UserService -
---
//[link](../../index.md)/[com.tink.service.authorization](../index.md)/[[androidJvm]UserService](index.md)



# UserService  
 [androidJvm] interface [UserService](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.authorization/UserService/authenticate/#kotlin.String/PointingToDeclaration/"></a>[authenticate](authenticate.md)| <a name="com.tink.service.authorization/UserService/authenticate/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [authenticate](authenticate.md)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.authorization/UserService/authorize/#kotlin.collections.Set[com.tink.model.user.Scope]/PointingToDeclaration/"></a>[authorize](authorize.md)| <a name="com.tink.service.authorization/UserService/authorize/#kotlin.collections.Set[com.tink.model.user.Scope]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [authorize](authorize.md)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[Scope](../../com.tink.model.user/[android-jvm]-scope/index.md)>): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.service.authorization/UserService/createAnonymousUser/#com.tink.service.authorization.UserCreationDescriptor/PointingToDeclaration/"></a>[createAnonymousUser](create-anonymous-user.md)| <a name="com.tink.service.authorization/UserService/createAnonymousUser/#com.tink.service.authorization.UserCreationDescriptor/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [createAnonymousUser](create-anonymous-user.md)(arguments: [UserCreationDescriptor](../[android-jvm]-user-creation-descriptor/index.md)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.tink.service.authorization/UserService/getUserInfo/#/PointingToDeclaration/"></a>[getUserInfo](get-user-info.md)| <a name="com.tink.service.authorization/UserService/getUserInfo/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract suspend fun [getUserInfo](get-user-info.md)(): [UserInfo](../../com.tink.model.user/[android-jvm]-user-info/index.md)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>

