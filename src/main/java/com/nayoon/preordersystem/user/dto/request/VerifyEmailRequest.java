package com.nayoon.preordersystem.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record VerifyEmailRequest(
    @NotBlank
    String email,
    @NotBlank
    String code
) {

}
