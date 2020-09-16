package com.mango.restaurant.request;


import javax.validation.constraints.NotBlank;

public class ProductInfo {
    private String code;
    private String name;
    private String category;
    @NotBlank
    private String description;
    private String quantity;
    private Float stockLevel;
    private Integer supplierId;

    public ProductInfo() {
    }

    public ProductInfo(String code, String name, String category, @NotBlank String description, String quantity, Float stockLevel, Integer supplierId) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
        this.stockLevel = stockLevel;
        this.supplierId = supplierId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Float getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Float stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}
