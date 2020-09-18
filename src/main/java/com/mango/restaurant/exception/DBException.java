package com.mango.restaurant.exception;

public class DBException extends APIException {

    public DBException() {
        super("DBException", "A database related error has been occurred.");
    }

    public DBException(String description) {
        super("DBException", description);
    }
}
