package com.MyslWJezykuJava.VariablesOperators;

public class Time {
    public static void main(String[] args) {
        double hour = 23.0;
        double min = 2.0;
        double second = 15.0;
        double fromMidnight = ((hour*60*60)+(min*60)+second);
        double dayTime = (24*60*60);
        System.out.println("Liczba sekund, które upłynely od północy: " + fromMidnight);
        System.out.println("Liczba sekund które pozostały do końca dnia: " + (dayTime-fromMidnight));
        System.out.println("Odsetek dnia: " + ((fromMidnight/dayTime)*100) + " %");

        hour = 23.0;
        min = 19.0;
        second = 25.0;
        double fromMidnightNext = ((hour*60*60)+(min*60)+second);
        System.out.printf("zadanie zajelo: sout" + (fromMidnightNext-fromMidnight)/60+ " min");
        System.out.printf("trzy czwrte = %.3f\n", 4.0/3.0);
        int x = 15;
        System.out.println("Dzielenie: "+ (x%100));
    }
}
