package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.00"; //must be numbers, or will be an error
        System.out.println("numberAsString= " + numberAsString);

        //int number = Integer.parseInt(numberAsString);

        double number = Double.parseDouble(numberAsString);
        //Integer = wrapper class for int.
        //contains static methods such as parseInt
        //will convert the string as an integer
        //if it fails, will get an error.
        System.out.println(number);

        numberAsString += 1; //this will make the number 1 into a string
        number += 1; //this will treat it as a number Int so will add on.
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
