package com.juhuyoon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {

            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {

                int number = scanner.nextInt();

                if(first) { //check if first is set to true,
                    first = false;  //then set first to false
                    min = number; // then the min will be set to number
                    max = number; //AND the max will be set to number
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
