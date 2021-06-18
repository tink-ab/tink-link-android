//[link](../../index.md)/[com.tink.service.handler](../index.md)/[[androidJvm]ResultHandler](index.md)



# ResultHandler  
 [androidJvm] class [ResultHandler](index.md)<[T](index.md)>(**onSuccess**: ([T](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), **onError**: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

This is the basic wrapper for asynchronous callbacks in TinkLink.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.handler/ResultHandler/ResultHandler/#androidx.core.util.Consumer[TypeParam(bounds=[kotlin.Any?])]#androidx.core.util.Consumer[kotlin.Throwable]/PointingToDeclaration/"></a>[ResultHandler](-result-handler.md)| <a name="com.tink.service.handler/ResultHandler/ResultHandler/#androidx.core.util.Consumer[TypeParam(bounds=[kotlin.Any?])]#androidx.core.util.Consumer[kotlin.Throwable]/PointingToDeclaration/"></a> [androidJvm] fun <[T](index.md)> [ResultHandler](-result-handler.md)(onSuccess: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)<[T](index.md)>, onError: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)<[Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)>)Convenience constructor for use in Java.   <br>
| <a name="com.tink.service.handler/ResultHandler/ResultHandler/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]/PointingToDeclaration/"></a>[ResultHandler](-result-handler.md)| <a name="com.tink.service.handler/ResultHandler/ResultHandler/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),kotlin.Unit]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]/PointingToDeclaration/"></a> [androidJvm] fun <[T](index.md)> [ResultHandler](-result-handler.md)(onSuccess: ([T](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))Creates a new result handler with success and error callbacks.   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.tink.service.user/[android-jvm]-user-profile-service-impl/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1854938400)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.handler/ResultHandler/onError/#/PointingToDeclaration/"></a>[onError](on-error.md)| <a name="com.tink.service.handler/ResultHandler/onError/#/PointingToDeclaration/"></a> [androidJvm] val [onError](on-error.md): ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)   <br>
| <a name="com.tink.service.handler/ResultHandler/onSuccess/#/PointingToDeclaration/"></a>[onSuccess](on-success.md)| <a name="com.tink.service.handler/ResultHandler/onSuccess/#/PointingToDeclaration/"></a> [androidJvm] val [onSuccess](on-success.md): ([T](index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)   <br>

