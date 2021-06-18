//[link](../../index.md)/[com.tink.link](../index.md)/[[androidJvm]TinkLink](index.md)/[createTemporaryUser](create-temporary-user.md)



# createTemporaryUser  
[androidJvm]  
Content  
fun [createTemporaryUser](create-temporary-user.md)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[User](../../com.tink.model.user/[android-jvm]-user/index.md)>)  
More info  


Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.



On a successful result, your resultHandler should call [Tink.setUser](../../com.tink.core/[android-jvm]-tink/set-user.md) to set this user to the Tink instance.

  



