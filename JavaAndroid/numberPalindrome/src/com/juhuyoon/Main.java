package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isPalindrome(int number){
        //palindrome = reverse of number is the same as when it's normal
        //example: 1221
        int numberCopy = number;
        int reverse = 0;
        int lastDigit;

        while(numberCopy != 0) {
            lastDigit = numberCopy % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            numberCopy /= 10;
        }

        if(reverse == number) {
            return true;
        } else {
            return false;
        }

    }

}
