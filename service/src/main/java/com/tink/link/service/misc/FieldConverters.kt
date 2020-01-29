package com.tink.link.service.misc

import se.tink.grpc.v1.models.ProviderFieldSpecification
import com.tink.link.model.misc.Field

internal typealias ProviderFieldSpecificationDTO = ProviderFieldSpecification

internal fun ProviderFieldSpecificationDTO.toField() =
    Field(
        name = name,
        value = value,
        validationRules = Field.ValidationRules(
            maxLength = maxLength,
            minLength = minLength,
            pattern = pattern,
            patternError = patternError,
            isOptional = optional
        ),
        attributes = Field.Attributes(
            description = description,
            hint = hint,
            helpText = helpText,
            inputType = Field.InputType(
                isMasked = masked,
                isNumeric = numeric,
                isImmutable = immutable
            )
        )
    )

fun List<Field>.toFieldMap() = map { it.name to it.value }.toMap()