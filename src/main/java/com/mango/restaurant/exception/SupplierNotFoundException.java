package com.mango.restaurant.exception;

public class SupplierNotFoundException extends RuntimeException {
    public SupplierNotFoundException(Integer id) {
        super(String.format("No supplier found with id %d.", id));
    }
}
