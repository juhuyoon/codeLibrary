package com.juhuyoon;

import java.lang.reflect.Array;
import java.util.ArrayList;


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>(); Runs into issues here as int is a primitive type.
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //taking the value of i as a primitive type
            //and then converting it to Integer class.
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " ->" + intArray.get(i).intValue());
        }
    }
}
