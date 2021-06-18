//[link](../../index.md)/[com.tink.model.consent](../index.md)/[[common]OAuthClientDescription](index.md)/[OAuthClientDescription](-o-auth-client-description.md)



# OAuthClientDescription  
[common]  
Content  
fun [OAuthClientDescription](-o-auth-client-description.md)(clientName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientIconUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), verified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), aggregator: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), scopeDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ScopeDescription](../[common]-scope-description/index.md)>)  
More info  


## Parameters  
  
common  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>clientName| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a><br><br>: The name of the application specified by the client when creating it in the console.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>clientUrl| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a><br><br>: A url specified by the client for additional information. Can be empty.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>clientIconUrl| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a><br><br>: A url for a client icon. Can be empty.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>scopeDescriptions| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a><br><br>: A list of [ScopeDescription](../[common]-scope-description/index.md)s describing which financial info is going to be collected.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>verified| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a><br><br>: Indicates whether the app is verified or not. If it is unverified, the user should be cautious when sharing financial data.<br><br>
| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a>aggregator| <a name="com.tink.model.consent/OAuthClientDescription/OAuthClientDescription/#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Boolean#kotlin.collections.List[com.tink.model.consent.ScopeDescription]/PointingToDeclaration/"></a><br><br>: Describes whether the client is aggregating data under their own or under Tink's license.<br><br>
  
  



