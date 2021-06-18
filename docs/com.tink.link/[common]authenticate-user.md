//[link](../index.md)/[com.tink.link](index.md)/[[common]authenticateUser]([common]authenticate-user.md)



# authenticateUser  
[common]  
Content  
fun [Tink](../com.tink.core/[common]-tink/index.md).[authenticateUser]([common]authenticate-user.md)(authenticationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), resultHandler: [ResultHandler](../com.tink.service.handler/[common]-result-handler/index.md)<[User](../com.tink.model.user/[common]-user/index.md)>): <ERROR CLASS>  
More info  


Authenticate an existing user with an authentication code.



On a successful result, your resultHandler should call [Tink.setUser](../com.tink.core/[common]-tink/set-user.md) to set this user to Tink.

  



