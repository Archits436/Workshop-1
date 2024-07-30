package com.simpleShoppingCart;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void viewCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void checkout() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty. Add items before checking out.");
        } else {
            System.out.println("Order Summary:");
            viewCart();
            System.out.println("Total Price: $" + getTotalPrice());
            products.clear();
            System.out.println("Thank you for your purchase!");
        }
    }
}