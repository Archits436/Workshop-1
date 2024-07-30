package com.simpleShoppingCart;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        System.out.println("----------------Welcome to the online shopping system----------------");
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);

        Product laptop = new Electronics("Laptop", 999.99, 1);
        Product phone = new Electronics("Phone", 599.99, 1);
        Product tshirt = new Clothing("T-shirt", 199.99, 3);
        Product pant = new Clothing("Pant", 399.99, 3);

        cart.addProduct(laptop);
        cart.addProduct(phone);
        cart.addProduct(tshirt);
        cart.addProduct((pant));

        System.out.println("Press v to view the cart");
        System.out.println("Press r to remove a product");
        System.out.println("Press c to checkout");
        char choice = sc.nextLine().charAt(0);

        if(choice == 'v') {
            System.out.println("Viewing Cart: ");
            cart.viewCart();
        } else if(choice == 'r') {
            System.out.println("Press 1 to remove Laptop from Cart");
            System.out.println("Press 2 to remove Phone from Cart");
            System.out.println("Press 3 to remove T-shirt from Cart");
            System.out.println("Press 4 to remove Pant from Cart");
            int removeChoice = sc.nextInt();
            switch (removeChoice) {
                case 1:
                    cart.removeProduct(laptop);
                    break;
                case 2:
                    cart.removeProduct(phone);
                    break;
                case 3:
                    cart.removeProduct(tshirt);
                    break;
                case 4:
                    cart.removeProduct(pant);
            }
            System.out.println("Product removed successfully !");
        } else if(choice == 'c') {
            System.out.println("Checking out...");
            cart.checkout();
        } else {
            System.out.println("Please enter a valid choice");
        }
    }
}
