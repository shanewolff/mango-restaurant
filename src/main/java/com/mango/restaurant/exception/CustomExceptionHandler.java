package com.mango.restaurant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomExceptionHandler {
    @ResponseBody
    @ExceptionHandler(SupplierNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    APIException handleSupplierNotFound(SupplierNotFoundException exception) {
        return new APIException("SupplierNotFoundException", exception.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    APIException handleProductNotFound(ProductNotFoundException exception) {
        return new APIException("ProductNotFoundException", exception.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(DBException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    APIException handleDBException(DBException exception) {
        return new APIException("DBException", exception.getMessage());
    }
}
