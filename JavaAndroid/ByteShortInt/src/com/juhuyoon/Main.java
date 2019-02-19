package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
        //int width = 32;
	    int myMinValue = -2_147_483_647; //you can separate large numbers with underscores.
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte width = 8
        byte myByteValue = 10; //smaller amount of computer space. Can only store between -128 and 127.
        byte myNewByteValue = (byte)(myByteValue/2); //when doing arithmetic, you will make any variable into an integer.
                                //this is casting, treating the arithmetic integer as byte.
        System.out.println("myNewByteValue = " + myNewByteValue);
        //short width = 16
        short myShortValue = 30000; //Store between -32767 and 32767, twice the space of byte, half of int.
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64;
        long myLongValue = 100L; //can store an incredibly large number. L to tell computer it's a long value.

        //these are the four that you would use to work with whole numbers in Java.

        //1. byte
        byte quizByte = 8;
        //2. short
        short quizShort = -16;
        //3. int
        int quizInt = 200;
        //4 Long with variables of long and integer, you DO NOT need to do casting.
        long quizLong = (50000L + 10L * (quizByte + quizShort + quizInt));
        short quizShort2 = (short)(1000 + 10 * (quizByte + quizShort + quizInt));
        System.out.println(quizLong);
        System.out.println(quizShort2);

    }
}
