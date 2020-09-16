package com.mango.restaurant.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    Integer id;

    @Column(name = "code", length = 20)
    String code;

    @Column(name = "name", length = 45)
    String name;

    @Column(name = "category", length = 45)
    String category;

    @Column(name = "description", length = 100)
    String description;

    @Column(name = "quantity", length = 45)
    String quantity;

    @Column(name = "stock_level")
    Float stockLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    public Product() {
    }

    public Product(Integer id, String code, String name, String category, String description, String quantity, Float stockLevel, Supplier supplier) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.category = category;
        this.description = description;
        this.quantity = quantity;
        this.stockLevel = stockLevel;
        this.supplier = supplier;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
