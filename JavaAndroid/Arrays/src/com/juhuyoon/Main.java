package com.juhuyoon;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); //type input into consle and get it back in program.


    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5); //create a method, type in five numbers, get in form of an array.
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i] );
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number ){
        System.out.println("Enter " + number + "integer values. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
     }

     public static double getAverage(int[] array ) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
     }



//        int[] myIntArray = new int[10]; //this is not a regular variable, but an array.
                            //10 elements max in the array of 0 ~ 9
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//         myIntArray[5] = 50; //50 at position 6, since index starts at 0.
       //int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);
//
//        int[] myIntArray = new int[25];
//        for(int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i* 10;
//        }
//
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array) {
//        for(int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
}

