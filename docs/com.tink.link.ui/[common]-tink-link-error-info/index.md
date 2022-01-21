---
title: [common]TinkLinkErrorInfo -
---
//[link](../../index.md)/[com.tink.link.ui](../index.md)/[[common]TinkLinkErrorInfo](index.md)



# TinkLinkErrorInfo  
 [common] sealed class [TinkLinkErrorInfo](index.md)

A wrapper class that provides information about the underlying error causing the [TinkLinkError](../[common]-tink-link-error/index.md)

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkErrorInfo.HttpError///PointingToDeclaration/"></a>[HttpError](-http-error/index.md)| <a name="com.tink.link.ui/TinkLinkErrorInfo.HttpError///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [HttpError](-http-error/index.md)(**code**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](index.md)  <br>More info  <br>This represents an HTTP exception that may have occurred.  <br><br><br>
| <a name="com.tink.link.ui/TinkLinkErrorInfo.InternalError///PointingToDeclaration/"></a>[InternalError](-internal-error/index.md)| <a name="com.tink.link.ui/TinkLinkErrorInfo.InternalError///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [InternalError](-internal-error/index.md)(**message**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [TinkLinkErrorInfo](index.md)  <br>More info  <br>This represents a generic error that may have occurred.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[common]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.ui/TinkLinkErrorInfo/message/#/PointingToDeclaration/"></a>[message](message.md)| <a name="com.tink.link.ui/TinkLinkErrorInfo/message/#/PointingToDeclaration/"></a> [common] abstract val [message](message.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The error message   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="com.tink.link.ui/TinkLinkErrorInfo.HttpError///PointingToDeclaration/"></a>TinkLinkErrorInfo
| <a name="com.tink.link.ui/TinkLinkErrorInfo.InternalError///PointingToDeclaration/"></a>TinkLinkErrorInfo

