---
title: createTemporaryUser
---
//[link](../../../index.html)/[com.tink.link](../index.html)/[[common]TinkLink](index.html)/[createTemporaryUser](create-temporary-user.html)



# createTemporaryUser



[common]\
fun [createTemporaryUser](create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[User](../../com.tink.model.user/[common]-user/index.html)&gt;): &lt;ERROR CLASS&gt;



Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.



On a successful result, your resultHandler should call [Tink.setUser](../../com.tink.core/[common]-tink/set-user.html) to set this user to the Tink instance.




