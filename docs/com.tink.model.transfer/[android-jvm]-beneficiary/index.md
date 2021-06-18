//[link](../../index.md)/[com.tink.model.transfer](../index.md)/[[androidJvm]Beneficiary](index.md)



# Beneficiary  
 [androidJvm] data class [Beneficiary](index.md)(**ownerAccountId**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **accountNumber**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **accountNumberType**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)

A beneficiary is a payment or transfer destination account which has been authorized by the bank. Each beneficiary belongs to an account, which means that the given account can send money to that beneficiary.



However, different banks treat beneficiaries in different ways. Some treat them as fully trusted, meaning no signing at all is required when transferring money to the beneficiary. Other banks treat them more as address books of registered recipients.

   


## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a>ownerAccountId| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a><br><br>The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)<br><br>
| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a>accountNumber| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a><br><br>The account number for the beneficiary. The structure of this field depends on the [accountNumberType](account-number-type.md).<br><br>
| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a>accountNumberType| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a><br><br>The type of the [accountNumber](account-number.md) that this beneficiary has. See [AccountNumberTypes](-account-number-types/index.md) for supported types.<br><br>
| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a>name| <a name="com.tink.model.transfer/Beneficiary///PointingToDeclaration/"></a><br><br>The name chosen by the user for this beneficiary.<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.transfer/Beneficiary/Beneficiary/#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[Beneficiary](-beneficiary.md)| <a name="com.tink.model.transfer/Beneficiary/Beneficiary/#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a> [androidJvm] fun [Beneficiary](-beneficiary.md)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.transfer/Beneficiary.AccountNumberTypes///PointingToDeclaration/"></a>[AccountNumberTypes](-account-number-types/index.md)| <a name="com.tink.model.transfer/Beneficiary.AccountNumberTypes///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [AccountNumberTypes](-account-number-types/index.md)  <br>More info  <br>The supported types for the [accountNumber](account-number.md) that this beneficiary has.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.transfer/Beneficiary/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.model.transfer/Beneficiary/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.transfer/Beneficiary/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.model.transfer/Beneficiary/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.transfer/Beneficiary/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.model.transfer/Beneficiary/component3/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component3](component3.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.transfer/Beneficiary/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.tink.model.transfer/Beneficiary/component4/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component4](component4.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.transfer/Beneficiary/copy/#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.model.transfer/Beneficiary/copy/#kotlin.String#kotlin.String#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(ownerAccountId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumber: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accountNumberType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Beneficiary](index.md)  <br><br><br>
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.transfer/Beneficiary/accountNumber/#/PointingToDeclaration/"></a>[accountNumber](account-number.md)| <a name="com.tink.model.transfer/Beneficiary/accountNumber/#/PointingToDeclaration/"></a> [androidJvm] val [accountNumber](account-number.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The account number for the beneficiary.   <br>
| <a name="com.tink.model.transfer/Beneficiary/accountNumberType/#/PointingToDeclaration/"></a>[accountNumberType](account-number-type.md)| <a name="com.tink.model.transfer/Beneficiary/accountNumberType/#/PointingToDeclaration/"></a> [androidJvm] val [accountNumberType](account-number-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The type of the [accountNumber](account-number.md) that this beneficiary has.   <br>
| <a name="com.tink.model.transfer/Beneficiary/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.tink.model.transfer/Beneficiary/name/#/PointingToDeclaration/"></a> [androidJvm] val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The name chosen by the user for this beneficiary.   <br>
| <a name="com.tink.model.transfer/Beneficiary/ownerAccountId/#/PointingToDeclaration/"></a>[ownerAccountId](owner-account-id.md)| <a name="com.tink.model.transfer/Beneficiary/ownerAccountId/#/PointingToDeclaration/"></a> [androidJvm] val [ownerAccountId](owner-account-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The internal identifier of the account that this beneficiary belongs to, see [Account.id](../../com.tink.model.account/[android-jvm]-account/id.md)   <br>
| <a name="com.tink.model.transfer/Beneficiary/uri/#/PointingToDeclaration/"></a>[uri](uri.md)| <a name="com.tink.model.transfer/Beneficiary/uri/#/PointingToDeclaration/"></a> [androidJvm] val [uri](uri.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

