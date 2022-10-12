---
title: [androidJvm]authenticateUser
---
//[link](../../index.html)/[com.tink.link](index.html)/[[androidJvm]authenticateUser]([android-jvm]authenticate-user.html)



# authenticateUser



[androidJvm]\
fun Tink.[authenticateUser]([android-jvm]authenticate-user.html)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)



Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call Tink.setUser to set this user to Tink.




