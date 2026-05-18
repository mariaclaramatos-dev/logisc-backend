package com.meuprojetoLogisc.backend.service;

import com.meuprojetoLogisc.backend.dto.CategoryRequestDTO;
import com.meuprojetoLogisc.backend.dto.CategoryResponseDTO;
import com.meuprojetoLogisc.backend.entity.Category;
import com.meuprojetoLogisc.backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<CategoryResponseDTO> getAllCategories() {

        return repository.findAll()
                .stream()
                .map(category -> new CategoryResponseDTO(
                        category.getId(),
                        category.getName()
                ))
                .toList();
    }

    public CategoryResponseDTO createCategory(
            CategoryRequestDTO dto
    ) {

        Category category = new Category();

        category.setName(dto.getName());

        Category savedCategory = repository.save(category);

        return new CategoryResponseDTO(
                savedCategory.getId(),
                savedCategory.getName()
        );
    }
}
