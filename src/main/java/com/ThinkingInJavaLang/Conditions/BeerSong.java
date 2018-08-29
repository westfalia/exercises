package com.ThinkingInJavaLang.Conditions;

public class BeerSong {
    public static void beerSong(int n) {
        if (n == 0) {
            System.out.println("No more bottles of beer on the wall,\n" +
                    " no more bottles of beer. Go to the store and buy some more,\n" +
                    " 99 bottles of beer on the wall. ");
        } else {
            System.out.println(n + " bottles of beer on the wall," + n
                    + " bottles of beer. Take one down and pass it around");
            beerSong(n-1);

        }
    }

    public static void main(String[] args) {
        beerSong(5);
    }
}
