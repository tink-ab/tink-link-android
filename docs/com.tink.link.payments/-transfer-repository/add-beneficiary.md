[link](../../index.md) / [com.tink.link.payments](../index.md) / [TransferRepository](index.md) / [addBeneficiary](./add-beneficiary.md)

# addBeneficiary

`abstract fun addBeneficiary(ownerAccountId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, credentialsId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, streamObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`AddBeneficiaryStatus`](../-add-beneficiary-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Add a new beneficiary

``` kotlin
Tink.getTransferRepository().addBeneficiary(
    ownerAccountId = account.id,
    credentialsId = account.credentialsId,
    accountNumberType = "iban",
    accountNumber = "FR7630006000011234567890189",
    name = "Beneficiary name",
    streamObserver = object : StreamObserver<AddBeneficiaryStatus> {
        override fun onNext(value: AddBeneficiaryStatus) {
            when (value) {
                is AddBeneficiaryStatus.Loading -> {
                    // Show loading state
                }

                is AddBeneficiaryStatus.Success -> {
                    // Show success state
                }

                is AddBeneficiaryStatus.AwaitingAuthentication -> {
                    handleAuthenticationTask(value.authenticationTask)
                }
            }
        }

        override fun onError(error: Throwable) {
            // Show error state
        }
    }
)
```

`abstract fun addBeneficiary(ownerAccount: `[`Account`](../../com.tink.model.account/-account/index.md)`, accountNumber: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, accountNumberType: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, streamObserver: `[`StreamObserver`](../../com.tink.service.streaming.publisher/-stream-observer/index.md)`<`[`AddBeneficiaryStatus`](../-add-beneficiary-status/index.md)`>): `[`StreamSubscription`](../../com.tink.service.streaming.publisher/-stream-subscription/index.md)

Add a new beneficiary

