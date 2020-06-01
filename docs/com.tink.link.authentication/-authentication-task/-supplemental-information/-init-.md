[link](../../../index.md) / [com.tink.link.authentication](../../index.md) / [AuthenticationTask](../index.md) / [SupplementalInformation](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SupplementalInformation(credentials: `[`Credentials`](../../../com.tink.model.credentials/-credentials/index.md)`)`

Indicates that there is additional information required from the user to proceed. This can
for example be an OTP sent via SMS or authetication app.
First the [fields](fields.md) should be made accessible to the user for example as text input fields.
Then [submit](submit.md) should be called as soon as the fields have been validated and the user is
ready to send the information.

