[link](../../index.md) / [com.tink.core](../index.md) / [TinkComponent](./index.md)

# TinkComponent

`@Component([NormalClass(value=com/tink/service/network/NetworkModule), NormalClass(value=com/tink/service/ServiceModule)]) @Singleton abstract class TinkComponent`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TinkComponent()` |

### Properties

| Name | Summary |
|---|---|
| [consentService](consent-service.md) | `abstract val consentService: `[`ConsentService`](../../com.tink.service.consent/-consent-service/index.md) |
| [credentialService](credential-service.md) | `abstract val credentialService: `[`CredentialService`](../../com.tink.service.credential/-credential-service/index.md) |
| [providerRepository](provider-repository.md) | `abstract val providerRepository: `[`ProviderRepository`](../../com.tink.core.provider/-provider-repository/index.md) |
| [tinkConfiguration](tink-configuration.md) | `abstract val tinkConfiguration: `[`TinkConfiguration`](../../com.tink.service.network/-tink-configuration/index.md) |
| [userEventBus](user-event-bus.md) | `abstract val userEventBus: `[`UserEventBus`](../../com.tink.service.authentication/-user-event-bus/index.md) |
| [userService](user-service.md) | `abstract val userService: `[`UserService`](../../com.tink.service.authorization/-user-service/index.md) |
