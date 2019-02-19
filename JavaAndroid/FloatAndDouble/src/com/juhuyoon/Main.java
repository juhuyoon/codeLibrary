package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        //float and double differences is based on the precision of the decimals.
        //width integer = 32 (4bytes) ;
        int myIntValue = 5 /3;
        //width float = 16 (4 bytes);
        float myFloatValue = 5f / 3f; //if it's float, you want to put f to show it's float.
        //width double = 64 (8 bytes) Note that doubles are much faster and more precise in modern day computers.
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Converting given number of pounds to kilograms

        double pound = 200;
        double kilograms = 0.45359237d;
        double conversion = (pound * kilograms);

        System.out.println(conversion);
    }
}
