---
title: com.tink.model.transfer
---
//[link](../../index.html)/[com.tink.model.transfer](index.html)



# Package com.tink.model.transfer



## Types


| Name | Summary |
|---|---|
| Beneficiary | [common, androidJvm]<br>[common]<br>data class [Beneficiary]([common]-beneficiary/index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[androidJvm]<br>data class [Beneficiary]([android-jvm]-beneficiary/index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>A beneficiary is a payment or transfer destination account which has been authorized by the bank. Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary. |
| SignableOperation | [common, androidJvm]<br>[common]<br>data class [SignableOperation]([common]-signable-operation/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val created: &lt;ERROR CLASS&gt;, val status: [SignableOperation.Status]([common]-signable-operation/-status/index.html), val statusMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [SignableOperation.Type]([common]-signable-operation/-type/index.html), val underlyingId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val updated: &lt;ERROR CLASS&gt;, val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[androidJvm]<br>data class [SignableOperation]([android-jvm]-signable-operation/index.html)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val created: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val status: [SignableOperation.Status]([android-jvm]-signable-operation/-status/index.html), val statusMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val type: [SignableOperation.Type]([android-jvm]-signable-operation/-type/index.html), val underlyingId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val updated: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html), val userId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html) |

