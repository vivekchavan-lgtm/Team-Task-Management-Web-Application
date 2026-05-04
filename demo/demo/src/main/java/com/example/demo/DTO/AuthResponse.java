package com.example.demo.DTO;

import lombok.*;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
}
