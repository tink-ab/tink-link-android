package com.tink.link.payments.sample.credentials

import android.content.Context
import android.text.InputFilter
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.updatePadding
import com.tink.link.payments.sample.R
import com.tink.model.misc.Field
import kotlinx.android.synthetic.main.tink_view_credentials_field.view.*
import kotlinx.android.synthetic.main.tink_view_credentials_field_immutable.view.*

internal interface CredentialsField {
    fun setupField(field: Field)
    fun validateContent(): Boolean
    fun getFilledField(): Field
}

internal class MutableCredentialsField : LinearLayout, CredentialsField {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    lateinit var field: Field

    init {
        inflate(R.layout.tink_view_credentials_field, true)
        orientation = VERTICAL
    }

    override fun setupField(field: Field) {
        this.field = field
        updatePadding(bottom = resources.getDimensionPixelSize(R.dimen.tink_credentials_field_padding_bottom))
        textInputLayout.hint = field.attributes.description +
            " (optional)".takeIf { field.validationRules.isOptional }.orEmpty()

        textInputLayout.placeholderText = field.attributes.hint

        textInputLayout.helperText = field.attributes.helpText

        textInputEditText.apply {
            setText(field.value)

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

    override fun validateContent(): Boolean =
        getFilledField().validate()
            .also {
                textInputLayout.error =
                    if (it is Field.ValidationResult.ValidationError) it.errorMessage else null
            }
            .let { it == Field.ValidationResult.Valid }

    override fun getFilledField(): Field {
        return field.copy(value = textInputEditText.text.toString())
    }
}

internal class ImmutableCredentialsField : ConstraintLayout, CredentialsField {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    lateinit var field: Field

    init {
        inflate(R.layout.tink_view_credentials_field_immutable, true)
    }

    override fun setupField(field: Field) {
        this.field = field
        updatePadding(bottom = resources.getDimensionPixelSize(R.dimen.tink_credentials_field_padding_bottom))
        description.text = field.attributes.description
        filledValue.text = field.value
        helpText.text = field.attributes.helpText
    }

    override fun validateContent(): Boolean = true

    override fun getFilledField(): Field = field
}
