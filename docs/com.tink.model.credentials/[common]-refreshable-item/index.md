//[link](../../index.md)/[com.tink.model.credentials](../index.md)/[[common]RefreshableItem](index.md)



# RefreshableItem  
 [common] enum [RefreshableItem](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[RefreshableItem](index.md)> 

Refreshable items are a way to limit which types of data should be aggregated from a provider.



Tip: You can use collection operations to quickly define different sets of items, e.g.

val onlyAccounts = RefreshableItem.accounts()  
val everythingExceptTransactions = RefreshableItem.all() - RefreshableItem.transactions()  
val onlyCreditCardData = RefreshableItem.CREDITCARD_ACCOUNTS + RefreshableItem.CREDITCARD_TRANSACTIONS   


## Entries  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/RefreshableItem.CHECKING_ACCOUNTS///PointingToDeclaration/"></a>[CHECKING_ACCOUNTS](-c-h-e-c-k-i-n-g_-a-c-c-o-u-n-t-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.CHECKING_ACCOUNTS///PointingToDeclaration/"></a> [common] [CHECKING_ACCOUNTS](-c-h-e-c-k-i-n-g_-a-c-c-o-u-n-t-s/index.md)("CHECKING_ACCOUNTS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.CHECKING_TRANSACTIONS///PointingToDeclaration/"></a>[CHECKING_TRANSACTIONS](-c-h-e-c-k-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.CHECKING_TRANSACTIONS///PointingToDeclaration/"></a> [common] [CHECKING_TRANSACTIONS](-c-h-e-c-k-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)("CHECKING_TRANSACTIONS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.SAVING_ACCOUNTS///PointingToDeclaration/"></a>[SAVING_ACCOUNTS](-s-a-v-i-n-g_-a-c-c-o-u-n-t-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.SAVING_ACCOUNTS///PointingToDeclaration/"></a> [common] [SAVING_ACCOUNTS](-s-a-v-i-n-g_-a-c-c-o-u-n-t-s/index.md)("SAVING_ACCOUNTS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.SAVING_TRANSACTIONS///PointingToDeclaration/"></a>[SAVING_TRANSACTIONS](-s-a-v-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.SAVING_TRANSACTIONS///PointingToDeclaration/"></a> [common] [SAVING_TRANSACTIONS](-s-a-v-i-n-g_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)("SAVING_TRANSACTIONS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.CREDITCARD_ACCOUNTS///PointingToDeclaration/"></a>[CREDITCARD_ACCOUNTS](-c-r-e-d-i-t-c-a-r-d_-a-c-c-o-u-n-t-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.CREDITCARD_ACCOUNTS///PointingToDeclaration/"></a> [common] [CREDITCARD_ACCOUNTS](-c-r-e-d-i-t-c-a-r-d_-a-c-c-o-u-n-t-s/index.md)("CREDITCARD_ACCOUNTS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.CREDITCARD_TRANSACTIONS///PointingToDeclaration/"></a>[CREDITCARD_TRANSACTIONS](-c-r-e-d-i-t-c-a-r-d_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.CREDITCARD_TRANSACTIONS///PointingToDeclaration/"></a> [common] [CREDITCARD_TRANSACTIONS](-c-r-e-d-i-t-c-a-r-d_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)("CREDITCARD_TRANSACTIONS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.LOAN_ACCOUNTS///PointingToDeclaration/"></a>[LOAN_ACCOUNTS](-l-o-a-n_-a-c-c-o-u-n-t-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.LOAN_ACCOUNTS///PointingToDeclaration/"></a> [common] [LOAN_ACCOUNTS](-l-o-a-n_-a-c-c-o-u-n-t-s/index.md)("LOAN_ACCOUNTS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.LOAN_TRANSACTIONS///PointingToDeclaration/"></a>[LOAN_TRANSACTIONS](-l-o-a-n_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.LOAN_TRANSACTIONS///PointingToDeclaration/"></a> [common] [LOAN_TRANSACTIONS](-l-o-a-n_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)("LOAN_TRANSACTIONS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.INVESTMENT_ACCOUNTS///PointingToDeclaration/"></a>[INVESTMENT_ACCOUNTS](-i-n-v-e-s-t-m-e-n-t_-a-c-c-o-u-n-t-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.INVESTMENT_ACCOUNTS///PointingToDeclaration/"></a> [common] [INVESTMENT_ACCOUNTS](-i-n-v-e-s-t-m-e-n-t_-a-c-c-o-u-n-t-s/index.md)("INVESTMENT_ACCOUNTS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.INVESTMENT_TRANSACTIONS///PointingToDeclaration/"></a>[INVESTMENT_TRANSACTIONS](-i-n-v-e-s-t-m-e-n-t_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.INVESTMENT_TRANSACTIONS///PointingToDeclaration/"></a> [common] [INVESTMENT_TRANSACTIONS](-i-n-v-e-s-t-m-e-n-t_-t-r-a-n-s-a-c-t-i-o-n-s/index.md)("INVESTMENT_TRANSACTIONS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.EINVOICES///PointingToDeclaration/"></a>[EINVOICES](-e-i-n-v-o-i-c-e-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.EINVOICES///PointingToDeclaration/"></a> [common] [EINVOICES](-e-i-n-v-o-i-c-e-s/index.md)("EINVOICES")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.TRANSFER_DESTINATIONS///PointingToDeclaration/"></a>[TRANSFER_DESTINATIONS](-t-r-a-n-s-f-e-r_-d-e-s-t-i-n-a-t-i-o-n-s/index.md)| <a name="com.tink.model.credentials/RefreshableItem.TRANSFER_DESTINATIONS///PointingToDeclaration/"></a> [common] [TRANSFER_DESTINATIONS](-t-r-a-n-s-f-e-r_-d-e-s-t-i-n-a-t-i-o-n-s/index.md)("TRANSFER_DESTINATIONS")  <br>   <br>
| <a name="com.tink.model.credentials/RefreshableItem.IDENTITY_DATA///PointingToDeclaration/"></a>[IDENTITY_DATA](-i-d-e-n-t-i-t-y_-d-a-t-a/index.md)| <a name="com.tink.model.credentials/RefreshableItem.IDENTITY_DATA///PointingToDeclaration/"></a> [common] [IDENTITY_DATA](-i-d-e-n-t-i-t-y_-d-a-t-a/index.md)("IDENTITY_DATA")  <br>   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/RefreshableItem.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.tink.model.credentials/RefreshableItem.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="kotlin/Enum/compareTo/#com.tink.model.credentials.RefreshableItem/PointingToDeclaration/"></a>[compareTo](-i-d-e-n-t-i-t-y_-d-a-t-a/index.md#%5Bkotlin%2FEnum%2FcompareTo%2F%23com.tink.model.credentials.RefreshableItem%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Enum/compareTo/#com.tink.model.credentials.RefreshableItem/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator override fun [compareTo](-i-d-e-n-t-i-t-y_-d-a-t-a/index.md#%5Bkotlin%2FEnum%2FcompareTo%2F%23com.tink.model.credentials.RefreshableItem%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [RefreshableItem](index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Enum/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Enum/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>operator override fun [equals](../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Enum/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Enum/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>override fun [hashCode](../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Enum/toString/#/PointingToDeclaration/"></a>[toString](../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)| <a name="kotlin/Enum/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../../com.tink.model.transfer/[common]-signable-operation/-type/-u-n-k-n-o-w-n/index.md#%5Bkotlin%2FEnum%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1135467963)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials/RefreshableItem/item/#/PointingToDeclaration/"></a>[item](item.md)| <a name="com.tink.model.credentials/RefreshableItem/item/#/PointingToDeclaration/"></a> [common] val [item](item.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.model.credentials/RefreshableItem/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.tink.model.credentials%2FRefreshableItem%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963)| <a name="com.tink.model.credentials/RefreshableItem/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.tink.model.credentials%2FRefreshableItem%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.tink.model.credentials/RefreshableItem/ordinal/#/PointingToDeclaration/"></a>[ordinal](index.md#%5Bcom.tink.model.credentials%2FRefreshableItem%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963)| <a name="com.tink.model.credentials/RefreshableItem/ordinal/#/PointingToDeclaration/"></a> [common] val [ordinal](index.md#%5Bcom.tink.model.credentials%2FRefreshableItem%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1135467963): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>


## Extensions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.tink.model.credentials//plus/com.tink.model.credentials.RefreshableItem#com.tink.model.credentials.RefreshableItem/PointingToDeclaration/"></a>plus| <a name="com.tink.model.credentials//plus/com.tink.model.credentials.RefreshableItem#com.tink.model.credentials.RefreshableItem/PointingToDeclaration/"></a>[common, androidJvm]  <br>Content  <br>[common]  <br>operator fun [RefreshableItem](index.md).[plus](../[common]plus.md)(other: [RefreshableItem](index.md)): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[RefreshableItem](index.md)>  <br>[androidJvm]  <br>operator fun [RefreshableItem](../[android-jvm]-refreshable-item/index.md).[plus](../[android-jvm]plus.md)(other: [RefreshableItem](../[android-jvm]-refreshable-item/index.md)): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[RefreshableItem](../[android-jvm]-refreshable-item/index.md)>  <br><br><br>

