package com.juhuyoon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //can type input into the console that will return back to the program
        //with System.in
        //Scanner = one of Java's built in classes.
        //new = brand new instance of scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); //checks to see if next input is an integer.
        //however it will not remove it from the scanner. If it doesn't qualify, method will remove false.

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt(); //will parse the string into an integer with nextInt.
            scanner.nextLine(); //handle next line character of enter key.

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are: " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }


        //to save memory, close after usage.
        scanner.close();
    }
}
