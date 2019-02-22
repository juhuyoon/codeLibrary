package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;

            while(number > 0) {
                //extract least significant digit
                int digit = number % 10;
                sum += digit;
                System.out.println(digit);

                //goes from 123 % 10 = 3
                //to 12 % 10 = 2
                //to finally 1 % 10 = 1;

                //drop least significant digit
                number /= 10; //same as number = number / 10;
                //System.out.println(number);
            }
            return sum;
        }
        return -1;
    }
}

//125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5 //to get least significant digit