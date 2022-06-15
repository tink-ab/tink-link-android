---
title: com.tink.service.transaction
---
//[link](../../index.html)/[com.tink.service.transaction](index.html)



# Package com.tink.service.transaction



## Types


| Name | Summary |
|---|---|
| Pageable | [common, androidJvm]<br>[common]<br>interface [Pageable]([common]-pageable/index.html)<br>[androidJvm]<br>interface [Pageable]([android-jvm]-pageable/index.html) |
| TransactionService | [common, androidJvm]<br>[common]<br>interface [TransactionService]([common]-transaction-service/index.html)<br>[androidJvm]<br>interface [TransactionService]([android-jvm]-transaction-service/index.html) |
| TransactionUpdateDescriptor | [common, androidJvm]<br>[common]<br>data class [TransactionUpdateDescriptor]([common]-transaction-update-descriptor/index.html)(val transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val date: &lt;ERROR CLASS&gt;? = null, val notes: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../com.tink.model.transaction/[common]-tag/index.html)&gt;? = null)<br>[androidJvm]<br>data class [TransactionUpdateDescriptor]([android-jvm]-transaction-update-descriptor/index.html)(val transactionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val description: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val date: [Instant](https://developer.android.com/reference/kotlin/java/time/Instant.html)? = null, val notes: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Tag](../com.tink.model.transaction/[android-jvm]-tag/index.html)&gt;? = null) |


## Functions


| Name | Summary |
|---|---|
| toCoreModel | [common, androidJvm]<br>[common]<br>fun &lt;ERROR CLASS&gt;.[toCoreModel]([common]to-core-model.html)(): &lt;ERROR CLASS&gt;<br>[androidJvm]<br>fun Transaction.[toCoreModel]([android-jvm]to-core-model.html)(): [Transaction](../com.tink.model.transaction/[android-jvm]-transaction/index.html)<br>[androidJvm]<br>fun TransactionResponse.[toCoreModel]([android-jvm]to-core-model.html)(): [Transaction](../com.tink.model.transaction/[android-jvm]-transaction/index.html) |

