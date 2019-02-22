package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(246)); //result = 12;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit;
        if(number < 0) {
            return -1;
        }
            while(number != 0) {
                digit = number % 10;
                if(number % 2 == 0) {
                    sum += digit;
                }
                number /= 10;
            }
        return sum;
    }
}
