package com.meuprojetoLogisc.backend.service;

import com.meuprojetoLogisc.backend.dto.LoginRequestDTO;
import com.meuprojetoLogisc.backend.dto.LoginResponseDTO;
import com.meuprojetoLogisc.backend.entity.User;
import com.meuprojetoLogisc.backend.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthService(
            UserRepository repository,
            PasswordEncoder passwordEncoder,
            JwtService jwtService
    ) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public LoginResponseDTO login(LoginRequestDTO dto) {

        User user = repository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));

        boolean passwordMatches = passwordEncoder.matches(
                dto.getPassword(),
                user.getPassword()
        );

        if (!passwordMatches) {
            throw new RuntimeException("Invalid email or password");
        }

        String token =
                jwtService.generateToken(
                        user.getEmail()
                );

        return new LoginResponseDTO(token);
    }
}
