---
title: [androidJvm]ConsentContext
---
//[link](../../../index.html)/[com.tink.link.consent](../index.html)/[[androidJvm]ConsentContext](index.html)



# ConsentContext



[androidJvm]\
class [ConsentContext](index.html)(consentService: [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.html), dispatcher: CoroutineDispatcher)

Context for handling things around user consent.



## Constructors


| | |
|---|---|
| [ConsentContext](-consent-context.html) | [androidJvm]<br>@Inject<br>fun [ConsentContext](-consent-context.html)(consentService: [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.html)) |
| [ConsentContext](-consent-context.html) | [androidJvm]<br>fun [ConsentContext](-consent-context.html)(consentService: [ConsentService](../../com.tink.service.consent/[android-jvm]-consent-service/index.html), dispatcher: CoroutineDispatcher) |


## Functions


| Name | Summary |
|---|---|
| [describeClient](describe-client.html) | [androidJvm]<br>fun [describeClient](describe-client.html)(scopes: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Scope](../../com.tink.model.user/[android-jvm]-scope/index.html)&gt;, resultHandler: [ResultHandler](../../com.tink.service.handler/[android-jvm]-result-handler/index.html)&lt;[OAuthClientDescription](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.html)&gt;)<br>Get the [client description](../../com.tink.model.consent/[android-jvm]-o-auth-client-description/index.html) for a client with the provided scopes. |
| [privacyPolicy](privacy-policy.html) | [androidJvm]<br>fun [privacyPolicy](privacy-policy.html)(locale: [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) = Locale.getDefault(), showChromeless: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)<br>Get a link to the Privacy Policy for Tink Link. |
| [termsAndConditions](terms-and-conditions.html) | [androidJvm]<br>fun [termsAndConditions](terms-and-conditions.html)(locale: [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) = Locale.getDefault(), showChromeless: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)<br>Get a link to the Terms & Conditions for Tink Link. |

