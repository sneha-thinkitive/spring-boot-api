package com.kafka.model;


import java.io.Serializable;

public class Customer implements  Serializable {
    private String id;
    private String name;
    private String email;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email="
                + email + ", phone=" + phone + " ]";
    }
}
