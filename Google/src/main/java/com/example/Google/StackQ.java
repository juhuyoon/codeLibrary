package com.example.Google;

import java.util.Stack;

public class StackQ {

    static Stack<Stack> outerStack = new Stack<>();

    static Stack<Integer> innerStack = new Stack<>();

    public static void addToInnerStack(Integer num) {
        if(innerStack.size() <= 5) {
            innerStack.push(num);
        } else {
            Stack<Integer> newStack = new Stack<>();
            newStack.push(num);
        }
    }

    public static void popOutFromInnerStack() {
        innerStack.pop();
    }

    public static void returnOuterStack() {
        outerStack.push(innerStack);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 15; i++) {
            addToInnerStack(i);
        }

        System.out.println();

    }

}
