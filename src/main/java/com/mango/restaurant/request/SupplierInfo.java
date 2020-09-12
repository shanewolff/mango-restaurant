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
public class SupplierInfo {
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    private String email;
    @NotBlank
    private String contact;
}
