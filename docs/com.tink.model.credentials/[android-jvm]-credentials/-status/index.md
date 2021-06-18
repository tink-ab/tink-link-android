---
title: Status -
---
//[link](../../../index.md)/[com.tink.model.credentials](../../index.md)/[[androidJvm]Credentials](../index.md)/[Status](index.md)



# Status  
 [androidJvm] enum [Status](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Credentials.Status](index.md)> 

Represents the status of the credentials.



When data is being fetched/updated from a [Provider](../../../com.tink.model.provider/[android-jvm]-provider/index.md), the status of the credentials can change to indicate the current state of the flow. You can observe the credentials and act upon changes in the status if the [statusUpdated](../status-updated.md) value is greater than what it was previously.

   


## Entries  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials.Status.UNKNOWN///PointingToDeclaration/"></a>[UNKNOWN](-u-n-k-n-o-w-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.UNKNOWN///PointingToDeclaration/"></a> [androidJvm] [UNKNOWN](-u-n-k-n-o-w-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.CREATED///PointingToDeclaration/"></a>[CREATED](-c-r-e-a-t-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.CREATED///PointingToDeclaration/"></a> [androidJvm] [CREATED](-c-r-e-a-t-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATING///PointingToDeclaration/"></a>[AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATING///PointingToDeclaration/"></a> [androidJvm] [AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.UPDATING///PointingToDeclaration/"></a>[UPDATING](-u-p-d-a-t-i-n-g/index.md)| <a name="com.tink.model.credentials/Credentials.Status.UPDATING///PointingToDeclaration/"></a> [androidJvm] [UPDATING](-u-p-d-a-t-i-n-g/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.UPDATED///PointingToDeclaration/"></a>[UPDATED](-u-p-d-a-t-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.UPDATED///PointingToDeclaration/"></a> [androidJvm] [UPDATED](-u-p-d-a-t-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.TEMPORARY_ERROR///PointingToDeclaration/"></a>[TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.md)| <a name="com.tink.model.credentials/Credentials.Status.TEMPORARY_ERROR///PointingToDeclaration/"></a> [androidJvm] [TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATION_ERROR///PointingToDeclaration/"></a>[AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AUTHENTICATION_ERROR///PointingToDeclaration/"></a> [androidJvm] [AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.PERMANENT_ERROR///PointingToDeclaration/"></a>[PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.md)| <a name="com.tink.model.credentials/Credentials.Status.PERMANENT_ERROR///PointingToDeclaration/"></a> [androidJvm] [PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION///PointingToDeclaration/"></a>[AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION///PointingToDeclaration/"></a> [androidJvm] [AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION///PointingToDeclaration/"></a>[AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION///PointingToDeclaration/"></a> [androidJvm] [AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION///PointingToDeclaration/"></a>[AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.md)| <a name="com.tink.model.credentials/Credentials.Status.AWAITING_SUPPLEMENTAL_INFORMATION///PointingToDeclaration/"></a> [androidJvm] [AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.SESSION_EXPIRED///PointingToDeclaration/"></a>[SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.SESSION_EXPIRED///PointingToDeclaration/"></a> [androidJvm] [SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.DISABLED///PointingToDeclaration/"></a>[DISABLED](-d-i-s-a-b-l-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.DISABLED///PointingToDeclaration/"></a> [androidJvm] [DISABLED](-d-i-s-a-b-l-e-d/index.md)()  <br>   <br>
| <a name="com.tink.model.credentials/Credentials.Status.DELETED///PointingToDeclaration/"></a>[DELETED](-d-e-l-e-t-e-d/index.md)| <a name="com.tink.model.credentials/Credentials.Status.DELETED///PointingToDeclaration/"></a> [androidJvm] [DELETED](-d-e-l-e-t-e-d/index.md)()  <br>   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Enum/compareTo/#com.tink.model.credentials.Credentials.Status/PointingToDeclaration/"></a>[compareTo](-d-e-l-e-t-e-d/index.md#%5Bkotlin%2FEnum%2FcompareTo%2F%23com.tink.model.credentials.Credentials.Status%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Enum/compareTo/#com.tink.model.credentials.Credentials.Status/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator override fun [compareTo](-d-e-l-e-t-e-d/index.md#%5Bkotlin%2FEnum%2FcompareTo%2F%23com.tink.model.credentials.Credentials.Status%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Credentials.Status](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Enum/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Enum/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator override fun [equals](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Enum/finalize/#/PointingToDeclaration/"></a>[finalize](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Ffinalize%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Enum/finalize/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [finalize](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Ffinalize%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)()  <br><br><br>
| <a name="kotlin/Enum/getDeclaringClass/#/PointingToDeclaration/"></a>[getDeclaringClass](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FgetDeclaringClass%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Enum/getDeclaringClass/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getDeclaringClass](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FgetDeclaringClass%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)<[Credentials.Status](index.md)>  <br><br><br>
| <a name="kotlin/Enum/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Enum/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>override fun [hashCode](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Enum/toString/#/PointingToDeclaration/"></a>[toString](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Enum/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../../com.tink.model.transfer/[android-jvm]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/Credentials.Status/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-586840090)| <a name="com.tink.model.credentials/Credentials.Status/name/#/PointingToDeclaration/"></a> [androidJvm] val [name](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-586840090): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.model.credentials/Credentials.Status/ordinal/#/PointingToDeclaration/"></a>[ordinal](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-586840090)| <a name="com.tink.model.credentials/Credentials.Status/ordinal/#/PointingToDeclaration/"></a> [androidJvm] val [ordinal](index.md#%5Bcom.tink.model.credentials%2FCredentials.Status%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-586840090): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>

