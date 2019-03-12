package com.juhuyoon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //LinkedList determines the index's position in physical memory
        //by address, taking index * 4 + 100 for the position.
        //integer = 4 bytes of memory while double = 8 bytes.

        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; //setting to customer class, overriding customer to anotherCustomer.
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);
        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));

            //LinkedLists are alternatives to arrays, and
            //stores actual link to the next item as well as the data.

        }
    }
}
