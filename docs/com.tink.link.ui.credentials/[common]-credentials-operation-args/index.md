---
title: [common]CredentialsOperationArgs
---
//[link](../../../index.html)/[com.tink.link.ui.credentials](../index.html)/[[common]CredentialsOperationArgs](index.html)



# CredentialsOperationArgs



[common]\
sealed class [CredentialsOperationArgs](index.html)



## Types


| Name | Summary |
|---|---|
| [Authenticate](-authenticate/index.html) | [common]<br>data class [Authenticate](-authenticate/index.html)(val provider: [Provider](../../com.tink.model.provider/[common]-provider/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [CredentialsOperationArgs](index.html) |
| [Create](-create/index.html) | [common]<br>data class [Create](-create/index.html)(val provider: [Provider](../../com.tink.model.provider/[common]-provider/index.html)) : [CredentialsOperationArgs](index.html) |
| [Refresh](-refresh/index.html) | [common]<br>data class [Refresh](-refresh/index.html)(val provider: [Provider](../../com.tink.model.provider/[common]-provider/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html), val authenticate: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [CredentialsOperationArgs](index.html) |
| [Update](-update/index.html) | [common]<br>data class [Update](-update/index.html)(val provider: [Provider](../../com.tink.model.provider/[common]-provider/index.html), val credentials: [Credentials](../../com.tink.model.credentials/[common]-credentials/index.html)) : [CredentialsOperationArgs](index.html) |


## Properties


| Name | Summary |
|---|---|
| [provider](provider.html) | [common]<br>abstract val [provider](provider.html): [Provider](../../com.tink.model.provider/[common]-provider/index.html) |


## Inheritors


| Name |
|---|
| Create |
| Update |
| Refresh |
| Authenticate |

