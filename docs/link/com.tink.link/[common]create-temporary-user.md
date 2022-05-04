---
title: [common]createTemporaryUser
---
//[link](../../index.html)/[com.tink.link](index.html)/[[common]createTemporaryUser]([common]create-temporary-user.html)



# createTemporaryUser



[common]\
fun &lt;ERROR CLASS&gt;.[createTemporaryUser]([common]create-temporary-user.html)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: &lt;ERROR CLASS&gt;&lt;&lt;ERROR CLASS&gt;&gt;): &lt;ERROR CLASS&gt;



Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.



On a successful result, your resultHandler should call Tink.setUser to set this user to the Tink instance.




