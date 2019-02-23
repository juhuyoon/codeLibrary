package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        if(number > 0) {
            for (int i = 1; i < number; i++) {
                if (((number % i) == 0)) {
                    sum += i;
                }
            }
            return number == sum;
        }
        return false;
    }
    }
