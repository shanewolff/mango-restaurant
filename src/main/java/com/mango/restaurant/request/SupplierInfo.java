package com.mango.restaurant.request;

import javax.validation.constraints.NotBlank;

public class SupplierInfo {
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    private String email;
    @NotBlank
    private String contact;

    public SupplierInfo() {
    }

    public SupplierInfo(@NotBlank String code, @NotBlank String name, String email, @NotBlank String contact) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
