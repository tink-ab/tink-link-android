---
title: [androidJvm]createTemporaryUser
---
//[link](../../index.html)/[com.tink.link](index.html)/[[androidJvm]createTemporaryUser]([android-jvm]create-temporary-user.html)



# createTemporaryUser



[androidJvm]\
fun [Tink](../com.tink.core/[android-jvm]-tink/index.html).[createTemporaryUser]([android-jvm]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[User](../com.tink.model.user/[android-jvm]-user/index.html)&gt;)



Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.



On a successful result, your resultHandler should call [Tink.setUser](../com.tink.core/[android-jvm]-tink/set-user.html) to set this user to the Tink instance.




