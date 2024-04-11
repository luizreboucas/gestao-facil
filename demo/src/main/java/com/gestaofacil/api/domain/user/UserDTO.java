package com.gestaofacil.api.domain.user;

import com.gestaofacil.api.domain.company.Company;
import com.gestaofacil.api.domain.company.CompanyRepository;
import com.gestaofacil.api.utils.RoleEnum;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
        Long user_id,
        RoleEnum role,
        @NotNull
        String name,
        @NotNull
        String email,
        Company company,
        @NotNull
        String password,
        @NotNull
        String cpf,
        String phone_number) {
    public UserDTO(User user){
        this(user.getUser_id(),
                user.getRole(),
                user.getName(),
                user.getEmail(),
                user.getCompany(),
                user.getPassword(),
                user.getCpf(),
                user.getPhone_number());
    }
}
