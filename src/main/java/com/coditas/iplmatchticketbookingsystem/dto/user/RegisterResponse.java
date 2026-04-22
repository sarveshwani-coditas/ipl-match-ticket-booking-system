package com.coditas.iplmatchticketbookingsystem.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RegisterResponse {

    private  Integer id;

    private String name;

    private String username;

    private String email;

    private String role;
}
