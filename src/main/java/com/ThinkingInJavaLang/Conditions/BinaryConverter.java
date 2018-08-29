package com.ThinkingInJavaLang.Conditions;

public class BinaryConverter {
    public static void  displayBinary(int value) {
        if (value > 0) {
            //System.out.println(value + "---------");
            displayBinary(value / 2);
            System.out.println(value%2);
        }
    }
    public static void main(String[] args) {
        displayBinary(128);
    }
}
