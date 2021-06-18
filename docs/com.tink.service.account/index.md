//[link](../index.md)/[com.tink.service.account](index.md)



# Package com.tink.service.account  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.account/AccountService///PointingToDeclaration/"></a>AccountService| <a name="com.tink.service.account/AccountService///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>interface [AccountService]([common]-account-service/index.md)  <br>[androidJvm]  <br>interface [AccountService]([android-jvm]-account-service/index.md)  <br><br><br>
| <a name="com.tink.service.account/AccountServiceImpl///PointingToDeclaration/"></a>AccountServiceImpl| <a name="com.tink.service.account/AccountServiceImpl///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>class [AccountServiceImpl]([common]-account-service-impl/index.md)constructor(**api**: <ERROR CLASS>) : [AccountService]([common]-account-service/index.md)  <br>[androidJvm]  <br>class [AccountServiceImpl]([android-jvm]-account-service-impl/index.md)@Inject()constructor(**api**: AccountApi) : [AccountService]([android-jvm]-account-service/index.md)  <br><br><br>
| <a name="com.tink.service.account/UpdateAccountDescriptor///PointingToDeclaration/"></a>UpdateAccountDescriptor| <a name="com.tink.service.account/UpdateAccountDescriptor///PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>data class [UpdateAccountDescriptor]([common]-update-account-descriptor/index.md)(**id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **excluded**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **favored**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **ownership**: [ExactNumber](../com.tink.model.misc/[common]-exact-number/index.md)?, **type**: [Account.Type](../com.tink.model.account/[common]-account/-type/index.md)?)  <br>[androidJvm]  <br>data class [UpdateAccountDescriptor]([android-jvm]-update-account-descriptor/index.md)(**id**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **excluded**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **favored**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?, **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **ownership**: [ExactNumber](../com.tink.model.misc/[android-jvm]-exact-number/index.md)?, **type**: [Account.Type](../com.tink.model.account/[android-jvm]-account/-type/index.md)?)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.service.account//toCoreModel/#/PointingToDeclaration/"></a>toCoreModel| <a name="com.tink.service.account//toCoreModel/#/PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>fun <ERROR CLASS>.[toCoreModel](to-core-model.md)(): [Account](../com.tink.model.account/[common]-account/index.md)  <br>[androidJvm]  <br>fun Account.[toCoreModel]([android-jvm]to-core-model.md)(): [Account](../com.tink.model.account/[android-jvm]-account/index.md)  <br><br><br>

