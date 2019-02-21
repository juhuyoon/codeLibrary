package com.juhuyoon;

public class isPrime {
    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            //System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }


}
