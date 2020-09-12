package com.mango.restaurant.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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
}
