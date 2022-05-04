---
title: init
---
//[link](../../../index.html)/[com.tink.core](../index.html)/[[androidJvm]Tink](index.html)/[init](init.html)



# init



[androidJvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [init](init.html)(config: [TinkConfiguration](../../com.tink.service.network/[android-jvm]-tink-configuration/index.html), context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))



Initializes Tink in the application and should be called before the usage of Tink components. This should only be called once.



## Throws


| | |
|---|---|
| [kotlin.IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html) | Thrown if this method is called more than once. |



