package com.MyslWJezykuJava.InputOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        Scanner in = new Scanner(System.in);

        System.out.println("I think about number between 1 and 100");
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Your propose is: " + num);
        System.out.println("I thought about number: " + number);
        System.out.println("You made mistake about: " + (num - number));


    }
}
