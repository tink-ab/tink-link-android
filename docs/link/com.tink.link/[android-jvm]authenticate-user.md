---
title: [androidJvm]authenticateUser
---
//[link](../../index.html)/[com.tink.link](index.html)/[[androidJvm]authenticateUser]([android-jvm]authenticate-user.html)



# authenticateUser



[androidJvm]\
fun [Tink](../com.tink.core/[android-jvm]-tink/index.html).[authenticateUser]([android-jvm]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[User](../com.tink.model.user/[android-jvm]-user/index.html)&gt;)



Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call [Tink.setUser](../com.tink.core/[android-jvm]-tink/set-user.html) to set this user to Tink.




