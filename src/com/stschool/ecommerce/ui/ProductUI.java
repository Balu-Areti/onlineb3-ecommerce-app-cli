package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.controller.ProductController;
import com.stschool.ecommerce.model.Product;

import java.util.Scanner;

public class ProductUI {

    // Method to take input and send to controller
    public void addProductForm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🛒 Welcome to Seller Dashboard - Add a New Product");

        System.out.println("Enter Product Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Description:");
        String description = scanner.nextLine();

        System.out.println("Enter Max Retail Price (e.g., 999.99):");
        double maxRetailPrice = scanner.nextDouble();

        System.out.println("Enter Discount Percentage (e.g., 15.5):");
        double discountPercentage = scanner.nextDouble();

        // Consume the leftover newline after reading doubles
        scanner.nextLine();

        System.out.println("Enter Company Name:");
        String company = scanner.nextLine();

        System.out.println("Enter Category:");
        String category = scanner.nextLine();

        System.out.println("Enter Rating (e.g., 4.5):");
        double rating = scanner.nextDouble();

        System.out.println("Enter Reviews Count (e.g., 120):");
        int reviewsCount = scanner.nextInt();


        Product product = new Product(name, description, maxRetailPrice, discountPercentage, company, category, rating, reviewsCount);

        // Pass to Controller
        ProductController productController = new ProductController();
        productController.addProduct(product);
    }
}