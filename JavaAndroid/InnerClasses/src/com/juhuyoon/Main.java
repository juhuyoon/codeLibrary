package com.juhuyoon;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //you can nest classes in classes.
        //static nested classes
        //nonstatic nested classes (inner class)
        //local class = inner class defined inside a scope
        //anonymous class = nested class without a class name.

//        Gearbox cars = new Gearbox(6);
//        Gearbox.Gear first = cars.new Gear(1, 12.3);
//        Gearbox.Gear second = cars.new Gear(2, 15.4);
//        Gearbox.Gear third = cars.new Gear(3, 17.8);
//        System.out.println(first.driveSpeed(1000));

        Gearbox cars = new Gearbox(6);
        cars.addGear(1, 5.3);
        cars.addGear(2, 10.6);
        cars.addGear(3, 15.9);
        cars.operateClutch(true);
        cars.changeGear(1);
        cars.operateClutch(false);
        System.out.println(cars.wheelSpeed(1000));
        cars.changeGear(2);
        System.out.println(cars.wheelSpeed(3000));
        cars.operateClutch(true);
        cars.changeGear(3);
        cars.operateClutch(false);
        System.out.println(cars.wheelSpeed(6000));
    }
}
