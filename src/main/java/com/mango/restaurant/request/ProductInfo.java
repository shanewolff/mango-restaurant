package com.mango.restaurant.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProductInfo {
    private String code;
    private String name;
    private String category;
    @NotBlank
    private String description;
    private String quantity;
    private Float stockLevel;
    private Integer supplierId;
}
