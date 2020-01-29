# Usage examples

## Creating a user

Creating a user should be the first step when using Tink Link.

### Creating a user with access token

If you have an existing `accessToken`, you can create a `User` instance and pass the `accessToken` as input.

```kotlin
val user = User(accessToken = "yourAccessToken")
// Set this user to the TinkLink instance.
tinkLink.setUser(user)
```

### Authenticating a permanent user

Creating and authenticating permanent users is limited to our Enterprise customers. A permanent user has the option to add multiple credentials and also refresh manually-refreshable credentials. 
If you wish to support these features in your application, you will need to authenticate your permanent users through Tink Link, as shown below:

1. Create a permanent user and generate a code for the created user by following the steps mentioned in the [permanent user guide](https://docs.tink.com/resources/tutorials/permanent-users).
2. Authenticate your permanent user with the generated code.

```kotlin
tinkLink.authenticateUser(
            authenticationCode = "yourCode",
            resultHandler = ResultHandler(
                onSuccess = { user: User ->
                    // Set this user to the TinkLink instance.
                    tinkLink.setUser(user)
                },
                onError = { error ->
                    // Handle error
                }
            )
        )
```
### Setting a user to TinkLink instance

Once a permanent user is authenticated, the user must be set to the `tinkLink` instance. Once this is done, you can perform operations related to the user through the `UserContext` object. 
You can access the `UserContext` object through the `tinkLink` instance by calling `tinkLink.getUserContext()`. Please note that this will return `null` if no user has been set.

```kotlin
tinkLink.setUser(user)
val userContext = tinkLink.getUserContext()
```

## Listing providers

```kotlin
tinkLink.getUserContext()?.providerRepository.listProviders(
    ResultHandler(
        onSuccess = { list ->
            // Proceed with using the provider list, for example:
            yourAdapter.items = list
        },
        onError = { error ->
            // Handle error
        }
    )
)
```

## Field setup and validation

The Tink platform will specify how certain values are supposed to be filled by the user. For a good UX, make sure to validate input on the frontend and return helpful hints.

### Setup inputs for field specifications from the `Provider`
```kotlin
// Choose a provider from the list
val provider = providerList.first()

// Setup fields
val inputFields = 
    provider.fields.map { field ->
        val editText = TextInputEditText(context).apply {
        
            // Prefill text
            setText(field.value)
            
            // Determine input type
            if (field.attributes.inputType.isNumeric) {
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            if (field.attributes.inputType.isMasked) {
                transformationMethod = PasswordTransformationMethod.getInstance()
            }
            
            // Set maximum length
            filters = arrayOf(InputFilter.LengthFilter(field.validationRules.maxLength))
            
            // Fields might be immutable, meant for displaying data only
            enabled = !(field.attributes.inputType.isImmutable && field.value.isNotEmpty())
        }
        
        val helpView = TextView(context).apply {
            text = field.attributes.helpText
        }
        
        TextInputLayout(context).apply {
            hint = field.attributes.description
            helperText = field.attributes.hint +
                field.attributes.helpText.takeUnless { it.isEmpty() }?.let { "\n\n$it" }.orEmpty()
            //or create your own view for the help text
            
            addView(editText) // [1]
        }
    }
```
`[1]` _Note: This is for demonstration purpose only. Programmatically creating and adding views like here is not advisable. A real implementation should use a `RecyclerView` or similar best practise._

### Validate fields

```kotlin
// Fill fields with user input
val filledField = field.copy(value = inputField.text.toString())

// Validate fields
val result = filledField.validate()

when(result) {
    ValidationResult.Valid -> print(result) // Valid field input
    is ValidationResult.ValidationError.MinLengthLimit -> showError(result.errorMessage),
    is ValidationResult.ValidationError.MaxLengthLimit -> showError(result.errorMessage),
    is ValidationResult.ValidationError.Invalid -> showError(result.errorMessage)
}

fun showError(message: String) {
    inputField.error = message
}
```

## Creating credentials
```kotlin

// Convert your field list to a map
val fieldsMap = yourFilledFieldsList.associate { it.name to it.value }

tinkLink.getUserContext()?.credentialRepository.create(
    provider.name,
    provider.credentialType,
    fieldsMap,
    ResultHandler(
        onSuccess = { credential ->
            // Start observing the credential status
        },
        onError = { error ->
            // Handle error
        }
    )
)
```

## Observing credentials
```kotlin
tinkLink.getUserContext()?.credentialRepository.listStream().subscribe(
    object : StreamObserver<List<Credential>> {
        override fun onNext(value: List<Credential>) {
            // Handle list updates. For example:
            value
                .find { it.id = "idOfYourCredential" }
                ?.status?.let {
                    when(it) {
                        Credential.Status.UPDATED -> { /* Done, credential is added */ }
                        Credential.Status.UPDATING -> { /* Updating, statusPayload will contain more info */ }

                        Credential.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
                        Credential.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION -> { /* [1] */ }

                        Credential.Status.TEMPORARY_ERROR,
                        Credential.Status.AUTHENTICATION_ERROR,
                        Credential.Status.PERMANENT_ERROR -> { /* Something went wrong, handle error */ }
                        else -> {}
                    }
                }
        }
    }
)
```
[1] Follow the [third party authentication guide](/third-party-authentication.md) for handling this flow.



