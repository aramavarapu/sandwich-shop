package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sandwich Sizes: ");
        System.out.println("(1) Regular - $5.45");
        System.out.println("(2) Large - $8.95");
        System.out.println("Please select a size: ");
        int sizeOfSandwich = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        double price;
        double loadedPrice;
        if (sizeOfSandwich == 1) {
            price = 5.45;
            loadedPrice = 1.00;
        } else if (sizeOfSandwich == 2) {
            price = 8.95;
            loadedPrice = 1.75;
        } else {
            System.out.println("Number is not 1 or 2 please pick again.");
            return;
        }

        System.out.println("Would you like your sandwich to be loaded?");
        String loadedResponse = scanner.nextLine();

        if (loadedResponse.equalsIgnoreCase("yes")) {
            price = price + loadedPrice;
        }
        double discount;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        } else {
            discount = 0.0;
        }
        double discountedPrice = price * discount;
        double finalCost = price - discountedPrice;

        System.out.printf("Your sandwich costs: $%.2f%n", finalCost);


        }
    }

