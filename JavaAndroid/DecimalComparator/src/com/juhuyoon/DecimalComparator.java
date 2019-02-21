package com.juhuyoon;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number, double number2) {
        return (long)(number * 1000) == (long) (number2 * 1000);
    }
}
