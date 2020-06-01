[link](../../index.md) / [com.tink.service.di](../index.md) / [ServiceComponent](./index.md)

# ServiceComponent

`@Component([NormalClass(value=com/tink/service/network/NetworkModule), NormalClass(value=com/tink/service/di/ServiceModule)]) abstract class ServiceComponent`

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `interface Builder` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ServiceComponent()` |

### Properties

| Name | Summary |
|---|---|
| [accountService](account-service.md) | `abstract val accountService: `[`AccountService`](../../com.tink.service.account/-account-service/index.md) |
| [consentService](consent-service.md) | `abstract val consentService: `[`ConsentService`](../../com.tink.service.consent/-consent-service/index.md) |
| [credentialsService](credentials-service.md) | `abstract val credentialsService: `[`CredentialsService`](../../com.tink.service.credentials/-credentials-service/index.md) |
| [providerService](provider-service.md) | `abstract val providerService: `[`ProviderService`](../../com.tink.service.provider/-provider-service/index.md) |
| [tinkConfiguration](tink-configuration.md) | `abstract val tinkConfiguration: `[`TinkConfiguration`](../../com.tink.service.network/-tink-configuration/index.md) |
| [transferService](transfer-service.md) | `abstract val transferService: `[`TransferService`](../../com.tink.service.transfer/-transfer-service/index.md) |
| [userEventBus](user-event-bus.md) | `abstract val userEventBus: `[`UserEventBus`](../../com.tink.service.authentication/-user-event-bus/index.md) |
| [userService](user-service.md) | `abstract val userService: `[`UserService`](../../com.tink.service.authorization/-user-service/index.md) |
