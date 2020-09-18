package com.mango.restaurant.exception;

public class APIException {
    final String exception;
    final String message;

    public APIException(String exception, String message) {
        this.exception = exception;
        this.message = message;
    }

    public String getException() {
        return exception;
    }

    public String getMessage() {
        return message;
    }
}
