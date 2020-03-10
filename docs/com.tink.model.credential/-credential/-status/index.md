[link](../../../index.md) / [com.tink.model.credential](../../index.md) / [Credential](../index.md) / [Status](./index.md)

# Status

`enum class Status`

Represents the status of the credential.

When data is being fetched/updated from a [Provider](../../../com.tink.model.provider/-provider/index.md), the status of the credential can change to indicate the current state of the flow.
You can observe the credentials and act upon changes in the status if the [statusUpdated](../status-updated.md) value is greater than what it was previously.

### Enum Values

| Name | Summary |
|---|---|
| [UNKNOWN](-u-n-k-n-o-w-n.md) |  |
| [CREATED](-c-r-e-a-t-e-d.md) |  |
| [AUTHENTICATING](-a-u-t-h-e-n-t-i-c-a-t-i-n-g.md) |  |
| [UPDATING](-u-p-d-a-t-i-n-g.md) |  |
| [UPDATED](-u-p-d-a-t-e-d.md) |  |
| [TEMPORARY_ERROR](-t-e-m-p-o-r-a-r-y_-e-r-r-o-r.md) |  |
| [AUTHENTICATION_ERROR](-a-u-t-h-e-n-t-i-c-a-t-i-o-n_-e-r-r-o-r.md) |  |
| [PERMANENT_ERROR](-p-e-r-m-a-n-e-n-t_-e-r-r-o-r.md) |  |
| [AWAITING_MOBILE_BANKID_AUTHENTICATION](-a-w-a-i-t-i-n-g_-m-o-b-i-l-e_-b-a-n-k-i-d_-a-u-t-h-e-n-t-i-c-a-t-i-o-n.md) |  |
| [AWAITING_THIRD_PARTY_APP_AUTHENTICATION](-a-w-a-i-t-i-n-g_-t-h-i-r-d_-p-a-r-t-y_-a-p-p_-a-u-t-h-e-n-t-i-c-a-t-i-o-n.md) |  |
| [AWAITING_SUPPLEMENTAL_INFORMATION](-a-w-a-i-t-i-n-g_-s-u-p-p-l-e-m-e-n-t-a-l_-i-n-f-o-r-m-a-t-i-o-n.md) |  |
| [SESSION_EXPIRED](-s-e-s-s-i-o-n_-e-x-p-i-r-e-d.md) |  |
| [DISABLED](-d-i-s-a-b-l-e-d.md) |  |
