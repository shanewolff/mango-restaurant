package com.mango.restaurant.exception;

public class ProductNotFoundException extends APIException {
    public ProductNotFoundException(Integer id) {
        super("ProductNotFoundAPIException", String.format("No product found with id %d", id));
    }
}
