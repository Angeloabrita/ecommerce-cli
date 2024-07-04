/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce;

/**
 *
 * @author angel
 */
public class Product {
    private int productID;
    private String name;
    private double price;
    private String description; // Add a description

    // Constructor
    public Product(int productID, String name, double price, String description) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters
    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Other methods (if needed)
    @Override
    public String toString() {
        return "Product{" +
               "productID=" + productID +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", description='" + description + '\'' +
               '}';
    }
}
