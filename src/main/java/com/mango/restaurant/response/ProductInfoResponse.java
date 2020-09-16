package com.mango.restaurant.response;


public class ProductInfoResponse {
    private Integer id;
    private String code;
    private String name;
    private String category;
    private String description;
    private String quantity;
    private Float stockLevel;
    private Integer supplierId;
    private String supplierName;

    public ProductInfoResponse() {
    }

    public ProductInfoResponse(Integer id, String code, String name, String category, String description, String quantity, Float stockLevel, Integer supplierId, String supplierName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
        this.stockLevel = stockLevel;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
