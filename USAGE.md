# Usage examples
> Note: The following examples assume the use of Kotlin. If you are working with Java, please note the [small differences](./JAVA_API.md) in usage.
## Creating a user

Creating a user should be the first step when using Tink Link.

### Creating a user with access token

If you have an existing `accessToken`, you can create a `User` instance by passing the `accessToken` as input.

```kotlin
val user = User.fromAccessToken("yourAccessToken")
// Set this user to Tink.
Tink.setUser(user)
```

### Authenticating a permanent user

Creating and authenticating permanent users is limited to our Enterprise customers. A permanent user has the option to add multiple credentials and also refresh manually-refreshable credentials. 
If you wish to support these features in your application, you will need to authenticate your permanent users through Tink Link, as shown below:

1. Create a permanent user and generate a code for the created user by following the steps mentioned in the [permanent user guide](https://docs.tink.com/resources/tutorials/permanent-users).
2. Authenticate your permanent user with the generated code.

```kotlin
Tink.authenticateUser(
    authenticationCode = "yourCode",
    resultHandler = ResultHandler(
        onSuccess = { user: User ->
            // Set this user to the TinkLink instance.
            Tink.setUser(user)
        },
        onError = { error ->
            // Handle error
        }
    )
)
```
### Setting a user to TinkLink instance

Once a permanent user is authenticated, the user must be set passed to `Tink`. Once this is done, you can perform operations related to the user through the `UserContext` object. 
You can access the `UserContext` object through the `Tink.getUserContext()`. Please note that this will return `null` if no user has been set.

```kotlin
Tink.setUser(user)
val userContext = Tink.getUserContext()
```

## Handling user consent

### Getting links to Terms and Conditions and Privacy Policy

In order to show Tink Terms and Conditions and Privacy Policy to the user, you are going to need to:

1. Get the links:

```kotlin
val consentContext = Tink.getConsentContext()
val locale = Locale.ENGLISH // Use the locale of your choice

val termsUri = consentContext.termsAndConditions(locale)
val privacyPolicyUri = consentContext.privacyPolicy(locale)
```

2. Make the contents of the `Uri`'s available to the users, and require the users to give their consent in order to move forward.

### Showing scope descriptions

If aggregating under Tink’s license the user must be informed and fully understand what kind of data will be aggregated before aggregating any data:

```kotlin
val consentContext = Tink.getConsentContext()
consentContext.scopeDescriptions(
    setOf(Scope.AccountsRead, Scope.TransactionsRead), // See the [Scope] class for more scopes
    ResultHandler(
        { list ->
            // Show the list of scope descriptions to the user.
            // The list items contain a title and a description and are of type [ScopeDescription]
            // See the [ScopeDescription] class for further info.
        },
        { error ->
            // Handle error
        }
    )
)
```

## Listing providers

```kotlin
Tink.getUserContext()?.providerRepository.listProviders(
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
    is ValidationResult.ValidationError.MinLengthLimit -> showError(result.errorMessage)
    is ValidationResult.ValidationError.MaxLengthLimit -> showError(result.errorMessage)
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

Tink.getUserContext()?.credentialsRepository.create(
    provider.name,
    provider.credentialsType,
    fieldsMap,
    ResultHandler(
        onSuccess = { credentials ->
            // Start observing the credentials status
        },
        onError = { error ->
            // Handle error
        }
    )
)
```

## Observing credentials
```kotlin
Tink.getUserContext()?.credentialsRepository.listStream().subscribe(
    object : StreamObserver<List<Credentials>> {
        override fun onNext(value: List<Credentials>) {
            // Handle list updates. For example:
            value
                .find { it.id = "idOfYourCredentials" }
                ?.status?.let {
                    when(it) {
                        Credentials.Status.UPDATED -> { /* Done, credentials is added */ }
                        Credentials.Status.UPDATING -> { /* Updating, statusPayload will contain more info */ }

                        Credentials.Status.AWAITING_MOBILE_BANKID_AUTHENTICATION,
                        Credentials.Status.AWAITING_THIRD_PARTY_APP_AUTHENTICATION -> { /* [1] */ }

                        Credentials.Status.TEMPORARY_ERROR,
                        Credentials.Status.AUTHENTICATION_ERROR,
                        Credentials.Status.PERMANENT_ERROR -> { /* Something went wrong, handle error */ }
                        else -> {}
                    }
                }
        }
    }
)
```
`[1]` Follow the [third party authentication guide](/third-party-authentication.md) for handling this flow.



