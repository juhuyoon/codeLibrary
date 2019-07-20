package com.juhuyoon;
import java.util.Stack;
import java.util.StringTokenizer;


//Reverse a string, a character, or a word at a time.
public class Main {

    public static void main(String[] args) {
        // This is a simple reversal of a simple character of strings
        // 	String sh = "ABCDEFG";
        //	StringBuilder something = new StringBuilder(sh).reverse();
        //        System.out.println(something);

        String s = "Father Charles Goes Down and Ends Battle";
        Stack<String> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens()) {
            String stackers = myStack.push(st.nextToken());
            System.out.println(stackers);
        }

        System.out.println(s + " backwards by word is: \n\t");
        while(!myStack.empty()) {
        System.out.println(myStack.pop());
            System.out.println(' ');
        }
        System.out.println('"');
   }
}
