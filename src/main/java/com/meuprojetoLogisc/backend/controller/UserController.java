package com.meuprojetoLogisc.backend.controller;

import com.meuprojetoLogisc.backend.dto.UserRequestDTO;
import com.meuprojetoLogisc.backend.dto.UserResponseDTO;
import com.meuprojetoLogisc.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserResponseDTO> getUsers() {
        return service.getAllUsers();
    }

    @PostMapping
    public UserResponseDTO createUser(
            @Valid @RequestBody UserRequestDTO dto
    ) {
        return service.createUser(dto);
    }
}
