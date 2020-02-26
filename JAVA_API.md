# Java API
Tink Link is written in Kotlin and the main entry points are realized with extension functions. The API is best used from Kotlin, but if you are bound to use Java, there are small differences when calling different functions:

|Function            | in Kotlin                                      | in Java                                           |
|--------------------|------------------------------------------------|---------------------------------------------------|
|Get the user context|`Tink.getUserContext()`                         |`TinkLink.getUserContext()`                        |
|Authorize the user  |`Tink.authenticateUser(code, resultHandler)`    |`TinkLink.authenticateUser(code, resultHandler)`   | 


