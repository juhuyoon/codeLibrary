package com.juhuyoon;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;


    //inheritance is a IS - A relationship
    //Composition is a HAS - A relationship //parts of a greater whole
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
