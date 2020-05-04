[link](../index.md) / [com.tink.service.credentials](./index.md)

## Package com.tink.service.credentials

### Types

| Name | Summary |
|---|---|
| [CredentialsAuthenticateDescriptor](-credentials-authenticate-descriptor/index.md) | `data class CredentialsAuthenticateDescriptor` |
| [CredentialsCreationDescriptor](-credentials-creation-descriptor/index.md) | `data class CredentialsCreationDescriptor` |
| [CredentialsRefreshDescriptor](-credentials-refresh-descriptor/index.md) | `data class CredentialsRefreshDescriptor` |
| [CredentialsService](-credentials-service/index.md) | `interface CredentialsService` |
| [CredentialsUpdateDescriptor](-credentials-update-descriptor/index.md) | `data class CredentialsUpdateDescriptor` |

### Functions

| Name | Summary |
|---|---|
| [createThirdPartyAuthFromAutostartToken](create-third-party-auth-from-autostart-token.md) | `fun createThirdPartyAuthFromAutostartToken(autostartToken: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`ThirdPartyAppAuthentication`](../com.tink.model.authentication/-third-party-app-authentication/index.md)`?` |
| [toCoreModel](to-core-model.md) | `fun ThirdPartyAuthentication.toCoreModel(): `[`ThirdPartyAppAuthentication`](../com.tink.model.authentication/-third-party-app-authentication/index.md)<br>`fun TypeEnum.toCoreModel(): Type`<br>`fun StatusEnum.toCoreModel(): Status` |
