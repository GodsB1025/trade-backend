package com.hscoderadar.domain.auth.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailFindRequest(@NotBlank @Email String email) {
}
