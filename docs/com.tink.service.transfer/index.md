---
title: com.tink.service.transfer
---
//[link](../../index.html)/[com.tink.service.transfer](index.html)



# Package com.tink.service.transfer



## Types


| Name | Summary |
|---|---|
| CreateBeneficiaryDescriptor | [common, androidJvm]<br>[common]<br>data class [CreateBeneficiaryDescriptor]([common]-create-beneficiary-descriptor/index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>[androidJvm]<br>data class [CreateBeneficiaryDescriptor]([android-jvm]-create-beneficiary-descriptor/index.html)(val ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Descriptor to create a beneficiary of a transfer |
| CreateTransferDescriptor | [common, androidJvm]<br>[common]<br>data class [CreateTransferDescriptor]([common]-create-transfer-descriptor/index.html)(val amount: [Amount](../com.tink.model.misc/[common]-amount/index.html), val sourceAccountUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sourceMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val beneficiaryUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val destinationMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)<br>[androidJvm]<br>data class [CreateTransferDescriptor]([android-jvm]-create-transfer-descriptor/index.html)(val amount: [Amount](../com.tink.model.misc/[android-jvm]-amount/index.html), val sourceAccountUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val sourceMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, val beneficiaryUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val destinationMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val credentialsId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null) |
| TransferService | [common, androidJvm]<br>[common]<br>interface [TransferService]([common]-transfer-service/index.html)<br>[androidJvm]<br>interface [TransferService]([android-jvm]-transfer-service/index.html) |

