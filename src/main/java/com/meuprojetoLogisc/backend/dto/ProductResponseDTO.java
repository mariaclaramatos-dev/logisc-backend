package com.meuprojetoLogisc.backend.dto;

public class ProductResponseDTO {

    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String categoryName;

    public ProductResponseDTO(Long id, String name, Double price, String categoryName, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryName = categoryName;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }
}
