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
    }
}
