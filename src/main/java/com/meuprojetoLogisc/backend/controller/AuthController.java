package com.meuprojetoLogisc.backend.controller;

import com.meuprojetoLogisc.backend.dto.LoginRequestDTO;
import com.meuprojetoLogisc.backend.dto.LoginResponseDTO;
import com.meuprojetoLogisc.backend.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public LoginResponseDTO login(
            @Valid @RequestBody LoginRequestDTO dto
    ) {
        return service.login(dto);
    }
}
