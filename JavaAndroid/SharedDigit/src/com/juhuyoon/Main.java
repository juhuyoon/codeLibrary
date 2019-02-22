package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }
    public static boolean hasSharedDigit(int one, int two) {
        if((one <= 10 || one >= 99) ||((two <= 10 || one >= 99))) {
            return false;
        }
        int digitOne = one % 10;
        int digitDOne = one / 10;
        int digitTwo = two % 10;
        int digitDTwo = two / 10;
        if((digitOne == digitTwo || digitDOne == digitDTwo) ||
                (digitDOne == digitTwo) || (digitDTwo == digitOne)){
            return true;
        }
        return false;
    }
}
