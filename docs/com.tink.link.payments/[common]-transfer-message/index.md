---
title: [common]TransferMessage -
---
//[link](../../index.md)/[com.tink.link.payments](../index.md)/[[common]TransferMessage](index.md)



# TransferMessage  
 [common] data class [TransferMessage](index.md)(**destinationMessage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **sourceMessage**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)

The message for a transfer.

   


## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferMessage///PointingToDeclaration/"></a>destinationMessage| <a name="com.tink.link.payments/TransferMessage///PointingToDeclaration/"></a><br><br>This is the message that will be displayed to the recipient of the transfer.<br><br>
| <a name="com.tink.link.payments/TransferMessage///PointingToDeclaration/"></a>sourceMessage| <a name="com.tink.link.payments/TransferMessage///PointingToDeclaration/"></a><br><br>This is the message that will be displayed on the source source account. If not provided it will be the same as [destinationMessage](destination-message.md).<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferMessage/TransferMessage/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[TransferMessage](-transfer-message.md)| <a name="com.tink.link.payments/TransferMessage/TransferMessage/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a> [common] fun [TransferMessage](-transfer-message.md)(destinationMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sourceMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)This is the message that will be displayed to the recipient of the transfer.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferMessage/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.link.payments/TransferMessage/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.link.payments/TransferMessage/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.link.payments/TransferMessage/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| <a name="com.tink.link.payments/TransferMessage/copy/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.link.payments/TransferMessage/copy/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [copy](copy.md)(destinationMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), sourceMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [TransferMessage](index.md)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.payments/TransferMessage/destinationMessage/#/PointingToDeclaration/"></a>[destinationMessage](destination-message.md)| <a name="com.tink.link.payments/TransferMessage/destinationMessage/#/PointingToDeclaration/"></a> [common] val [destinationMessage](destination-message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)This is the message that will be displayed to the recipient of the transfer.   <br>
| <a name="com.tink.link.payments/TransferMessage/sourceMessage/#/PointingToDeclaration/"></a>[sourceMessage](source-message.md)| <a name="com.tink.link.payments/TransferMessage/sourceMessage/#/PointingToDeclaration/"></a> [common] val [sourceMessage](source-message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = nullThis is the message that will be displayed on the source source account.   <br>

