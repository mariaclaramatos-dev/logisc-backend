package com.meuprojetoLogisc.backend.service;

import com.meuprojetoLogisc.backend.dto.ProductRequestDTO;
import com.meuprojetoLogisc.backend.dto.ProductResponseDTO;
import com.meuprojetoLogisc.backend.entity.Product;
import com.meuprojetoLogisc.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;
import com.meuprojetoLogisc.backend.entity.Category;
import com.meuprojetoLogisc.backend.repository.CategoryRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository repository, CategoryRepository categoryRepository) {
        this.repository = repository;
        this.categoryRepository = categoryRepository;
    }

    public List<ProductResponseDTO> getAllProducts() {
        return repository.findAll().
                stream()
                .map(product -> new ProductResponseDTO(
                        product.getId(),
                        product.getName(),
                        product.getPrice(),
                        product.getCategory().getName()
                ))
                .toList();
    }

    public ProductResponseDTO getProductById(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getCategory().getName()
        );
    }

    public ProductResponseDTO createProduct(ProductRequestDTO dto) {

        Category category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Product product = new Product();

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCategory(category);

        Product savedProduct = repository.save(product);

        return new ProductResponseDTO(
                savedProduct.getId(),
                savedProduct.getName(),
                savedProduct.getPrice(),
                savedProduct.getCategory().getName()
        );
    }

    public ProductResponseDTO updateProduct(
            Long id,
            ProductRequestDTO dto
    ) {

        Category category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCategory(category);

        Product updatedProduct = repository.save(product);

        return new ProductResponseDTO(
                updatedProduct.getId(),
                updatedProduct.getName(),
                updatedProduct.getPrice(),
                updatedProduct.getCategory().getName()
        );
    }

    public void deleteProduct(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        repository.delete(product);
    }
}