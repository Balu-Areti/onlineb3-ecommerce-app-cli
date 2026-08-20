package com.stschool.ecommerce.controller;

import com.stschool.ecommerce.model.Product;

public class ProductController {
    public void addProduct(Product product) {
        System.out.println("Printing Product Details:");
        System.out.println("Name               : " + product.name);
        System.out.println("Description        : " + product.description);
        System.out.println("Max Retail Price   : ₹" + product.maxRetailPrice);
        System.out.println("Discount %         : " + product.discountPercentage);
        System.out.println("Company            : " + product.company);
        System.out.println("Category           : " + product.category);
        System.out.println("Rating             : " + product.rating);
        System.out.println("Reviews Count      : " + product.reviewsCount);
        System.out.println("Product Added Successfully");

    }
}
