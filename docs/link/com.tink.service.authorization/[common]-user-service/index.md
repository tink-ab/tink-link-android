---
title: [common]UserService
---
//[link](../../../index.html)/[com.tink.service.authorization](../index.html)/[[common]UserService](index.html)



# UserService



[common]\
interface [UserService](index.html)



## Functions


| Name | Summary |
|---|---|
| [authenticate](authenticate.html) | [common]<br>abstract suspend fun [authenticate](authenticate.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [authorize](authorize.html) | [common]<br>abstract suspend fun [authorize](authorize.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[common]-scope/index.html)&gt;): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [createAnonymousUser](create-anonymous-user.html) | [common]<br>abstract suspend fun [createAnonymousUser](create-anonymous-user.html)(arguments: [UserCreationDescriptor](../[common]-user-creation-descriptor/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getUserInfo](get-user-info.html) | [common]<br>abstract suspend fun [getUserInfo](get-user-info.html)(): [UserInfo](../../com.tink.model.user/[common]-user-info/index.html) |

