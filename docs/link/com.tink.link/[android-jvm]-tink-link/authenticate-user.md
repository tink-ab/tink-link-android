---
title: authenticateUser
---
//[link](../../../index.html)/[com.tink.link](../index.html)/[[androidJvm]TinkLink](index.html)/[authenticateUser](authenticate-user.html)



# authenticateUser



[androidJvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [authenticateUser](authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[android-jvm]-user/index.html)&gt;)



Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call [Tink.setUser](../../com.tink.core/[android-jvm]-tink/set-user.html) to set this user to Tink.




