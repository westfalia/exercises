package com.ThinkingInJavaLang.Conditions;

import java.util.Scanner;

public class PrintLogaritm {
    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("Logarithm x is: " + result);
    }
    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");

        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number.");
        }
        double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Running!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void main(String[] args) {
        scanDouble();
        System.out.println("Coountdooooown: ");
        countdown(4);
    }
}
