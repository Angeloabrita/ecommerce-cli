/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.orders;

/**
 *
 * @author angel
 */

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;
    private String status; // e.g., "Pending", "Shipped", "Delivered"

    // Constructor
    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = customer.calculateTotal();
        this.status = "Pending";
    }

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }

    // Other Methods
    public void generateSummary() {
        System.out.println("Order Summary:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ( $" + product.getPrice() + ")");
        }
        System.out.println("Total: $" + orderTotal);
        System.out.println("Status: " + status);
    }

    @Override
    public String toString() {
        return "Order{" +
               "orderID=" + orderID +
               ", customer=" + customer +
               ", products=" + products +
               ", orderTotal=" + orderTotal +
               ", status='" + status + '\'' +
               '}';
    }
}
