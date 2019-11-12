package com.example.Google;

import java.util.Stack;

    public class Kitchen {
        private Stack<Stack> sink;

        public Kitchen() {
            sink = new Stack<Stack>();
            sink.push(createNewStack());
        }

        public Stack<Stack> getSink() {
            return sink;
        }

        public void setSink(Stack<Stack> sink) {
            this.sink = sink;
        }
        private static Stack createNewStack() {
            return new Stack<String>();
        }

        // handle remving dish and stack if appicalble
        public String pop() {
            if(sink.size() > 0) {
                // check current stack size
                int currentStackSize = sink.peek().size();
                // if more then 1 remove
                if(currentStackSize > 0) {
                    return (String) sink.peek().pop();
                } else {
                    // if 0, remove entire stack
                    return String.valueOf(sink.pop());
                }
            } else {
                return "No Stacks";
            }
        }

        public void push(String str) {
            if(checkStack()) {
                Stack currentStack = sink.peek();
                currentStack.push(str);
            } else {
                sink.push(createNewStack());
                sink.peek().push(str);
            }
        }

        public boolean checkStack() {
            Stack currentStack = sink.peek();

            return currentStack.size() < 5;

        }

        @Override
        public String toString() {
            return "Kitchen{" +
                    "kitchen=" + sink.size() +
                    " and currentStack size" + sink.peek().size() +
                    '}';
        }

        public static void main(String[] args) {
            Kitchen kitchen = new Kitchen();

            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");
            kitchen.push("one");

            System.out.println(kitchen.toString());

            kitchen.pop();
            kitchen.pop();
            kitchen.pop();
            kitchen.pop();
            kitchen.pop();
            kitchen.pop();
            kitchen.pop();
            kitchen.pop();

            System.out.println(kitchen.toString());
        }
    }
