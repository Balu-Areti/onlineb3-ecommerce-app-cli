package com.stschool.ecommerce.model;

public class Product {
    public String name;
    public String description;
    public double maxRetailPrice;
    public double discountPercentage;
    public String company;
    public String category;
    public double rating;
    public int reviewsCount;


    public Product(String name, String description, double maxRetailPrice, double discountPercentage, String company, String category, double rating, int reviewsCount) {
        this.name = name;
        this.description = description;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.company = company;
        this.category = category;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
    }
}
