package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1,3));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        int commonDivisor = 0;
        if(first < 10 || second < 10) {
            return -1;
        } else {
            for(int i = 1; i <= first; i++) {
                if(((first%i) == 0) && ((second % i) == 0)) {
                    commonDivisor = i;
                }
            }
        }
        return commonDivisor;
    }
}
