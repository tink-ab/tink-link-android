---
title: authenticateUser
---
//[link](../../../index.html)/[com.tink.link](../index.html)/[[androidJvm]TinkLink](index.html)/[authenticateUser](authenticate-user.html)



# authenticateUser



[androidJvm]\




@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)



fun [authenticateUser](authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)



Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call Tink.setUser to set this user to Tink.




