---
title: requireUserContext -
---
//[link](../../index.md)/[com.tink.link](../index.md)/[[androidJvm]TinkLink](index.md)/[requireUserContext](require-user-context.md)



# requireUserContext  
[androidJvm]  
Content  
@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)()  
  
fun [requireUserContext](require-user-context.md)(): [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.md)  
More info  


Fetches the [UserContext](../../com.tink.link.core.user/[android-jvm]-user-context/index.md) from Tink if a user is set.



If no user is set, this will throw an [IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html)

  



