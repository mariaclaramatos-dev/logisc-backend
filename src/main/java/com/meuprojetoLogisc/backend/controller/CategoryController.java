package com.meuprojetoLogisc.backend.controller;

import com.meuprojetoLogisc.backend.dto.CategoryRequestDTO;
import com.meuprojetoLogisc.backend.dto.CategoryResponseDTO;
import com.meuprojetoLogisc.backend.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategoryResponseDTO> getCategories() {
        return service.getAllCategories();
    }

    @PostMapping
    public CategoryResponseDTO createCategory(
            @Valid @RequestBody CategoryRequestDTO dto
    ) {
        return service.createCategory(dto);
    }
}
