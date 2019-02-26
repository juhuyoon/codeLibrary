package com.juhuyoon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double counter = 0;
        double avg = 0;

        while(true) {
            System.out.println("");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                counter++;
                int num = scanner.nextInt();
                sum += num;
                avg = (sum / counter);
                avg = Math.round(avg);
            } else {
                System.out.println("\nSUM = " + (int)sum + " AVG = " + (int)avg);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
