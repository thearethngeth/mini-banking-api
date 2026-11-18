package com.example.bank.dto;

import com.example.bank.entity.AccountType;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccountRequest {
    @NotNull
    private Long customerId;

    @NotNull
    private AccountType type;
}