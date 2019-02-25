package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if(bigCount >= 0 && smallCount >= 00 && goal >= 0) {
            int sum = (bigCount * 5) + smallCount;
            int remainder = goal % 5;

            if(sum >= goal && remainder <= smallCount){
                return true;
            }

        }

        return false;
    }

}
