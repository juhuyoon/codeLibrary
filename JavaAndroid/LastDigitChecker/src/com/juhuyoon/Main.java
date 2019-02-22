package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

        public static boolean hasSameLastDigit(int one, int two, int three) {
           if(!isValid(one) || !isValid(two) || !isValid(three)) {
               return false;
           }
           one %= 10;
           two %= 10;
           three %= 10;

           return (one == two || two == three || one == three);
        }

        public static boolean isValid(int n) {
        return (n > 9 && n < 1001);
        }
    }

