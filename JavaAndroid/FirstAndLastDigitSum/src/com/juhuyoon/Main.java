package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(234));
        //System.out.println((int) 2/10);
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int firstDigit = 0;
        int lastDigit;


        if(number < 0) {
            return -1;
        }
        lastDigit = number % 10;
        System.out.println(lastDigit);
        while (number != 0) {
            if(number / 10 == 0) {
                firstDigit = number;
                System.out.println(number);
            }
            number /= 10;
            //while the number is not 0,
            //you are going to take the number and divide itself by 10
            //until number / 10 = 0, (which it will happen since it's an int)
            //234 / 10 == 23
            //23 / 10 == 2
            //2 / 10 = 0
            //then firstDigit will store the number.
        }
        //System.out.println(234 / 10);
        sum = firstDigit + lastDigit;
        //which you then take out to firstDigit and add it to lastDigit
        //that you already moduled out.
        return sum;
    }
}


//public class FirstLastDigitSum {
//    public static int sumFirstAndLastDigit(int number)
//    {   int sum = 0;
//        int firstDigit = 0;
//        int lastDigit;
//
//        if(number < 0) {
//            return -1;
//        }
//        lastDigit = number % 10;
//        while(number != 0) {
//            if(number / 10 == 0) {
//                firstDigit = number;
//            }
//            number /= 10;
//        }
//        return sum = firstDigit + lastDigit;
//
//    }
//}
