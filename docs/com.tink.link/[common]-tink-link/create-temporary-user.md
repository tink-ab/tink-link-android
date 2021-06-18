//[link](../../index.md)/[com.tink.link](../index.md)/[[common]TinkLink](index.md)/[createTemporaryUser](create-temporary-user.md)



# createTemporaryUser  
[common]  
Content  
fun [createTemporaryUser](create-temporary-user.md)(market: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.md)<[User](../../com.tink.model.user/[common]-user/index.md)>): <ERROR CLASS>  
More info  


Create a temporary user. This allows you to launch the flow and fetch data for users without having permanent Tink users.



On a successful result, your resultHandler should call [Tink.setUser](../../com.tink.core/[common]-tink/set-user.md) to set this user to the Tink instance.

  



