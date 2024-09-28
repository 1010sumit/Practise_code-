package org.example.sumit;

public class Swap_using_2variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap logic
        b = b + a;  // Now b is 30, a is 10
        a = b - a;  // Now a is 20, b is 30
        b = b - a;  // Now b is 10, a is 20

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
