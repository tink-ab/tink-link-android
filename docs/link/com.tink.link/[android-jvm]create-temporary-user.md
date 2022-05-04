---
title: [androidJvm]createTemporaryUser
---
//[link](../../index.html)/[com.tink.link](index.html)/[[androidJvm]createTemporaryUser]([android-jvm]create-temporary-user.html)



# createTemporaryUser



[androidJvm]\
fun Tink.[createTemporaryUser]([android-jvm]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: ResultHandler&lt;User&gt;)



Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.



On a successful result, your resultHandler should call Tink.setUser to set this user to the Tink instance.




