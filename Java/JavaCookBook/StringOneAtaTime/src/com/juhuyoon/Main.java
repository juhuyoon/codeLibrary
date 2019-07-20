package com.juhuyoon;


//Processing the contents of a string one character at a time.
public class Main {

    public static void main(String[] args) {
        String SAMPLE_INPUT = "This is a sentence of strings";
//        for(int i = 0; i < SAMPLE_INPUT.length(); i++) {
//            System.out.println("Char " + i + " is "+ SAMPLE_INPUT.charAt(i));
//        }

        for(char ch: SAMPLE_INPUT.toCharArray()) {
            System.out.println(ch);
        }
    }
}
