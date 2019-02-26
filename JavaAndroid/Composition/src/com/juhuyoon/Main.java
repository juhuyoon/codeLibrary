package com.juhuyoon;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27 inch", "Acer", 27, new Resolution(2540, 1440)); //instance of a class without a variable created
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Jung's Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
