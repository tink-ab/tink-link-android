[link](../../index.md) / [com.tink.rest.models](../index.md) / [Market](./index.md)

# Market

`@JsonClass(true) data class Market`

### Types

| Name | Summary |
|---|---|
| [CodeEnum](-code-enum/index.md) | The ISO 3166-1 alpha-2 country code of the market. Values: AT, AU, BE, BG, BR, CA, CY, CZ, DE, DK, EE, ES, FI, FO, FR, GB, GR, HR, HU, IE, IN, IT, LU, LV, MT, MX, NL, NO, NZ, PL, PT, RO, SE, SG, SI, SK, UK, US`enum class CodeEnum` |
| [GdprLoginMethodsEnum](-gdpr-login-methods-enum/index.md) | Values: BANKID, EMAIL_AND_PASSWORD, SMS_OTP_AND_PIN6, PHONE_NUMBER_AND_PIN6, ABN_AMRO_PIN5, CHALLENGE_RESPONSE, NON_VALID`enum class GdprLoginMethodsEnum` |
| [LoginMethodsEnum](-login-methods-enum/index.md) | Values: BANKID, EMAIL_AND_PASSWORD, SMS_OTP_AND_PIN6, PHONE_NUMBER_AND_PIN6, ABN_AMRO_PIN5, CHALLENGE_RESPONSE, NON_VALID`enum class LoginMethodsEnum` |
| [RegisterMethodsEnum](-register-methods-enum/index.md) | Values: BANKID, EMAIL_AND_PASSWORD, SMS_OTP_AND_PIN6, PHONE_NUMBER_AND_PIN6, ABN_AMRO_PIN5, CHALLENGE_RESPONSE, NON_VALID`enum class RegisterMethodsEnum` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Market(code: CodeEnum, currencies: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Currency`](../-currency/index.md)`>, defaultCurrency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, defaultLocale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, defaultTimeZone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suggested: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, registerMethods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<RegisterMethodsEnum>? = null, loginMethods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<LoginMethodsEnum>? = null, gdprLoginMethods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<GdprLoginMethodsEnum>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [code](code.md) | The ISO 3166-1 alpha-2 country code of the market.`var code: CodeEnum` |
| [currencies](currencies.md) | The applicable currencies available in the market.`var currencies: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Currency`](../-currency/index.md)`>` |
| [defaultCurrency](default-currency.md) | The ISO 4217 code of the default currency.`var defaultCurrency: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [defaultLocale](default-locale.md) | The default locale in the market.`var defaultLocale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [defaultTimeZone](default-time-zone.md) | The default time zone in the market.`var defaultTimeZone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [description](description.md) | The display name of the market`var description: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [gdprLoginMethods](gdpr-login-methods.md) | `var gdprLoginMethods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<GdprLoginMethodsEnum>?` |
| [loginMethods](login-methods.md) | `var loginMethods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<LoginMethodsEnum>?` |
| [registerMethods](register-methods.md) | `var registerMethods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<RegisterMethodsEnum>?` |
| [suggested](suggested.md) | Flag to indicate if this is the suggested market for the user.`var suggested: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
