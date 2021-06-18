---
title: [androidJvm]InsightAction -
---
//[link](../../index.md)/[com.tink.model.insights](../index.md)/[[androidJvm]InsightAction](index.md)



# InsightAction  
 [androidJvm] data class [InsightAction](index.md)(**label**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **actionType**: [InsightAction.Type](-type/index.md), **data**: [InsightAction.Data](-data/index.md)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.insights/InsightAction.Data///PointingToDeclaration/"></a>[Data](-data/index.md)| <a name="com.tink.model.insights/InsightAction.Data///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>sealed class [Data](-data/index.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)  <br>More info  <br>All subclasses should be data classes or provide a meaningful equals() function  <br><br><br>
| <a name="com.tink.model.insights/InsightAction.Type///PointingToDeclaration/"></a>[Type](-type/index.md)| <a name="com.tink.model.insights/InsightAction.Type///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>enum [Type](-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[InsightAction.Type](-type/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.insights/InsightAction/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.tink.model.insights/InsightAction/component1/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component1](component1.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.tink.model.insights/InsightAction/component2/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component2](component2.md)(): [InsightAction.Type](-type/index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.tink.model.insights/InsightAction/component3/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [component3](component3.md)(): [InsightAction.Data](-data/index.md)  <br><br><br>
| <a name="com.tink.model.insights/InsightAction/copy/#kotlin.String#com.tink.model.insights.InsightAction.Type#com.tink.model.insights.InsightAction.Data/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.tink.model.insights/InsightAction/copy/#kotlin.String#com.tink.model.insights.InsightAction.Type#com.tink.model.insights.InsightAction.Data/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [copy](copy.md)(label: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), actionType: [InsightAction.Type](-type/index.md), data: [InsightAction.Data](-data/index.md)): [InsightAction](index.md)  <br><br><br>
| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/describeContents/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [describeContents](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FdescribeContents%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator override fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)| <a name="android.os/Parcelable/writeToParcel/#android.os.Parcel#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [writeToParcel](../../com.tink.service.provider/[android-jvm]-provider-filter/index.md#%5Bandroid.os%2FParcelable%2FwriteToParcel%2F%23android.os.Parcel%23kotlin.Int%2FPointingToDeclaration%2F%5D%2FFunctions%2F-586840090)(p0: [Parcel](https://developer.android.com/reference/kotlin/android/os/Parcel.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.insights/InsightAction/actionType/#/PointingToDeclaration/"></a>[actionType](action-type.md)| <a name="com.tink.model.insights/InsightAction/actionType/#/PointingToDeclaration/"></a> [androidJvm] val [actionType](action-type.md): [InsightAction.Type](-type/index.md)   <br>
| <a name="com.tink.model.insights/InsightAction/data/#/PointingToDeclaration/"></a>[data](data.md)| <a name="com.tink.model.insights/InsightAction/data/#/PointingToDeclaration/"></a> [androidJvm] val [data](data.md): [InsightAction.Data](-data/index.md)   <br>
| <a name="com.tink.model.insights/InsightAction/label/#/PointingToDeclaration/"></a>[label](label.md)| <a name="com.tink.model.insights/InsightAction/label/#/PointingToDeclaration/"></a> [androidJvm] val [label](label.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

