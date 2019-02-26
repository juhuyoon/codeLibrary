package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car(); //starting a new instance of class.
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }
}
