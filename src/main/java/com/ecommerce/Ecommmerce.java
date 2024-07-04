/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ecommerce;

/**
 *
 * @author angel
 */
import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.ecommerce.orders.Order;

public class Ecommmerce {

    private static List<Product> products = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    addCustomer(scanner);
                    break;
                case 3:
                    placeOrder(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nE-commerce Menu:");
        System.out.println("1. Add Product");
        System.out.println("2. Add Customer");
        System.out.println("3. Place Order");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addProduct(Scanner scanner) {
        System.out.println("\nEnter product details:");
        System.out.print("Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Description: ");
        String description = scanner.nextLine();

        Product product = new Product(productID, name, price, description);
        products.add(product);
        System.out.println("Product added successfully!");
    }

    private static void addCustomer(Scanner scanner) {
        System.out.println("\nEnter customer details:");
        System.out.print("Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String customerName = scanner.nextLine();

        Customer customer = new Customer(customerID, customerName);
        customers.add(customer);
        System.out.println("Customer added successfully!");
    }

    private static void placeOrder(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Customer customer = findCustomer(customerID);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.print("Enter Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product product = findProduct(productID);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        customer.addToCart(product);
        Order order = customer.placeOrder();
        System.out.println("\nOrder Summary:");
        order.generateSummary();
    }

    private static Customer findCustomer(int customerID) {
        for (Customer c : customers) {
            if (c.getCustomerID() == customerID) {
                return c;
            }
        }
        return null;
    }

    private static Product findProduct(int productID) {
        for (Product p : products) {
            if (p.getProductID() == productID) {
                return p;
            }
        }
        return null;
    }
}