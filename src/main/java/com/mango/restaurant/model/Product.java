package com.mango.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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
}
