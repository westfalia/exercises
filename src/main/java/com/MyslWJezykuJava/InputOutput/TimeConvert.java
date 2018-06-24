package com.MyslWJezykuJava.InputOutput;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        //seconds to hour/min/sec
        int hour, minute, second;
        final int SEC_IN_HOUR = 3600;
        final int SEC_IN_MINUTE = 60;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the value of seconds: ");
        int sec = in.nextInt();

        //converting...
        hour = sec/SEC_IN_HOUR;
        minute = (sec % SEC_IN_HOUR)/SEC_IN_MINUTE;
        second = sec % SEC_IN_MINUTE;
        System.out.printf("%d second = %d hour, %d minutes, and %d seconds\n",sec,hour,minute,second);
    }
}
