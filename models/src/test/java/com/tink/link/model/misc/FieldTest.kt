package com.tink.link.model.misc

import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FieldTest {

    private val ssnValidationRules =
        Field.ValidationRules(
            maxLength = 12,
            minLength = 12,
            pattern = "(19|20)[0-9]{10}",
            patternError = "Please enter a valid social security number.",
            isOptional = false
        )
    private val passwordValidationRules =
        Field.ValidationRules(
            maxLength = 4,
            minLength = 0,
            pattern = "([0-9]{4})?",
            patternError = "Please enter four digits.",
            isOptional = false
        )
    private val optionalValidationRules =
        Field.ValidationRules(
            maxLength = 8,
            minLength = 4,
            pattern = "",
            patternError = "",
            isOptional = true
        )
    private val lengthValidationRules =
        Field.ValidationRules(
            maxLength = 8,
            minLength = 4,
            pattern = "",
            patternError = "",
            isOptional = false
        )
    private val mockRules = mockk<Field.ValidationRules>()

    private val mockAttributes = mockk<Field.Attributes>()

    private val field = Field(
        name = "",
        value = "",
        validationRules = mockRules,
        attributes = mockAttributes
    )
    private val ssnField = field.copy(validationRules = ssnValidationRules)
    private val passwordField = field.copy(validationRules = passwordValidationRules)
    private val optionalField = field.copy(validationRules = optionalValidationRules)
    private val fieldWithLengthRules = field.copy(validationRules = lengthValidationRules)

    @Test
    fun `ssn field with invalid pattern returns invalid error`() {
        val result = ssnField.copy(value = "111111111111").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.Invalid)
    }

    @Test
    fun `ssn field with text returns invalid error`() {
        val result = ssnField.copy(value = "this is an invalid text value").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.Invalid)
    }

    @Test
    fun `ssn field with value less than minimum length is considered as invalid pattern`() {
        val result = ssnField.copy(value = "2012").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.Invalid)
    }

    @Test
    fun `ssn field with value longer than maximum limit is considered as invalid pattern`() {
        val result = ssnField.copy(value = "2012081512345678").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.Invalid)
    }

    @Test
    fun `ssn field with valid value produces Valid result`() {
        val result = ssnField.copy(value = "201208151234").validate()
        assertTrue(result is Field.ValidationResult.Valid)
    }

    @Test
    fun `password field with zero minimum length limit can have empty values`() {
        val result = passwordField.copy(value = "").validate()
        assertTrue(result is Field.ValidationResult.Valid)
    }

    @Test
    fun `optional field value doesn't have to be set`() {
        val result = optionalField.validate()
        assertTrue(result is Field.ValidationResult.Valid)
    }

    @Test
    fun `optional field can have empty values`() {
        val result = optionalField.copy(value = "").validate()
        assertTrue(result is Field.ValidationResult.Valid)
    }

    @Test
    fun `optional field with value longer than maximum limit produces maximum length error`() {
        val result = optionalField.copy(value = "111111111111").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.MaxLengthLimit)
    }

    @Test
    fun `optional value less than minimum length produces minimum length error`() {
        val result = optionalField.copy(value = "11").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.MinLengthLimit)
    }

    @Test
    fun `field with length rules and value longer than maximum limit produces maximum length error`() {
        val result = fieldWithLengthRules.copy(value = "111111111111").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.MaxLengthLimit)
    }

    @Test
    fun `field with length rules and value less than minimum length produces minimum length error`() {
        val result = fieldWithLengthRules.copy(value = "11").validate()
        assertTrue(result is Field.ValidationResult.ValidationError.MinLengthLimit)
    }
}