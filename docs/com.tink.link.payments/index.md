---
title: com.tink.link.payments -
---
//[link](../index.md)/[com.tink.link.payments](index.md)



# Package com.tink.link.payments  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/AddBeneficiaryFailure///PointingToDeclaration/"></a>AddBeneficiaryFailure| <a name="com.tink.link.payments/AddBeneficiaryFailure///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>class [AddBeneficiaryFailure]([common]-add-beneficiary-failure/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)  <br>[androidJvm]  <br>class [AddBeneficiaryFailure]([android-jvm]-add-beneficiary-failure/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)  <br><br><br>
| <a name="com.tink.link.payments/AddBeneficiaryStatus///PointingToDeclaration/"></a>AddBeneficiaryStatus| <a name="com.tink.link.payments/AddBeneficiaryStatus///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>sealed class [AddBeneficiaryStatus]([common]-add-beneficiary-status/index.md)  <br>[androidJvm]  <br>sealed class [AddBeneficiaryStatus]([android-jvm]-add-beneficiary-status/index.md)  <br>More info  <br>The status of a transfer.  <br><br><br>
| <a name="com.tink.link.payments/TinkLinkPayments///PointingToDeclaration/"></a>TinkLinkPayments| <a name="com.tink.link.payments/TinkLinkPayments///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>object [TinkLinkPayments]([common]-tink-link-payments/index.md)  <br>[androidJvm]  <br>object [TinkLinkPayments]([android-jvm]-tink-link-payments/index.md)  <br>More info  <br>This is for Java compatibility only.<br><br>Since Kotlin  <br>999999999.0.0  <br>  <br>  <br><br><br>
| <a name="com.tink.link.payments/TransferFailure///PointingToDeclaration/"></a>TransferFailure| <a name="com.tink.link.payments/TransferFailure///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>class [TransferFailure]([common]-transfer-failure/index.md)(**reason**: [TransferFailure.Reason]([common]-transfer-failure/-reason/index.md)) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)  <br>[androidJvm]  <br>class [TransferFailure]([android-jvm]-transfer-failure/index.md)(**reason**: [TransferFailure.Reason]([android-jvm]-transfer-failure/-reason/index.md)) : [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)  <br><br><br>
| <a name="com.tink.link.payments/TransferMessage///PointingToDeclaration/"></a>TransferMessage| <a name="com.tink.link.payments/TransferMessage///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [TransferMessage]([common]-transfer-message/index.md)(**destinationMessage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **sourceMessage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br>[androidJvm]  <br>data class [TransferMessage]([android-jvm]-transfer-message/index.md)(**destinationMessage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **sourceMessage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br>More info  <br>The message for a transfer.  <br><br><br>
| <a name="com.tink.link.payments/TransferRepository///PointingToDeclaration/"></a>TransferRepository| <a name="com.tink.link.payments/TransferRepository///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>interface [TransferRepository]([common]-transfer-repository/index.md)  <br>[androidJvm]  <br>interface [TransferRepository]([android-jvm]-transfer-repository/index.md)  <br>More info  <br>Repository for initiating transfers and retrieving the necessary input for that action.  <br><br><br>
| <a name="com.tink.link.payments/TransferStatus///PointingToDeclaration/"></a>TransferStatus| <a name="com.tink.link.payments/TransferStatus///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>sealed class [TransferStatus]([common]-transfer-status/index.md)  <br>[androidJvm]  <br>sealed class [TransferStatus]([android-jvm]-transfer-status/index.md)  <br>More info  <br>The status of a transfer.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments//getTransferRepository/com.tink.core.Tink#/PointingToDeclaration/"></a>getTransferRepository| <a name="com.tink.link.payments//getTransferRepository/com.tink.core.Tink#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [Tink](../com.tink.core/[common]-tink/index.md).[getTransferRepository]([common]get-transfer-repository.md)(): [TransferRepository]([common]-transfer-repository/index.md)  <br>More info  <br>Fetches the [TransferRepository]([common]-transfer-repository/index.md) from Tink.  <br><br><br>[androidJvm]  <br>Content  <br>fun [Tink](../com.tink.core/[android-jvm]-tink/index.md).[getTransferRepository]([android-jvm]get-transfer-repository.md)(): [TransferRepository]([android-jvm]-transfer-repository/index.md)  <br>More info  <br>Fetches the [TransferRepository]([android-jvm]-transfer-repository/index.md) from Tink.  <br><br><br>

