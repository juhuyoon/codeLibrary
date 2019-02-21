package com.juhuyoon;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if(!(year >= 1 && year <= 9999) ) {
            return false;
        } else if(((year % 4) == 0 && (!((year % 100) == 0))) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int date;
        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } if(month == 2 && isLeapYear(year)) {
            date = 29;
        } else {
            date= 28;
        }
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return date;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}
