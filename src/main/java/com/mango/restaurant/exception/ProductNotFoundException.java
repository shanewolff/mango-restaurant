package com.mango.restaurant.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Integer id) {
        super(String.format("No product found with id %d.", id));
    }
}
