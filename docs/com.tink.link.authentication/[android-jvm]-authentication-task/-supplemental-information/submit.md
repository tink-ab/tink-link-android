---
title: submit -
---
//[link](../../../index.md)/[com.tink.link.authentication](../../index.md)/[[androidJvm]AuthenticationTask](../index.md)/[SupplementalInformation](index.md)/[submit](submit.md)



# submit  
[androidJvm]  
Content  
fun [submit](submit.md)(filledFields: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, resultHandler: [ResultHandler](../../../com.tink.service.handler/[android-jvm]-result-handler/index.md)<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>)  
More info  


Submit supplemental information for the authentication to Tink. Should be called as soon as the fields have been validated and the user is ready to send the information.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.link.authentication/AuthenticationTask.SupplementalInformation/submit/#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a>filledFields| <a name="com.tink.link.authentication/AuthenticationTask.SupplementalInformation/submit/#kotlin.collections.Map[kotlin.String,kotlin.String]#com.tink.service.handler.ResultHandler[kotlin.Unit]/PointingToDeclaration/"></a><br><br>A key-value map of the supplemental information. The key should always be [Field.name](../../../com.tink.model.misc/[android-jvm]-field/name.md) from [fields](fields.md) and the value should be the user input of that field.<br><br>
  
  



