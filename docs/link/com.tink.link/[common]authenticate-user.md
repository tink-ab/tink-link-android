---
title: [common]authenticateUser
---
//[link](../../index.html)/[com.tink.link](index.html)/[[common]authenticateUser]([common]authenticate-user.html)



# authenticateUser



[common]\
fun [Tink](../com.tink.core/[common]-tink/index.html).[authenticateUser]([common]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../com.tink.service.handler/[common]-result-handler/index.html)&lt;[User](../com.tink.model.user/[common]-user/index.html)&gt;): &lt;ERROR CLASS&gt;



Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call [Tink.setUser](../com.tink.core/[common]-tink/set-user.html) to set this user to Tink.




