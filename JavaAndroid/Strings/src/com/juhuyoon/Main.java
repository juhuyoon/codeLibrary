package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
    //total data types: byte, short, int, long, float, double, char, boolean
        //special ninth data type (String) not considered primitive data type. String is a CLASS.

        String myString = "This is a string";
        System.out.println(myString);

    String numberString = "250.55";
    numberString = numberString + "49.95";
    System.out.println("The result is " + numberString ); //this will add the numbers together as they are stored as strings.

    String lastString = "10";
    int myInt = 50;
    int newInt = 60;
    lastString = lastString + (myInt + newInt);
    System.out.println("LastString is equal to " + lastString);
    //returns 1050, because lastString is still wanting a string so myInt is not treated as a number.

    }
}
