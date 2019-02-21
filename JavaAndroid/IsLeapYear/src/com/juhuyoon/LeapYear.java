package com.juhuyoon;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year >= 9999) {
            return false;
        } else if(((year % 4) == 0) && ((year % 100) == 0)
                    && ((year % 400)) == 0 ) {
            return true;
        } else if((year%4) == 0 && ((year %100)) != 0){
            return true;
        }
        return false;
    }
}
