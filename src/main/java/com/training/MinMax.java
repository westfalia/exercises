package com.training;

public class MinMax {
    public static void main(String[] args) {

        int[] tab = {-1000, 2, 8, 11, 34, 76, 98};

        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length ; i++) {
            if (tab[i] > max){
                max = tab[i];
            }
            if (tab[i] < min){
                min = tab[i];
            }
        }
        System.out.println("min:" + min);
        System.out.println("max: " + max);

    }
}
