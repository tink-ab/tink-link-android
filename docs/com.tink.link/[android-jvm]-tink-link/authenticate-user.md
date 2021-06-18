---
title: authenticateUser -
---
//[link](../../index.md)/[com.tink.link](../index.md)/[[androidJvm]TinkLink](index.md)/[authenticateUser](authenticate-user.md)



# authenticateUser  
[androidJvm]  
Content  
@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)()  
  
fun [authenticateUser](authenticate-user.md)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[User](../../com.tink.model.user/[android-jvm]-user/index.md)>)  
More info  


Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call [Tink.setUser](../../com.tink.core/[android-jvm]-tink/set-user.md) to set this user to Tink.

  



