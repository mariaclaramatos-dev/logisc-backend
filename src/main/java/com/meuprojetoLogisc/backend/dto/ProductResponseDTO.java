package com.meuprojetoLogisc.backend.dto;

public class ProductResponseDTO {

    private Long id;
    private String name;
    private Double price;
    private String categoryName;

    public ProductResponseDTO(Long id, String name, Double price, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategoryName(){
        return categoryName;
    }
}
