package com.ThinkingInJavaLang.Conditions;

public class NewLine {
    public static void newLine(int n) {
        if (n > 0) {
            System.out.println("-");
            newLine(n - 1);
        }
    }

    public static void main(String[] args) {
        newLine(4);
    }
}
