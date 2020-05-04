[link](../../index.md) / [com.tink.rest.models](../index.md) / [Account](index.md) / [accountExclusion](./account-exclusion.md)

# accountExclusion

`var accountExclusion: AccountExclusionEnum`

Indicates features this account should be excluded from. Possible values are: &#x60;NONE&#x60;: No features are excluded from this account, &#x60;PFM_DATA&#x60;: Personal Finance Management Features, like statistics and activities are excluded, &#x60;PFM_AND_SEARCH&#x60;: Personal Finance Management Features are excluded, and transactions belonging to this account are not searchable. This is the equivalent of the, now deprecated, boolean flag &#39;excluded&#39;, &#x60;AGGREGATION&#x60;: No data will be aggregated for this account and, all data associated with the account is removed (except account name and account number). This property can be updated in a update account request.

### Property

`accountExclusion` - Indicates features this account should be excluded from. Possible values are: &#x60;NONE&#x60;: No features are excluded from this account, &#x60;PFM_DATA&#x60;: Personal Finance Management Features, like statistics and activities are excluded, &#x60;PFM_AND_SEARCH&#x60;: Personal Finance Management Features are excluded, and transactions belonging to this account are not searchable. This is the equivalent of the, now deprecated, boolean flag &#39;excluded&#39;, &#x60;AGGREGATION&#x60;: No data will be aggregated for this account and, all data associated with the account is removed (except account name and account number). This property can be updated in a update account request.