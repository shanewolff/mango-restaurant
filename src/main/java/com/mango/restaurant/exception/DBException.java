package com.mango.restaurant.exception;

public class DBException extends RuntimeException {

    public DBException() {
        super("A database related error has been occurred.");
    }

    public DBException(String description) {
        super(description);
    }
}
