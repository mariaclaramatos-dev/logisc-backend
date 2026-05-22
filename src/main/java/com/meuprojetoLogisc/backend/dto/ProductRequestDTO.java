package com.meuprojetoLogisc.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProductRequestDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Positive(message = "Price must be positive")
    private Double price;

    private Long categoryId;

    private Integer quantity;

    public Long getCategoryId(){
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setCategoryId(Long categoryId){
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}