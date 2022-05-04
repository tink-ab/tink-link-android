---
title: [common]ConsentContext
---
//[link](../../../index.html)/[com.tink.link.consent](../index.html)/[[common]ConsentContext](index.html)



# ConsentContext



[common]\
class [ConsentContext](index.html)(consentService: [ConsentService](../../com.tink.service.consent/[common]-consent-service/index.html), dispatcher: &lt;ERROR CLASS&gt;)

Context for handling things around user consent.



## Constructors


| | |
|---|---|
| [ConsentContext](-consent-context.html) | [common]<br>fun [ConsentContext](-consent-context.html)(consentService: [ConsentService](../../com.tink.service.consent/[common]-consent-service/index.html)) |
| [ConsentContext](-consent-context.html) | [common]<br>fun [ConsentContext](-consent-context.html)(consentService: [ConsentService](../../com.tink.service.consent/[common]-consent-service/index.html), dispatcher: &lt;ERROR CLASS&gt;) |


## Functions


| Name | Summary |
|---|---|
| [describeClient](describe-client.html) | [common]<br>fun [describeClient](describe-client.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[common]-scope/index.html)&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[common]-result-handler/index.html)&lt;[OAuthClientDescription](../../com.tink.model.consent/[common]-o-auth-client-description/index.html)&gt;)<br>Get the [client description](../../com.tink.model.consent/[common]-o-auth-client-description/index.html) for a client with the provided scopes. |
| [privacyPolicy](privacy-policy.html) | [common]<br>fun [privacyPolicy](privacy-policy.html)(locale: &lt;ERROR CLASS&gt; = Locale.getDefault(), showChromeless: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): &lt;ERROR CLASS&gt;<br>Get a link to the Privacy Policy for Tink Link. |
| [termsAndConditions](terms-and-conditions.html) | [common]<br>fun [termsAndConditions](terms-and-conditions.html)(locale: &lt;ERROR CLASS&gt; = Locale.getDefault(), showChromeless: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): &lt;ERROR CLASS&gt;<br>Get a link to the Terms & Conditions for Tink Link. |

