---
title: Status -
---
//[link](../../../index.md)/[com.tink.model.credentials](../../index.md)/[[common]Credentials](../index.md)/[Status](index.md)



# Status  
 [common] enum [Status](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Credentials.Status](index.md)> 

Represents the status of the credentials.



When data is being fetched/updated from a [Provider](../../../com.tink.model.provider/[common]-provider/index.md), the status of the credentials can change to indicate the current state of the flow. You can observe the credentials and act upon changes in the status if the [statusUpdated](../status-updated.md) value is greater than what it was previously.

   


## Entries  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials.Status.UNKNOWN///PointingToDeclaration/"></a>[UNKNOWN](-u-n-k-n-o-w-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.UNKNOWN///PointingToDeclaration/"></a> [common] [UNKNOWN](-u-n-k-n-o-w-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.CREATED///PointingToDeclaration/"></a>[CREATED](-c-r-e-a-t-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.CREATED///PointingToDeclaration/"></a> [common] [CREATED](-c-r-e-a-t-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATING///PointingToDeclaration/"></a>[AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATING///PointingToDeclaration/"></a> [common] [AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.UPDATING///PointingToDeclaration/"></a>[UPDATING](-u-p-d-a-t-i-n-g/index.md)| <a name="com.tink.model.credentials/Credentials.Status.UPDATING///PointingToDeclaration/"></a> [common] [UPDATING](-u-p-d-a-t-i-n-g/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.UPDATED///PointingToDeclaration/"></a>[UPDATED](-u-p-d-a-t-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.UPDATED///PointingToDeclaration/"></a> [common] [UPDATED](-u-p-d-a-t-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.TEMPORARY_ERROR///PointingToDeclaration/"></a>[TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.md)| <a name="com.tink.model.credentials/Credentials.Status.TEMPORARY_ERROR///PointingToDeclaration/"></a> [common] [TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATION_ERROR///PointingToDeclaration/"></a>[AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATION_ERROR///PointingToDeclaration/"></a> [common] [AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.PERMANENT_ERROR///PointingToDeclaration/"></a>[PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.md)| <a name="com.tink.model.credentials/Credentials.Status.PERMANENT_ERROR///PointingToDeclaration/"></a> [common] [PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION///PointingToDeclaration/"></a>[AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION///PointingToDeclaration/"></a> [common] [AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION///PointingToDeclaration/"></a>[AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION///PointingToDeclaration/"></a> [common] [AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION///PointingToDeclaration/"></a>[AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION///PointingToDeclaration/"></a> [common] [AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.SESSION_EXPIRED///PointingToDeclaration/"></a>[SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.SESSION_EXPIRED///PointingToDeclaration/"></a> [common] [SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.DISABLED///PointingToDeclaration/"></a>[DISABLED](-d-i-s-a-b-l-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.DISABLED///PointingToDeclaration/"></a> [common] [DISABLED](-d-i-s-a-b-l-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.DELETED///PointingToDeclaration/"></a>[DELETED](-d-e-l-e-t-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.DELETED///PointingToDeclaration/"></a> [common] [DELETED](-d-e-l-e-t-e-d/index.md)()  <br>   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Enum/compareTo/#com.tink.model.credentials.Credentials.Status/PointingToDeclaration/"></a>[compareTo](-d-e-l-e-t-e-d/index.md#%5Bkotlin%2FEnum%2FcompareTo%2F%23com.tink.model.credentials.Credentials.Status%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Enum/compareTo/#com.tink.model.credentials.Credentials.Status/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator override fun [compareTo](-d-e-l-e-t-e-d/index.md#%5Bkotlin%2FEnum%2FcompareTo%2F%23com.tink.model.credentials.Credentials.Status%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Credentials.Status](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Enum/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Enum/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator override fun [equals](../../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Enum/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Enum/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>override fun [hashCode](../../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Enum/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)| <a name="kotlin/Enum/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1647702525)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials.Status/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1647702525)| <a name="com.tink.model.credentials/Credentials.Status/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1647702525): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.model.credentials/Credentials.Status/ordinal/#/PointingToDeclaration/"></a>[ordinal](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1647702525)| <a name="com.tink.model.credentials/Credentials.Status/ordinal/#/PointingToDeclaration/"></a> [common] val [ordinal](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1647702525): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>

