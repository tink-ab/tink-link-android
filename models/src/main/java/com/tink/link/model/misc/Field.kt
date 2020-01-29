package com.tink.link.model.misc

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * This model represents a specific input, usually as a text field) that the user needs to fill during the authentication flow.
 *
 * @property name The name of the field, serving as an identifier
 * @property value The current value for the field, fetched from the backend service
 * @property validationRules The rules that determine whether the user input for the field is valid
 * @property attributes The attributes of the field used to set up the field input view for the user
 */
@Parcelize
data class Field(
    val name: String,
    val value: String,
    val validationRules: ValidationRules,
    val attributes: Attributes
) : Parcelable {

    /**
     * Represents rules that determine whether the user input for a field is valid.
     *
     * @property maxLength The maximum allowed length for the user input
     * @property minLength The minimum allowed length for the user input
     * @property pattern The regex pattern allowed for the user input
     * @property patternError A user-friendly text describing an error where the user input did not match the [pattern]
     * @property isOptional Indicates whether the user input is optional
     */
    @Parcelize
    data class ValidationRules(
        val maxLength: Int,
        val minLength: Int,
        val pattern: String,
        val patternError: String,
        val isOptional: Boolean
    ) : Parcelable {

        /**
         * Validates the user input for a field.
         *
         * @param fieldName The [name] of the field being validated
         * @param value The user input for the field
         *
         * @return An instance of [ValidationResult], either [ValidationResult.Valid] or [ValidationResult.ValidationError].
         */
        fun validate(fieldName: String, value: String): ValidationResult =
            if (value.isEmpty() && isOptional) {
                ValidationResult.Valid
            } else if (pattern.isNotEmpty() && !pattern.toRegex().matches(value)) {
                ValidationResult.ValidationError.Invalid(fieldName, patternError)
            } else if (maxLength > 0 && value.length > maxLength) {
                ValidationResult.ValidationError.MaxLengthLimit(fieldName, maxLength)
            } else if (minLength > 0 && value.length < minLength) {
                ValidationResult.ValidationError.MinLengthLimit(fieldName, minLength)
            } else {
                ValidationResult.Valid
            }
    }

    /**
     * Represents the result of a validation of the user input for a field.
     * It can be either one of two types depending upon whether the user input was valid or not.
     * If the user input is valid, the result is [ValidationResult.Valid]
     * If the user input is invalid, the result is [ValidationResult.ValidationError]
     */
    sealed class ValidationResult {
        /**
         * Represents the type of [ValidationResult] when the user input is valid.
         */
        object Valid : ValidationResult()

        /**
         * Represents the type of [ValidationResult] when the user input is invalid.
         */
        sealed class ValidationError : ValidationResult() {
            /** The [name] of the field */
            abstract val fieldName: String

            /** A user-friendly message describing the validation error */
            val errorMessage: String?
                get() = when (this) {
                    is Invalid -> patternError
                    is MinLengthLimit -> "Length did not exceed min length: $minLength"
                    is MaxLengthLimit -> "Length exceeded max length: $maxLength"
                }

            /**
             * Represents an error where the user input was too short, below the minimum allowed length.
             *
             * @property minLength The minimum allowed length for the user input
             */
            data class MinLengthLimit(
                override val fieldName: String,
                val minLength: Int
            ) : ValidationError()

            /**
             * Represents an error where the user input was too long, above the maximum allowed length.
             *
             * @property maxLength The maximum allowed length for the user input
             */
            data class MaxLengthLimit(
                override val fieldName: String,
                val maxLength: Int
            ) : ValidationError()

            /**
             * Represents an error where the user input did not match the [ValidationRules.pattern].
             *
             * @property patternError The [patternError] text to be shown to the user
             */
            data class Invalid(
                override val fieldName: String,
                val patternError: String
            ) : ValidationError()
        }
    }

    /**
     * Represents the attributes of the field used to set up the field input view for the user.
     *
     * @property description The text explaining what should be inside the field.
     * @property hint The text giving the user a suggestion of how the input would look (e.g. YYYYMMDDNNNN for SSN)
     * @property helpText Additional information, possibly longer, to guide the user in adding input. This might be empty.
     * @property inputType Contains information about the input type for this field that can be applied to the field input view.
     */
    @Parcelize
    data class Attributes(
        val description: String,
        val hint: String,
        val helpText: String,
        val inputType: InputType
    ) : Parcelable

    /**
     * Represents information about the input type for the field that can be applied to the field input view.
     *
     * @property isMasked Indicates whether the user input for the field should be masked (e.g. A password field)
     * @property isNumeric Indicates whether the expected input for the field is only numeric, so that a numeric keyboard can be shown to the user
     * @property isImmutable Indicates whether the field input view is editable.
     */
    @Parcelize
    data class InputType(
        val isMasked: Boolean,
        val isNumeric: Boolean,
        val isImmutable: Boolean
    ) : Parcelable

    /**
     * Validates the [value] of the field using the [ValidationRules]
     *
     * @return A [ValidationResult] object
     */
    fun validate() = validationRules.validate(name, value)
}
