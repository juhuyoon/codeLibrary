package com.juhuyoon;

public class printYearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if(minutes <= 0) {
            System.out.println("Invalid Value");
        } else {
            long days = ((minutes % 525600) / 1440);
            long years = (minutes / 525600);
            System.out.println(minutes + " min = " +
                    years + " y and " +
                    days + " d"
            );
        }
    }
}
