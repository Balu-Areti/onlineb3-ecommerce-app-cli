package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Customer;

public class CustomerController {

    public void register(Customer customer){
        System.out.println("Customer Controller Register Method called");
        System.out.println("Customer Details: ");
        System.out.println("Name : " + customer.name);
        System.out.println("Email : " + customer.email);
        System.out.println("Password : " + customer.password);
        System.out.println("Phone : " + customer.phone);
        System.out.println("Age : " + customer.age);
        System.out.println("Customer Registered Successfully");
    }
}
