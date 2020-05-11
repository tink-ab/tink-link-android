package com.tink.sample.credentials

import android.content.Context
import android.text.InputFilter
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.widget.LinearLayout
import com.tink.sample.extensions.inflate
import com.tink.model.misc.Field
import com.tink.sample.R
import kotlinx.android.synthetic.main.view_credentials_field.view.*

class CredentialsField : LinearLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    lateinit var field: Field

    init {
        inflate(R.layout.view_credentials_field, true)
        orientation = VERTICAL
    }

    fun setupField(field: Field) {
        this.field = field
        description.text = field.attributes.description +
                " (optional)".takeIf { field.validationRules.isOptional }.orEmpty()

        textInputLayout.helperText = field.attributes.helpText

        textInputEditText.apply {
            setText(field.value)
            hint = field.attributes.hint

            if (field.attributes.inputType.isNumeric) {
                inputType = InputType.TYPE_CLASS_NUMBER
            }

            if (field.attributes.inputType.isMasked) {
                transformationMethod = PasswordTransformationMethod.getInstance()
            }

            field.validationRules.maxLength
                .takeIf { it != 0 }
                ?.let { filters += InputFilter.LengthFilter(it) }

            isEnabled = !(field.attributes.inputType.isImmutable && field.value.isNotEmpty())
        }
    }

    fun validateContent(): Boolean =
        getFilledField().validate()
            .also {
                textInputLayout.error =
                    if (it is Field.ValidationResult.ValidationError) it.errorMessage else null
            }
            .let { it == Field.ValidationResult.Valid }


    fun getFilledField(): Field {
        return field.copy(value = textInputEditText.text.toString())
    }
}