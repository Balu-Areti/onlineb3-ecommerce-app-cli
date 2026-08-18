package com.stschool.ecommerce.model;

public class Customer {
    public String name;
    public String email;
    public String password;
    public String phone;
    public byte age;

    public Customer(String name, String email, String password,  String phone, byte age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.age = age;
    }
}
