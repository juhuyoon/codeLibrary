package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        int prime = 1;
        while(prime <= number) {
            prime++;
            while(number % prime == 0) {
                number /= prime;
            }
        }
        return prime;
    }
}
