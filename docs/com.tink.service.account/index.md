---
title: com.tink.service.account
---
//[link](../../index.html)/[com.tink.service.account](index.html)



# Package com.tink.service.account



## Types


| Name | Summary |
|---|---|
| AccountService | [common, androidJvm]<br>[common]<br>interface [AccountService]([common]-account-service/index.html)<br>[androidJvm]<br>interface [AccountService]([android-jvm]-account-service/index.html) |
| AccountServiceImpl | [common, androidJvm]<br>[common]<br>class [AccountServiceImpl]([common]-account-service-impl/index.html)constructor(api: &lt;ERROR CLASS&gt;) : [AccountService]([common]-account-service/index.html)<br>[androidJvm]<br>class [AccountServiceImpl]([android-jvm]-account-service-impl/index.html)@Injectconstructor(api: AccountApi) : [AccountService]([android-jvm]-account-service/index.html) |
| UpdateAccountDescriptor | [common, androidJvm]<br>[common]<br>data class [UpdateAccountDescriptor]([common]-update-account-descriptor/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountExclusion: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, val favored: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val ownership: [ExactNumber](../com.tink.model.misc/[common]-exact-number/index.html)? = null, val type: [Account.Type](../com.tink.model.account/[common]-account/-type/index.html)? = null)<br>[androidJvm]<br>data class [UpdateAccountDescriptor]([android-jvm]-update-account-descriptor/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountExclusion: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, val favored: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null, val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val ownership: [ExactNumber](../com.tink.model.misc/[android-jvm]-exact-number/index.html)? = null, val type: [Account.Type](../com.tink.model.account/[android-jvm]-account/-type/index.html)? = null) |


## Functions


| Name | Summary |
|---|---|
| toCoreModel | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[toCoreModel]([common]to-core-model.html)(): [Account](../com.tink.model.account/[common]-account/index.html)<br>[androidJvm]<br>fun Account.[toCoreModel]([android-jvm]to-core-model.html)(): [Account](../com.tink.model.account/[android-jvm]-account/index.html) |

