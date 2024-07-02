package com.booksproject.api.domain.lib;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record DeleteBook(
        @NotNull
        @NotBlank
        @NotEmpty
        String id) {

}
