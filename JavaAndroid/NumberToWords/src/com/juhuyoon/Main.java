package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static String numberToWords(int number) {
        if(number >= 0) {
            int reverseNumber = reverse(number);
            int beforeDigits = getDigitCount(number);
            int afterDigits = getDigitCount(reverseNumber);
            int diff = Math.abs(afterDigits - beforeDigits);

            int count;

            if(number == 0) {
                System.out.println("Zero");
            }

            if(number < 0) {
                System.out.println("Invalid Value");
                return;
            }
            String digit = "";
            while (reverseNumber >0) {
                count = reverseNumber % 10;
                if (count == 0) {
                    digit += "Zero";
                } else if (count == 1) {
                    digit += "One";
                } else if (count == 2) {
                    digit += "Two";
                } else if (count == 3) {
                    digit += "Three";
                } else if (count == 4) {
                    digit += "Four";
                } else if (count == 5) {
                    digit += "Five";
                } else if (count == 6) {
                    digit += "Six";
                } else if (count == 7) {
                    digit += "Seven";
                } else if (count == 8) {
                    digit += "Eight";
                } else if (count == 9) {
                    digit += "Nine";
                }
                digit += " ";
                count = (reverseNumber /= 10) % 10;
            }
            System.out.print(digit);
            for(int i=1; i<=diff; i++){
                System.out.print("Zero ");
            }
            System.out.println();


        }

    }

    public static int reverse(int number) {
        int rev = 0;
        int nextNum = number;
        while(nextNum != 0) {
            rev = rev * 10;
            rev += nextNum % 10;
            nextNum /= 10;
        }
        return rev;
    }


    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else if(number == 0 ) {
            return 1;
        }
        int counter = 0;
        while(number != 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }
}
