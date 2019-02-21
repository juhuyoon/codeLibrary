package com.juhuyoon;

public class SecondsAndMinutes {

    //final = the value for that method can never be changed.
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";


    public static String getDurationString(int minutes, int seconds) {
        if((minutes >= 0) && (seconds >= 0 || seconds <= 59)) {
           int hour =  ((minutes/60));
           minutes = ((minutes % 60));
                   // + (seconds / 60); when doing it in one method
                   // seconds = (seconds % 60);

            String hoursString = hour + "h";
            if(hour < 10) {
                hoursString = "0" + hoursString;
            }
            String minuteString = minutes + "m";
            if(minutes < 10) {
                minuteString = "0" + minuteString;
            }
            String secondString = seconds + "s";
            if(seconds < 10) {
                secondString = "0" + secondString;
            }
            return hoursString + minuteString + secondString;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {
        if(seconds >=0) {
            int checkMinutes = (seconds / 60);
            int remainingSeconds = (seconds % 60);

            return getDurationString(checkMinutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
