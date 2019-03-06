package com.juhuyoon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        //reference holds a reference or address an object, but NOT an object.

        int[] anotherArray = myIntArray; //two references pointing to the same variable.

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        //both of the array variables change.
        System.out.println("after myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("after  modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after  modify anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] { 1,2,3,4,5};
    }
}
