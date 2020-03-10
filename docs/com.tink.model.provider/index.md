[link](../index.md) / [com.tink.model.provider](./index.md)

## Package com.tink.model.provider

### Types

| Name | Summary |
|---|---|
| [Provider](-provider/index.md) | The provider model represents a way of connecting to different banks or other financial institutions in Tink. Multiple providers can exist for the same financial institution, each representing a different type of access the user can choose from. The model contains metadata about the provider which can be used to group and properly display the representations, thus helping the end user make the correct decision on which provider to choose.`data class Provider : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Provider`](-provider/index.md)`>, `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |
| [ProviderTreeNode](-provider-tree-node/index.md) | This class represents a tree structure of [FinancialInstitutionGroupNode](-provider-tree-node/-financial-institution-group-node/index.md) objects with children. This eventually leads to a leaf object of type [CredentialTypeNode](-provider-tree-node/-credential-type-node/index.md), that contains more detailed [Provider](-provider/index.md) data.`sealed class ProviderTreeNode : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html) |

### Extensions for External Classes

| Name | Summary |
|---|---|
| [kotlin.collections.List](kotlin.collections.-list/index.md) |  |
