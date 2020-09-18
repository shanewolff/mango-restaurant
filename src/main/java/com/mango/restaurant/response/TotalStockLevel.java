package com.mango.restaurant.response;

public class TotalStockLevel {
    Float value;

    public TotalStockLevel() {
    }

    public TotalStockLevel(Float totalStockLevel) {
        this.value = totalStockLevel;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
