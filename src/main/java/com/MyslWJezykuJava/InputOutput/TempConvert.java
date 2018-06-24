package com.MyslWJezykuJava.InputOutput;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enther the celsius temperature: ");
        double celsiusTemp = in.nextDouble();

        double fahrenheitTemp = ((celsiusTemp*9/5)+32);
        System.out.println(fahrenheitTemp);
        System.out.printf("%.1f C = %.1f F", celsiusTemp, fahrenheitTemp);

    }
}
