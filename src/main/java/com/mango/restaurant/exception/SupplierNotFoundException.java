package com.mango.restaurant.exception;

public class SupplierNotFoundException extends APIException {
    public SupplierNotFoundException(Integer id) {
        super("SupplierNotFoundException", String.format("No supplier found with id %d", id));
    }
}
