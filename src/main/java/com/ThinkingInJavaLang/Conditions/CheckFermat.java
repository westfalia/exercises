package com.ThinkingInJavaLang.Conditions;

public class CheckFermat {
    public static void checkFermat(int a, int b, int c, int n) {
        int qwe = b;

        if (((Math.pow(a,n)+Math.pow(b,n)) == Math.pow(c,n)) && n > 2) {
            System.out.println("Damn, Fermat was wrong.");
        } else {
            System.out.println("No, it doesn't work");
        }

    }

    public static void main(String[] args) {
        checkFermat(1,2,3,2);
    }
}
