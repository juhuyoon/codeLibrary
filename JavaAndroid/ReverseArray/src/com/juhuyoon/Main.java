package com.juhuyoon;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = { 1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
