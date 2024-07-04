/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce;

/**
 *
 * @author angel
 */
import com.ecommerce.orders.Order;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;
    
    private static int nextOrderID = 1;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Shopping Cart Methods
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public void clearCart() {
        shoppingCart.clear();
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Calculation Methods
    public double calculateTotal() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Order Placement (assuming a simple order process)
    public Order placeOrder() {
        // Create a new Order object using the shopping cart contents
        Order order = new Order(nextOrderID++, this, shoppingCart);
        clearCart();
        return order;
    }

    // Getters and Setters
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "customerID=" + customerID +
               ", name='" + name + '\'' +
               '}';
    }
}
