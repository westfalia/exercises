package com.ThinkingInJavaLang.Conditions;

public class And {
    public static void andOperator(int x) {
        if (x > 0 && x < 10)
            System.out.println("Positive one-digit number.");
    }
    public static void main(String[] args) {
        andOperator(3);
    }
}
