package com.simpleShoppingCart;

abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - Qty: " + quantity;
    }
}

class Electronics extends Product {
    public Electronics(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price, int quantity) {
        super(name, price, quantity);
    }
}