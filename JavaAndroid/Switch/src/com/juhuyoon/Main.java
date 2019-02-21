package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println(("Value was 2"));
//        } else {
//            System.out.println(("Was not 1 or 2"));
//        }

        //can use byte, short, char, int for primitive data types.
        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.printf("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4 or a 5");
                System.out.println("Actually, it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break; //technically NOT needed.
        }

        //More code here for switch

        char charValue =  'A';
        switch(charValue) {
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Char was B");
                break;
            case 'C':
                System.out.println("Char was C");
                break;
            case 'D':
                System.out.println("Char was D");
                break;
            case 'E':
                System.out.println("Char was E");
                break;
            default:
                System.out.println("None was found");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) { //so that all the characters accepted will be lowercase.
            case "january":
                System.out.println("January");
                break;
            case "august":
                System.out.println("August");
                break;
            default:
                System.out.println("It's Not important");
                break;
        }


    }
}
