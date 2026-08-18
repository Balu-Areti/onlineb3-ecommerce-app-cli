package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerUI {

    //Registration form
    public void registerForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, Welcome to EBuy App");
        System.out.println("Please enter your details");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        System.out.println("Enter your phone number:");
        String phone = scanner.nextLine();
        System.out.println("Enter your age:");
        byte age = scanner.nextByte();
        Customer customer = new Customer(name, email, password, phone, (byte)age);
        CustomerController customerController = new CustomerController();
        customerController.register(customer);
    }
}
