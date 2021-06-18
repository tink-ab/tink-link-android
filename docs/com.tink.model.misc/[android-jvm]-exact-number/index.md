---
title: [androidJvm]ExactNumber -
---
//[link](../../index.md)/[com.tink.model.misc](../index.md)/[[androidJvm]ExactNumber](index.md)



# ExactNumber  
 [androidJvm] data class [ExactNumber](index.md)(**unscaledValue**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), **scale**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) : [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)<[ExactNumber](index.md)> , [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/ExactNumber/ExactNumber/#kotlin.Double/PointingToDeclaration/"></a>[ExactNumber](-exact-number.md)| <a name="com.tink.model.misc/ExactNumber/ExactNumber/#kotlin.Double/PointingToDeclaration/"></a> [androidJvm] fun [ExactNumber](-exact-number.md)(double: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))   <br>
| <a name="com.tink.model.misc/ExactNumber/ExactNumber/#kotlin.Long/PointingToDeclaration/"></a>[ExactNumber](-exact-number.md)| <a name="com.tink.model.misc/ExactNumber/ExactNumber/#kotlin.Long/PointingToDeclaration/"></a> [androidJvm] fun [ExactNumber](-exact-number.md)(long: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))   <br>
| <a name="com.tink.model.misc/ExactNumber/ExactNumber/#java.math.BigDecimal/PointingToDeclaration/"></a>[ExactNumber](-exact-number.md)| <a name="com.tink.model.misc/ExactNumber/ExactNumber/#java.math.BigDecimal/PointingToDeclaration/"></a> [androidJvm] fun [ExactNumber](-exact-number.md)(bigDecimal: [BigDecimal](https://developer.android.com/reference/kotlin/java/math/BigDecimal.html))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/ExactNumber/compareTo/#com.tink.model.misc.ExactNumber/PointingToDeclaration/"></a>[compareTo](compare-to.md)| <a name="com.tink.model.misc/ExactNumber/compareTo/#com.tink.model.misc.ExactNumber/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [compareTo](compare-to.md)(other: [ExactNumber](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.model.misc/ExactNumber/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.model.misc/ExactNumber/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br><br><br>
| <a name="com.tink.model.misc/ExactNumber/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.model.misc/ExactNumber/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br><br><br>
| <a name="com.tink.model.misc/ExactNumber/copy/#kotlin.Long#kotlin.Long/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.model.misc/ExactNumber/copy/#kotlin.Long#kotlin.Long/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(unscaledValue: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), scale: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [ExactNumber](index.md)  <br><br><br>
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.tink.model.misc/ExactNumber/toBigDecimal/#/PointingToDeclaration/"></a>[toBigDecimal](to-big-decimal.md)| <a name="com.tink.model.misc/ExactNumber/toBigDecimal/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [toBigDecimal](to-big-decimal.md)(): [BigDecimal](https://developer.android.com/reference/kotlin/java/math/BigDecimal.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.misc/ExactNumber/scale/#/PointingToDeclaration/"></a>[scale](scale.md)| <a name="com.tink.model.misc/ExactNumber/scale/#/PointingToDeclaration/"></a> [androidJvm] val [scale](scale.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)   <br>
| <a name="com.tink.model.misc/ExactNumber/unscaledValue/#/PointingToDeclaration/"></a>[unscaledValue](unscaled-value.md)| <a name="com.tink.model.misc/ExactNumber/unscaledValue/#/PointingToDeclaration/"></a> [androidJvm] val [unscaledValue](unscaled-value.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)   <br>

