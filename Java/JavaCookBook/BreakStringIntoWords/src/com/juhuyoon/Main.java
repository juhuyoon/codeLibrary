package com.juhuyoon;
import java.util.StringTokenizer;
//Take a string apart into words or tokens.
public class Main {


    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("testing the token");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        String input = "Testing the Token";
        //Other way to do it without StringTokenizer:
        for(String word : input.split(" ")){
            System.out.println(word);

        }
    }
}