package com.mango.restaurant.model;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    Integer id;

    @Column(name = "code", length = 20)
    String code;

    @Column(name = "name", length = 45)
    String name;

    @Column(name = "email", length = 45)
    String email;

    @Column(name = "contact", length = 10)
    String contact;

    public Supplier() {
    }

    public Supplier(Integer id, String code, String name, String email, String contact) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
