package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count Value is " + count);
//            count++;
//        }
//        for(count = 1; count != 7; count++) {
//            System.out.println("Count Value is " + count);
//        }
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);
//     }

        int number = 4;
        int finishNumber = 20;
        int count = 0;
//        int sum = 0;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            if(count >= 5) {
                break;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total number of even numbers found: " + count);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
